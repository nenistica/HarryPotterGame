package app.personajes;

import app.interfaces.IEsMagico;

public abstract class Criatura extends Personaje implements IEsMagico {
    // Constructor de Criatura
    public Criatura(String nombre, int salud, int edad) {
        super(nombre, salud, edad);
    }

    // Override de IEsMagico
    @Override
    public boolean esInvisibleAMuggles() {
        return true;
    }

    @Override
    public boolean esInvisible() {
        return true;
    }
}
