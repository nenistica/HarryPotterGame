package app.personaje;

import java.util.List;

import app.artefacto.Artefacto;
import app.interfaces.IHaceMagia;
<<<<<<< HEAD
=======
import app.poder.Poder;
>>>>>>> 2ae260f13d67553bffd135a3624c3b9cbbadd877
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
