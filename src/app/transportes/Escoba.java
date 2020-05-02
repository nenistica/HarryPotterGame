package app.transportes;

import app.interfaces.IEsMagico;

public class Escoba extends Transporte implements IEsMagico {

    @Override
    public boolean esInvisibleAMuggles() {
        
        return false;
    }

    @Override
    public boolean esInvisible() {
        
        return false;
    }
}
