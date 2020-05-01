package app.artefactos;

import app.interfaces.IReliquiaMuerte;
import app.poderes.Poder;

public class Horrocrux extends Artefacto implements IReliquiaMuerte {

    public Horrocrux(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion,
            Poder poderArtefacto) {
        super(nombreArtefacto, amplificadorDeDanio, amplificadorDeCuracion, poderArtefacto);
        // TODO Auto-generated constructor stub
    }
}
