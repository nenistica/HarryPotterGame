package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        System.out.println("Harry Potter Game\n");
        System.out.println("Creado por Alex, Maggie y Dani\n");

        JuegoHP mijuegoHp = new JuegoHP();

        // Attr
        int cantJugadores;

        System.out.println("¿Cúantos jugadores son? ");

        cantJugadores = Teclado.nextInt();

        switch (cantJugadores) {
            case 1:
                mijuegoHp.JugadorVsBot();
                break;

            case 2:
                mijuegoHp.dosJugadores();
                break;

        }

    }

}
