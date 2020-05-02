package app.personajes;

public class Personaje {
    // Attr
    String nombre;
    int salud;
    int edad;

    boolean estaVivo() {
        if (salud > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Personaje(String nombre, int salud, int edad) {
        this.nombre = nombre;
        this.salud = salud;
        this.edad = edad;
    }

    public Personaje() {

    }

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

    @Override
    public String toString() {
        return "Personaje [edad=" + edad + ", nombre=" + nombre + ", salud=" + salud + "]";
    }

}
