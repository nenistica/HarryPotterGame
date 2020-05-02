package app.artefactos;

import app.interfaces.IReliquiaMuerte;

public class CapaInvisibilidad extends Artefacto implements IReliquiaMuerte {

    public CapaInvisibilidad(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion) {
        super(nombreArtefacto, amplificadorDeDanio, amplificadorDeCuracion, poderArtefacto);
        
    }

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }
}
