package app;

import java.util.Scanner;

import app.interfaces.IHaceMagia;
import app.personajes.Personaje;
import app.poderes.hechizos.Hechizo;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Harry Potter Game");
        System.out.println("Creado por Alex, Maggie y Dani");
        System.out.println(" ");

        JuegoHP mijuegoHp = new JuegoHP();

        JuegoHP.inicioJuegoHP();

        // Hago for loop para ver los personajes de la lista
        Personaje player1 = mijuegoHp.seleccionaPersonaje();
        Personaje player2 = mijuegoHp.seleccionaPersonaje();

        System.out.println(player1.getNombre());

        boolean turnoP1 = true;
        boolean turnoAtacar = true;


        if (player1 instanceof IHaceMagia && player2 instanceof IHaceMagia) {

            while (player1.estaVivo() && player2.estaVivo()) {
                 if (turnoAtacar) {

                    if (turnoP1) {
                    System.out.println("Turno de Ataque para el jugador "+player1.getNombre());
                    JuegoHP.listaHechizosAtaques();
                    Hechizo hechizo1 = mijuegoHp.elegirHechizo();
                    ((IHaceMagia) player1).atacar(player2, hechizo1);
                    System.out.println("La salud de "+player2.getNombre()+player2.getSalud());

                    } else {
                    System.out.println("Turno de Ataque para el jugador "+player2.getNombre());
                    JuegoHP.listaHechizosAtaques();
                    Hechizo hechizo2 = mijuegoHp.elegirHechizo();
                    ((IHaceMagia) player2).atacar(player1, hechizo2);
                    System.out.println("La salud de "+player1.getNombre()+player1.getSalud());
                 }

                    turnoP1 = !turnoP1;

                }else {
                
                    if (turnoP1) {
                    System.out.println("Turno de Defensa para el jugador "+player1.getNombre());
                    JuegoHP.listaHechizosDefensa();
                    Hechizo hechizo1 = mijuegoHp.elegirHechizo();
                    ((IHaceMagia) player1).atacar(player2, hechizo1);
                    System.out.println("La salud de "+player2.getNombre()+player2.getSalud());
                    System.out.println("La salud de "+player1.getNombre()+player1.getSalud());

                    } else {
                    System.out.println("Turno de Defensa para el jugador "+player2.getNombre());
                    JuegoHP.listaHechizosDefensa();
                    Hechizo hechizo2 = mijuegoHp.elegirHechizo();
                    ((IHaceMagia) player2).atacar(player1, hechizo2); //DA ERROR NULL
                    System.out.println("La salud de "+player1.getNombre()+player1.getSalud());
                    System.out.println("La salud de "+player2.getNombre()+player2.getSalud());
                 }
               
             }

             turnoAtacar = !turnoAtacar;

            }
        }

        if (player1.estaVivo()){
            System.out.println("El ganador es: "+player1.getNombre());
        }
        else{
            System.out.println("El ganador es: "+player2.getNombre());
        }

    }
}
