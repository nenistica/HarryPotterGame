package app.artefacto;

import app.interfaces.IEsMagico;

abstract class Artefacto implements IEsMagico {

    String nombreArtefacto;

    double amplificadorDeDanio;

    double amplificadorDeCuracion;
    
    Poder poderArtefacto;

}
