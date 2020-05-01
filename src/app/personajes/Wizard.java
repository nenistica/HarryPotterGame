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

    public Wizard(String nombre, int salud, int edad) {
        super(nombre, salud, edad);

    }

    public boolean magoOscuro() {
        return false;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {

    }

    @Override
    public Poder getPoderInicial() {

        return null;
    }

    @Override
    public void setPoder(Poder poder) {

    }

    @Override
    public Artefacto getArtefaco() {

        return null;
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
