package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

public class Elfo extends Criatura implements IHaceMagia {
    //Attr
    public Artefacto artefacto;
    public List<Hechizo> hechizo;
    public int energiaMagica;
    public Poder poderInicial;

    public Elfo(Artefacto artefacto, List<Hechizo> hechizo, int energiaMagica,Poder poderInicial) {
        this.artefacto = artefacto;
        this.hechizo = hechizo;
        this.energiaMagica = energiaMagica;
        this.poderInicial = poderInicial;
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
    public void setPoder(Poder poder) {
        this.poderInicial = poder;

    }

    @Override
    public Artefacto getArtefacto() {
<<<<<<< HEAD
        // TODO Auto-generated method stub
        return null;
=======
        return artefacto;
>>>>>>> 71cd4763c6d4e1d57c3061af0b35a83747c002cd
    }

    @Override
    public void aprender(Hechizo h) {
        this.hechizo.add(h);

    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {
        // busca el nivelDanio de hechizo y se lo resta a la salud de personaje

    }

    @Override
    public void atacar(Personaje personaje, String hechizo) {
        // TODO Auto-generated method stub

    }

}
