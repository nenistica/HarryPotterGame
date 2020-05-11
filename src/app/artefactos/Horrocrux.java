package app.artefactos;

import app.interfaces.IReliquiaMuerte;
import app.poderes.Poder;

public class Horrocrux extends Artefacto implements IReliquiaMuerte {
    //Constructor de Horrocrux
    public Horrocrux(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion,
            Poder poderArtefacto) {
        super(nombreArtefacto, amplificadorDeDanio, amplificadorDeCuracion, poderArtefacto);
    }
    // Override de Interface IReliquiaMuerte
    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }
}
