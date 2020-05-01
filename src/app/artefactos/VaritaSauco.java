package app.artefactos;

import app.interfaces.IReliquiaMuerte;
import app.poderes.Poder;

public class VaritaSauco extends Varita implements IReliquiaMuerte {

    public VaritaSauco(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion,
            Poder poderArtefacto) {
        super(nombreArtefacto, amplificadorDeDanio, amplificadorDeCuracion, poderArtefacto);
        
    }
}
