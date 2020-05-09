package app.personajes;

import java.util.List;

import app.JuegoHP;
import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.poderes.hechizos.ataques.HechizoAtaque;
import app.transportes.Escoba;

public class Wizard extends Persona implements IHaceMagia {

    private int energiaMagica;
    public List<Hechizo> hechizo;
    public Escoba escoba;
    private Poder poderInicial;
    private Artefacto artefacto;
    public boolean magoOscuro;

    public Wizard(String nombre, int salud, int edad, int energiaMagica, boolean magoOscuro, List<Hechizo> hechizo,
            Escoba escoba) {
        super(nombre, salud, edad);
        this.energiaMagica = energiaMagica;
        this.hechizo = hechizo;
        this.magoOscuro = magoOscuro;
        this.escoba = escoba;
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
        for (HechizoAtaque hechizoAtaque : JuegoHP.HechizosAtaque) {
            if (hechizo.equalsIgnoreCase(hechizoAtaque.nombrePoder)) {
                atacar(personaje,hechizoAtaque);
            }

        }

        for (Hechizo HechizosDefensayCur : JuegoHP.HechizosDefensayCuracion) {
            if (hechizo.equalsIgnoreCase(HechizosDefensayCur.nombrePoder)) {
                atacar(personaje,HechizosDefensayCur);
            }

        }

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
                if ( personaje instanceof Wizard){
                    Artefacto artefactoVictima = ((IHaceMagia) personaje).getArtefacto();
                    saludVictima -= (2*(hechizo.nivelDanio)*(1+this.artefacto.amplificadorDeDanio))*(1-artefactoVictima.amplificadorDeCuracion);
                } else{
                    saludVictima -= (2*(hechizo.nivelDanio)*(1+this.artefacto.amplificadorDeDanio));
                }
                if (saludVictima >= 0){
                    personaje.setSalud((int) saludVictima);
                } else{
                    personaje.setSalud(0);
                }
                double saludAtacante = (double) this.getSalud();
                saludAtacante += (2*(hechizo.nivelCuracion)*(1+this.artefacto.amplificadorDeCuracion));
                if (saludAtacante <= 100) {
                  this.setSalud((int) saludAtacante);  
                }else{
                    this.setSalud(100);
                }
                
    
            } else {

                double saludVictima = (double) personaje.getSalud();
                if ( personaje instanceof Wizard){
                    Artefacto artefactoVictima = ((IHaceMagia) personaje).getArtefacto();
                    saludVictima -= (hechizo.nivelDanio)*(1+this.artefacto.amplificadorDeDanio)*(1-artefactoVictima.amplificadorDeCuracion);
                } else{
                    saludVictima -= (hechizo.nivelDanio)*(1+this.artefacto.amplificadorDeDanio);
                }
                if (saludVictima >= 0){
                    personaje.setSalud((int) saludVictima);
                } else{
                    personaje.setSalud(0);
                }
                double saludAtacante = (double) this.getSalud();
                saludAtacante += (hechizo.nivelCuracion)*(1+this.artefacto.amplificadorDeCuracion);
                this.setSalud((int) saludAtacante);
                if (saludAtacante <= 100) {
                    this.setSalud((int) saludAtacante);  
                  }else{
                      this.setSalud(100);
                  }

            }
        }else{
            System.out.println("No tienes suficiente energia mágica para realizar el hechizo.");
        }
    }
}
