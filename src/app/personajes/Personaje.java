package app.personajes;

public abstract class Personaje {
    String nombre;

    int salud;
    int edad;

    boolean estaVivo(){
        if (salud > 0){
            return true;
        }
        else{
            return false;
        }
    }




}
