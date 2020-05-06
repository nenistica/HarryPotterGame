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

        if (player1 instanceof IHaceMagia) {
            System.out.println("Si implementa IHaceMagia");
        }

        while (player1.estaVivo() && player2.estaVivo()) {
            if (turnoAtacar) {

                if (turnoP1) {
                    JuegoHP.listaHechizosAtaques();
                    Hechizo hechizo1 = mijuegoHp.elegirHechizo();
                    ((IHaceMagia) player1).atacar(player2, hechizo1);

                } else {
                    JuegoHP.listaHechizosAtaques();
                    Hechizo hechizo2 = mijuegoHp.elegirHechizo();
                    ((IHaceMagia) player2).atacar(player1, hechizo2);
                }

                turnoP1 = !turnoP1;

            }else {
                
                if (turnoP1) {
                    JuegoHP.listaHechizosDefensa();
                    Hechizo hechizo1 = mijuegoHp.elegirHechizo();
                    ((IHaceMagia) player1).atacar(player2, hechizo1);

                } else {
                    JuegoHP.listaHechizosDefensa();
                    Hechizo hechizo2 = mijuegoHp.elegirHechizo();
                    ((IHaceMagia) player2).atacar(player1, hechizo2);
                }

                turnoP1 = !turnoP1;

            }

            turnoAtacar = !turnoAtacar;

        }

    }
}
