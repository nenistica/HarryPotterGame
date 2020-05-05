package app;

import java.util.Scanner;

import app.personajes.Personaje;

public class App {
    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Harry Potter Game");
        System.out.println("Creado por Alex, Maggie y Dani");
        System.out.println(" ");
        JuegoHP mijuegoHp = new JuegoHP();

        JuegoHP.inicioJuegoHP();


        // Hago for loop para ver los personajes de la lista
        

        Personaje player1 = mijuegoHp.seleccionaPersonaje();
        //Personaje player2 = mijuegoHp.seleccionaPersonaje();

        System.out.println(player1.getNombre());
        
        //Personaje player1 = seleccionaPersonaje();
        //Personaje player2 = seleccionaPersonaje();



    }
}   
