package app.personajes;

public abstract class Personaje {
    // Atributos
    private String nombre;
    private int salud;
    private int edad;

    // Metodo estaVivo
    public boolean estaVivo() {
        if (salud > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Constructor vacío de Personaje
    public Personaje() {

    }

    // Constructor de Personaje
    public Personaje(String nombre, int salud, int edad) {
        this.nombre = nombre;
        this.salud = salud;
        this.edad = edad;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
