package app.transporte;

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

    public TrenExpressoHogwarts(int nroDeTransporte, String nombreDeTransporte) {
        super(nroDeTransporte, nombreDeTransporte);

    }
}
