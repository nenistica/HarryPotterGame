package app.artefactos;

import app.poderes.Poder;

public class Varita extends Artefacto {
    // Constructor de Varita
    public Varita(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion,
            Poder poderArtefacto) {
        super(nombreArtefacto, amplificadorDeDanio, amplificadorDeCuracion, poderArtefacto);
    }
}
