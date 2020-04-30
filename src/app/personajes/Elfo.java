package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.hechizos.Hechizo;

public class Elfo extends Criatura implements IHaceMagia {

    Artefacto artefacto;

    List<Hechizo> hechizo;

    public void getEnergiaMagica(int energiaMagica) {

    }

    public void setEnergiaMagica(int energiaMagica) {
    }

    public Artefacto getArtefacto() {
        return artefacto;
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
    public void getEnergiaMagica() {

    }

    @Override
    public void setEnergiaMagica() {
        // TODO Auto-generated method stub

    }

}
