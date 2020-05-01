package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.transportes.Escoba;

public class Wizard extends Persona implements IHaceMagia {

    int energiaMagica;
    List<Hechizo> hechizo;
    Escoba escoba;
    Poder poderInicial;
    Artefacto artefacto;
    boolean magoOscuro;

    public Wizard(String nombre, int salud, int edad, int energiaMagica, List<Hechizo> hechizo, Escoba escoba,
    Poder poderInicial, Artefacto artefacto, boolean magoOscuro) {
        super(nombre, salud, edad);
        this.energiaMagica = energiaMagica;
        this.hechizo = hechizo;
        this.escoba = escoba;
        this.poderInicial = poderInicial;
        this.artefacto = artefacto;
        this.magoOscuro = magoOscuro;
}

    @Override
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;

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

        return artefacto;
    }

    @Override
    public void aprender(Hechizo h) {

    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {

    }

    @Override
    public void atacar(Personaje personaje, String hechizo) {

    }

    @Override
    public int getEnergiaMagica() {

        return 0;
    }

}
