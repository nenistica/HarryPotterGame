package app.artefactos;

import app.interfaces.IEsMagico;
import app.poderes.Poder;

public class Artefacto implements IEsMagico {

    String nombreArtefacto;

    double amplificadorDeDanio;

    double amplificadorDeCuracion;

    static Poder poderArtefacto;

    public Artefacto(final String nombreArtefacto, final double amplificadorDeDanio,
            final double amplificadorDeCuracion, Poder poderArtefacto) {
        this.nombreArtefacto = nombreArtefacto;
        this.amplificadorDeDanio = amplificadorDeDanio;
        this.amplificadorDeCuracion = amplificadorDeCuracion;
    }

    @Override
    public boolean esInvisibleAMuggles() {
       
        return false;
    }

    @Override
    public boolean esInvisible() {
        
        return false;
    }

}
