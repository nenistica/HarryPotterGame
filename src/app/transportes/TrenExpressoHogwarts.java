package app.transportes;


public class TrenExpressoHogwarts extends Transporte {

    @Override
    public boolean esInvisibleAMuggles() {
        
        return true;
    }

    @Override
    public boolean esInvisible() {
        
        return false;
    }

    public TrenExpressoHogwarts(){
        }

    public TrenExpressoHogwarts(String nombreDeTransporte){
        super(nombreDeTransporte);
    }
}
