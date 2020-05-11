package app.artefactos;

import app.interfaces.IReliquiaMuerte;
import app.poderes.Poder;

public class CapaInvisibilidad extends Artefacto implements IReliquiaMuerte {
    
    //Constructor de la Clase CapaInvisibilidad 
    public CapaInvisibilidad(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion, Poder poderArtefacto) {
        super(nombreArtefacto, amplificadorDeDanio, amplificadorDeCuracion, poderArtefacto);
        
    }
    //Override de las Interfaces IReliquiaMuerte e IEsMagico.
    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }

    @Override
    public boolean esInvisibleAMuggles() {
       
        return true;
    }

}
