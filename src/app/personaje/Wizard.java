package app.personaje;

import java.util.List;

import app.artefacto.Artefacto;
import app.interfaces.IHaceMagia;
import app.transporte.Escoba;

public class Wizard extends Persona implements IHaceMagia {

    int energiaMagica;

    List<Hechizos> hechizo;

    Escoba escoba;

    Poder poderInicial;

    Artefacto artefacto;

    public boolean magoOscuro(){
        return false;
    }

  

}
