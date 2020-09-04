package app.poderes;

public abstract class Poder {
    // Atributos
    public String nombrePoder;
    public String descripcionPoder;

    // Constructores
    public Poder(String nombrePoder, String descripcionPoder) {
        this.nombrePoder = nombrePoder;
        this.descripcionPoder = descripcionPoder;
    }

}
