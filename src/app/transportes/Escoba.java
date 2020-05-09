package app.transportes;

public class Escoba extends Transporte {

    public Escoba(String nombreDeTransporte){
        super(nombreDeTransporte);
    }

    @Override
    public boolean esInvisibleAMuggles() {
        
        return false;
    }

    @Override
    public boolean esInvisible() {
        
        return false;
    }

    
}
