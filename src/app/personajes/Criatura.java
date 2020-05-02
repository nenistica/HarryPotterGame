package app.personajes;

import app.interfaces.IEsMagico;

public class Criatura extends Personaje implements IEsMagico {

    public Criatura(String nombre, int salud, int edad) {
	}

	@Override
    public boolean esInvisibleAMuggles() {
        return true;
    }

    @Override
    public boolean esInvisible() {
        return true;
    }
}
