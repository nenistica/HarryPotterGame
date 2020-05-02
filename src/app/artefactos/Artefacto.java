package app.artefactos;

import app.interfaces.IEsMagico;
import app.poderes.Poder;

public class Artefacto implements IEsMagico {

    String nombreArtefacto;

    double amplificadorDeDanio;

    double amplificadorDeCuracion;

    static Poder poderArtefacto;

    public Artefacto(final String nombreArtefacto, final double amplificadorDeDanio,
<<<<<<< HEAD
            final double amplificadorDeCuracion, Poder poderArtefacto2) {
=======
            final double amplificadorDeCuracion, Poder poderArtefacto) {
>>>>>>> 4ca57012b3ef7eee1b2c0879b30dd846d46bb56c
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
