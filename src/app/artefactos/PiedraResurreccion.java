package app.artefactos;

import app.interfaces.IReliquiaMuerte;
import app.poderes.Poder;

public class PiedraResurreccion extends Artefacto implements IReliquiaMuerte {

    public PiedraResurreccion(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion,
            Poder poderArtefacto) {
        super(nombreArtefacto, amplificadorDeDanio, amplificadorDeCuracion, poderArtefacto);
        // TODO Auto-generated constructor stub
    }
}
