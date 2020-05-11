package app.transportes;

import app.interfaces.IEsMagico;

public abstract class Transporte implements IEsMagico {

    // Atributos
    public String nombreDeTransporte;

    // Constructores
    public Transporte() {

    }

    public Transporte(String nombreDeTransporte) {
        this.nombreDeTransporte = nombreDeTransporte;

    }

    // Override de IEsMagico
    @Override
    public boolean esInvisible() {

        return false;
    }

    @Override
    public boolean esInvisibleAMuggles() {

        return false;
    }

}
