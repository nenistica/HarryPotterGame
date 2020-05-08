package app.personajes;

import java.util.List;

import app.JuegoHP;
import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.poderes.hechizos.ataques.HechizoAtaque;

public class Elfo extends Criatura implements IHaceMagia {
    //Attr
    private Artefacto artefacto;
    public List<Hechizo> hechizo;
    private int energiaMagica;
    private Poder poderInicial;

    public Elfo(String nombre, int salud, int edad, int energiaMagica,List<Hechizo> hechizo) {
        super(nombre,salud,edad);
        this.energiaMagica = energiaMagica;
        this.hechizo = hechizo;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

    public List<Hechizo> getHechizo() {
        return hechizo;
    }

    public void setHechizo(List<Hechizo> hechizo) {
        this.hechizo = hechizo;
    }

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

    @Override
    public void aprender(Hechizo h) {
        if (!hechizo.contains(h)) {
            this.hechizo.add(h); 
         }

    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {
        // busca el nivelDanio de hechizo y se lo resta a la salud de personaje
        if (this.energiaMagica >= hechizo.energiaMagicaHechizo) {
            
            this.energiaMagica -= hechizo.energiaMagicaHechizo;
            double saludVictima = (double) personaje.getSalud();
            if ( personaje instanceof Wizard){
                Artefacto artefactoVictima = ((IHaceMagia) personaje).getArtefacto();
                saludVictima -= (hechizo.nivelDanio)*(1-artefactoVictima.amplificadorDeCuracion);
            } else{//si es muggle o elfo
                saludVictima -= (hechizo.nivelDanio);
            }
            personaje.setSalud((int) saludVictima);
            double saludAtacante = (double) this.getSalud();
            saludAtacante += hechizo.nivelCuracion;
            if (saludAtacante <= 100) {
                this.setSalud((int) saludAtacante);  
              }else{
                  this.setSalud(100);
            }
        }

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
    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;
    }

}
