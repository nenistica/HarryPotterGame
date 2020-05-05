package app.artefactos;

import app.interfaces.IEsMagico;
import app.poderes.Poder;

public class Artefacto implements IEsMagico {

    public String nombreArtefacto;

    public double amplificadorDeDanio;

    public double amplificadorDeCuracion;

    public Poder poderArtefacto;

    public Artefacto(final String nombreArtefacto, final double amplificadorDeDanio,
            final double amplificadorDeCuracion, Poder poderArtefacto) {
        this.nombreArtefacto = nombreArtefacto;
        this.amplificadorDeDanio = amplificadorDeDanio;
        this.amplificadorDeCuracion = amplificadorDeCuracion;
        this.poderArtefacto = poderArtefacto;
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
