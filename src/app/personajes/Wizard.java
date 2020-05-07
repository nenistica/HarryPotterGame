package app.personajes;

import java.util.List;
import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.transportes.Escoba;

public class Wizard extends Persona implements IHaceMagia {

    private int energiaMagica;
    public List<Hechizo> hechizo;
    Escoba escoba;
    private Poder poderInicial;
    private Artefacto artefacto;
    boolean magoOscuro;

    public Wizard(String nombre, int salud, int edad, int energiaMagica, boolean magoOscuro,List<Hechizo> hechizo) {
        super(nombre, salud, edad);
        this.energiaMagica = energiaMagica;
        this.hechizo = hechizo;
        this.magoOscuro = magoOscuro;

    }

    @Override
    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

    public Poder getPoderInicial() {
        return poderInicial;
    }

    public Artefacto getArtefacto() {
        return artefacto;
    }

    @Override
    public void atacar(Personaje personaje, String hechizo) {

    }

    @Override
    public int getEnergiaMagica() {

        return energiaMagica;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;

    }

    @Override
    public void aprender(Hechizo h) {
        if (!hechizo.contains(h)) {
           this.hechizo.add(h); 
        }
        

    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {
        // buscar el nivelDanio de hechizo y se lo resta a la salud de personaje
        if (this.getEnergiaMagica() >= hechizo.energiaMagicaHechizo) { //DA ERROR NULL
            
            int energiaMagicaPlayer = this.getEnergiaMagica();
            energiaMagicaPlayer -= hechizo.energiaMagicaHechizo;
            this.setEnergiaMagica(energiaMagicaPlayer);

            if ((this.magoOscuro == false) && (hechizo.esOscuro == true)) {

                this.magoOscuro = true;
                double saludVictima = (double) personaje.getSalud();
                saludVictima -= (2*(hechizo.nivelDanio)*(1+this.artefacto.amplificadorDeDanio));
                personaje.setSalud((int) saludVictima);
                double saludAtacante = (double) this.getSalud();
                saludAtacante += (2*(hechizo.nivelCuracion)*(1+this.artefacto.amplificadorDeCuracion));
                this.setSalud((int) saludAtacante);
    
            } else {

                double saludVictima = (double) personaje.getSalud();
                saludVictima -= (hechizo.nivelDanio)*(1+this.artefacto.amplificadorDeDanio);
                int salud1 = (int) saludVictima;
                personaje.setSalud(salud1);
                double saludAtacante = (double) this.getSalud();
                saludAtacante += (hechizo.nivelCuracion)*(1+this.artefacto.amplificadorDeCuracion);
                this.setSalud((int) saludAtacante);

            }
        }else{
            System.out.println("No tienes suficiente energia mágica para realizar el hechizo.");
        }
    }
}
