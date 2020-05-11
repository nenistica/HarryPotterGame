package app.personajes;

import java.util.List;

import app.JuegoHP;
import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.poderes.hechizos.ataques.HechizoAtaque;

public class Elfo extends Criatura implements IHaceMagia {
    // Atributos y Lista Hechizo
    private Artefacto artefacto;
    public List<Hechizo> hechizo;
    private int energiaMagica;
    private Poder poderInicial;

    // Constructor de Elfo
    public Elfo(String nombre, int salud, int edad, int energiaMagica, List<Hechizo> hechizo) {
        super(nombre, salud, edad);
        this.energiaMagica = energiaMagica;
        this.hechizo = hechizo;
    }

    // Getters & Setters
    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

    public List<Hechizo> getHechizo() {
        return hechizo;
    }

    public void setHechizo(List<Hechizo> hechizo) {
        this.hechizo = hechizo;
    }

    // Override de IHaceMagia
    @Override
    public int getEnergiaMagica() {
        return energiaMagica;

    }

    @Override
    public void setEnergiaMagica(int energiamagica) {
        this.energiaMagica = energiamagica;

    }

    @Override
    public Poder getPoderInicial() {
        return poderInicial;
    }

    @Override
    public Artefacto getArtefacto() {
        return artefacto;
    }

    // Si el hechizo h no está en la lista hechizo individual del Elfo, entonces se
    // le agrega a la misma lista.
    @Override
    public void aprender(Hechizo h) {
        if (!hechizo.contains(h)) {
            this.hechizo.add(h);
        }

    }

    // Metodo Atacar: El personaje que recibe al método es la víctima a quien se le
    // va a lanzar el hechizo, quien también recibe.
    // Lo que hace el método es restarle a la salud de la víctima el daño del
    // hechizo y luego setearle esa salud a la víctima.
    // Si el hechizo tiene curación, entonces se le incrementa la salud al atacante,
    // que sería el Elfo.
    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {
        // Chequeamos si el Elfo tiene suficiente energía mágica para realizar el
        // hechizo.
        if (this.energiaMagica >= hechizo.energiaMagicaHechizo) {
            this.energiaMagica -= hechizo.energiaMagicaHechizo;
            double saludVictima = (double) personaje.getSalud();
            if (personaje instanceof Wizard) {
                Artefacto artefactoVictima = ((IHaceMagia) personaje).getArtefacto();
                saludVictima -= (hechizo.nivelDanio) * (1 - artefactoVictima.amplificadorDeCuracion);
            } else {// si es muggle o elfo
                saludVictima -= (hechizo.nivelDanio);
            }
            if (saludVictima >= 0) {
                personaje.setSalud((int) saludVictima);
            } else {
                personaje.setSalud(0);
            }
            double saludAtacante = (double) this.getSalud();
            saludAtacante += hechizo.nivelCuracion;
            if (saludAtacante <= 100) {
                this.setSalud((int) saludAtacante);
            } else {
                this.setSalud(100);
            }
        }

    }

    // Pasa el String a hechizo y luego llama al método de arriba, que es atacar.
    @Override
    public void atacar(Personaje personaje, String hechizo) {
        for (HechizoAtaque hechizoAtaque : JuegoHP.HechizosAtaque) {
            if (hechizo.equalsIgnoreCase(hechizoAtaque.nombrePoder)) {
                atacar(personaje, hechizoAtaque);
            }

        }

        for (Hechizo HechizosDefensayCur : JuegoHP.HechizosDefensayCuracion) {
            if (hechizo.equalsIgnoreCase(HechizosDefensayCur.nombrePoder)) {
                atacar(personaje, HechizosDefensayCur);
            }

        }

    }

    @Override
    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;
    }

}
