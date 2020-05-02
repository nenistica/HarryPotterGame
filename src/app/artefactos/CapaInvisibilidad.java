package app.artefactos;

import app.interfaces.IReliquiaMuerte;
import app.poderes.Poder;

public class CapaInvisibilidad extends Artefacto implements IReliquiaMuerte {

    public CapaInvisibilidad(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion) {
        super(nombreArtefacto, amplificadorDeDanio, amplificadorDeCuracion);
        
    }

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }
}
