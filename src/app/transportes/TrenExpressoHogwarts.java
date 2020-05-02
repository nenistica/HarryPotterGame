package app.transportes;

import app.interfaces.IEsMagico;

public class TrenExpressoHogwarts extends Transporte implements IEsMagico {

    @Override
    public boolean esInvisibleAMuggles() {
        
        return true;
    }

    @Override
    public boolean esInvisible() {
        
        return false;
    }

    
}
