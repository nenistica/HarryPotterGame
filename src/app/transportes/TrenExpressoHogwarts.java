package app.transportes;

public class TrenExpressoHogwarts extends Transporte {
    // Override de Transporte
    @Override
    public boolean esInvisibleAMuggles() {

        return true;
    }

    @Override
    public boolean esInvisible() {

        return false;
    }

    // Constructor vacío de TrenExpresoHogwarts
    public TrenExpressoHogwarts() {
    }

    // Constructor de TrenExpresoHogwarts
    public TrenExpressoHogwarts(String nombreDeTransporte) {
        super(nombreDeTransporte);
    }
}
