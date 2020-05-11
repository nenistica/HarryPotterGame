package app.poderes.hechizos.curaciones;

import app.poderes.hechizos.Hechizo;

public class HechizoCuracion extends Hechizo {
    // Constructor de HechizoCuracion
    public HechizoCuracion(String nombrePoder, String descripcionPoder, boolean esOscuro, int nivelDanio,
            int nivelCuracion, int energiaMagicaHechizo) {
        super(nombrePoder, descripcionPoder, esOscuro, nivelDanio, nivelCuracion, energiaMagicaHechizo);
    }

}
