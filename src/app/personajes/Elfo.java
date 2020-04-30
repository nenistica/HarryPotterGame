package app.personajes;


import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.hechizos.Hechizo;

public class Elfo extends Criatura implements IHaceMagia {

   private int energiaMagica;

    Artefacto artefacto;

    List<Hechizo>hechizo;

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
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




}
