package app.artefactos;

import app.interfaces.IReliquiaMuerte;
import app.poderes.Poder;

public class VaritaSauco extends Varita implements IReliquiaMuerte {
    // Constructor de Varita Sauco.
    public VaritaSauco(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion,
            Poder poderArtefacto) {
        super(nombreArtefacto, amplificadorDeDanio, amplificadorDeCuracion, poderArtefacto);

    }

    // Overrride de Interface IReliquiaMuerte
    @Override
    public boolean esReliquiaMuerte() {

        return true;
    }
}
