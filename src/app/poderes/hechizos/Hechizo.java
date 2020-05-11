package app.poderes.hechizos;

import app.poderes.Poder;

public class Hechizo extends Poder {
    // Atributos de clase Hechizo.
    public boolean esOscuro;
    public int nivelDanio;
    public int nivelCuracion;
    public int energiaMagicaHechizo;

    // Constructor de Hechizo
    public Hechizo(String nombrePoder, String descripcionPoder, boolean esOscuro, int nivelDanio, int nivelCuracion,
            int energiaMagicaHechizo) {
        super(nombrePoder, descripcionPoder);
        this.esOscuro = esOscuro;
        this.nivelDanio = nivelDanio;
        this.nivelCuracion = nivelCuracion;
        this.energiaMagicaHechizo = energiaMagicaHechizo;
    }
}
