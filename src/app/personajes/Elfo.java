package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

public class Elfo extends Criatura implements IHaceMagia {
    //Attr
    private Artefacto artefacto;
    public List<Hechizo> hechizo;
    private int energiaMagica;
    private Poder poderInicial;

    public Elfo(String nombre, int salud, int edad, int energiaMagica) {
        super(nombre,salud,edad);
        this.energiaMagica = energiaMagica;
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
        this.hechizo.add(h);

    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {
        // busca el nivelDanio de hechizo y se lo resta a la salud de personaje
        if (this.energiaMagica >= hechizo.energiaMagicaHechizo) {
            
            this.energiaMagica -= hechizo.energiaMagicaHechizo;
            double saludVictima = (double) personaje.getSalud();
            saludVictima -= hechizo.nivelDanio;
            int salud1 = (int) saludVictima;
            personaje.setSalud(salud1);
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
        

    }

    @Override
    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;
    }

}
