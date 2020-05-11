package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
       // Imprimimos header
       System.out.println("#     #                               ######                                       #####                       "); 
       System.out.println(" #     #   ##   #####  #####  #   #    #     #  ####  ##### ##### ###### #####     #     #   ##   #    # ###### ");
       System.out.println(" #     #  #  #  #    # #    #  # #     #     # #    #   #     #   #      #    #    #        #  #  ##  ## #      ");
       System.out.println(" ####### #    # #    # #    #   #      ######  #    #   #     #   #####  #    #    #  #### #    # # ## # #####  ");
       System.out.println(" #     # ###### #####  #####    #      #       #    #   #     #   #      #####     #     # ###### #    # #    ");  
       System.out.println(" #     # #    # #   #  #   #    #      #       #    #   #     #   #      #   #     #     # #    # #    # #      ");
       System.out.println(" #     # #    # #    # #    #   #      #        ####    #     #   ###### #    #     #####  #    # #    # ###### ");
       System.out.println("Creado por Alex, Maggie y Dani\n");                                                                                                                

        JuegoHP mijuegoHp = new JuegoHP();

        // Attr
        int cantJugadores;

        //Se pide cantidad de jugadores para saber si se juega con bot o no
        System.out.println("¿Cúantos jugadores son? ");

        cantJugadores = Teclado.nextInt();

        switch (cantJugadores) {
            case 1://Para poder Jugar con un BOT
                mijuegoHp.JugadorVsBot();
                break;

            case 2://Para jugar con dos Jugadores
                mijuegoHp.dosJugadores();
                break;

        }

    }

}
