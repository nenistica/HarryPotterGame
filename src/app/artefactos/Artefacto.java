package app.artefactos;

import app.interfaces.IEsMagico;
import app.poderes.Poder;

public class Artefacto implements IEsMagico {

    String nombreArtefacto;

    double amplificadorDeDanio;

    double amplificadorDeCuracion;
    
    Poder poderArtefacto;

    public Artefacto(final String nombreArtefacto, final double amplificadorDeDanio, final double amplificadorDeCuracion,
            final Poder poderArtefacto) {
        this.nombreArtefacto = nombreArtefacto;
        this.amplificadorDeDanio = amplificadorDeDanio;
        this.amplificadorDeCuracion = amplificadorDeCuracion;
        this.poderArtefacto = poderArtefacto;
    }

}
