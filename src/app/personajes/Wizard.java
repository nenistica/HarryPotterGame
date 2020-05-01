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

    public boolean magoOscuro() {
        return false;
    }

    @Override
    public void getEnergiaMagica() {

    }

    @Override
    public void setEnergiaMagica() {

    }

}
