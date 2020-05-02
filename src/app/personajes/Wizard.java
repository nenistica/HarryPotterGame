package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.transportes.Escoba;

public class Wizard extends Persona implements IHaceMagia {

    private int energiaMagica;
    List<Hechizo> hechizo;
    Escoba escoba;
    private Poder poderInicial;
    private Artefacto artefacto;
    boolean magoOscuro;

    public Wizard(String nombre, int salud, int edad, int energiaMagica, boolean magoOscuro) {
        super(nombre, salud, edad);
        this.energiaMagica = energiaMagica;
        this.magoOscuro = magoOscuro;

    }

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
    public void setPoder(Poder poder) {

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
        this.hechizo.add(h);

    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {
         // buscar el nivelDanio de hechizo y se lo resta a la salud de personaje
         if (this.energiaMagica >= hechizo.energiaMagicaHechizo){
            this.energiaMagica -= hechizo.energiaMagicaHechizo;
         }
    
        if ((this.magoOscuro == false) && (hechizo.esOscuro == true)){
            this.magoOscuro = true;
            personaje.salud -= (2*hechizo.nivelDanio);
                
        } else{
            personaje.salud -= hechizo.nivelDanio;
            }
    
        
 
    }

}
