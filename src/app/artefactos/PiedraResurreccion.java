package app.artefactos;

import app.interfaces.IReliquiaMuerte;
import app.poderes.Poder;

public class PiedraResurreccion extends Artefacto implements IReliquiaMuerte {
    // Constructor de PiedraResurreccion
    public PiedraResurreccion(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion,
            Poder poderArtefacto) {
        super(nombreArtefacto, amplificadorDeDanio, amplificadorDeCuracion, poderArtefacto);

    }

    // Override de la Interface IReliquiaMuerte
    @Override
    public boolean esReliquiaMuerte() {

        return true;
    }
}
