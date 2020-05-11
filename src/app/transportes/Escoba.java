package app.transportes;

public class Escoba extends Transporte {
    // Constructor de Escoba
    public Escoba(String nombreDeTransporte) {
        super(nombreDeTransporte);
    }

    // Override de Transporte
    @Override
    public boolean esInvisibleAMuggles() {

        return false;
    }

    @Override
    public boolean esInvisible() {

        return false;
    }

}
