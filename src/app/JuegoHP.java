package app;

import java.util.*;
import app.artefactos.*;
import app.interfaces.IHaceMagia;
import app.personajes.*;
import app.poderes.*;
import app.poderes.hechizos.*;
import app.poderes.hechizos.ataques.*;
import app.poderes.hechizos.curaciones.*;
import app.poderes.hechizos.defensas.*;
import app.poderes.hechizos.ocios.*;
import app.transportes.Escoba;

public class JuegoHP {
    public static Scanner Teclado = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static List<Personaje> PersonajesLista = new ArrayList<Personaje>();
    public static List<HechizoAtaque> HechizosAtaque = new ArrayList<HechizoAtaque>();
    public static List<Hechizo> HechizosDefensayCuracion = new ArrayList<Hechizo>();
    public static List<HechizoOcio> HechizosOcio = new ArrayList<HechizoOcio>();
    public static List<Hechizo> hechizoPersonaje = new ArrayList<Hechizo>();
    public static List<Personaje> PersonajesExcluido = new ArrayList<Personaje>();

       
    public static void agregarPersonajes() {

        Poder parsel = new Parseltongue("Lengua Parsel", "Pude hablar con serpientes");
        Poder invisibilidad = new Invisibilidad("Invisibilidad", "Se hace invisible a todos");
        Poder metamorfosis = new Metamorfosis("Metamorfosis", "Se puede cambiar de forma");
        Poder hechizo = new Hechizo("Hechizo", "Capacidad de ejecutar hechizos", false, 0, 0, 0);
        Poder viajartiempo = new ViajarTiempo("Viajar en el Tiempo", "Permite ir al pasado durante varias horas");

        Artefacto capaInvisible = new CapaInvisibilidad("Capa Invisibilidad", 0, 0.4, invisibilidad);
        Artefacto giratiempo = new Giratiempo("Giratiempo", 0, 0.3, viajartiempo);
        Artefacto varFresno = new Varita("Varita de fresno", 0.2, 0.3, hechizo);
        Artefacto varEspino = new Varita("Varita de Espino", 0.3, 0.1, hechizo);
        Artefacto varSauco = new Varita("Varita de Sauco", 1, 0.5, hechizo);
        Artefacto horrocruxy = new Horrocrux("Horrocrux", 0.9, 0, hechizo);
        
        Escoba nimbus3000 = new Escoba("Nimbus3000");
        Escoba saetaDeFuego = new Escoba("SaetaDeFuego");
        Escoba barredora11 = new Escoba("Barredora11");
        Escoba cometa140 = new Escoba("Cometa140");

        Wizard harry = new Wizard("Harry Potter", 100, 17, 150, false, hechizoPersonaje, saetaDeFuego);
        harry.setArtefacto(capaInvisible);
        harry.setPoderInicial(parsel);
        JuegoHP.PersonajesLista.add(harry);

        Elfo dobby = new Elfo("Dobby", 100, 60, 150, hechizoPersonaje);
        dobby.setPoderInicial(metamorfosis);
        JuegoHP.PersonajesLista.add(dobby);

        Wizard hermy = new Wizard("Hermione Granger", 100, 17, 150, false, hechizoPersonaje, cometa140);
        hermy.setPoderInicial(parsel);
        hermy.setArtefacto(giratiempo);
        JuegoHP.PersonajesLista.add(hermy);

        Wizard ron = new Wizard("Ron Weasley", 100, 17, 150, false, hechizoPersonaje, barredora11);
        ron.setArtefacto(varFresno);
        JuegoHP.PersonajesLista.add(ron);

        Wizard draquito = new Wizard("Draco Malfoy", 100, 17, 150, true, hechizoPersonaje, cometa140);
        draquito.setPoderInicial(hechizo);
        draquito.setArtefacto(varEspino);
        JuegoHP.PersonajesLista.add(draquito);

        Wizard lunita = new Wizard("Luna Lovegood", 100, 16, 150, false, hechizoPersonaje, nimbus3000);
        lunita.setPoderInicial(hechizo);
        lunita.setArtefacto(varFresno);
        JuegoHP.PersonajesLista.add(lunita);

        Wizard newtty = new Wizard("Newt Scamander", 100, 25, 150, false, hechizoPersonaje, nimbus3000);
        newtty.setPoderInicial(hechizo);
        newtty.setArtefacto(varFresno);
        JuegoHP.PersonajesLista.add(newtty);

        Wizard voldy = new Wizard("Lord Voldemort", 100, 71, 150, true, hechizoPersonaje,saetaDeFuego );
        voldy.setPoderInicial(parsel);
        voldy.setArtefacto(horrocruxy);
        JuegoHP.PersonajesLista.add(voldy);

        Wizard dumby = new Wizard("Albus Dumbledore", 75, 116, 150, false, hechizoPersonaje, cometa140 );
        dumby.setPoderInicial(hechizo);
        dumby.setArtefacto(varSauco);
        JuegoHP.PersonajesLista.add(dumby);

        Muggle dudley = new Muggle("Dudley Dursley", 80, 18);
        JuegoHP.PersonajesLista.add(dudley);

        Wizard snapey = new Wizard("Severus Snape", 90, 38, 150, true, hechizoPersonaje, barredora11);
        snapey.setPoderInicial(hechizo);
        snapey.setArtefacto(varEspino);
        JuegoHP.PersonajesLista.add(snapey);

        Elfo kreachy = new Elfo("Kreacher", 50, 666, 150, hechizoPersonaje);
        kreachy.setPoderInicial(invisibilidad);
        JuegoHP.PersonajesLista.add(kreachy);

        Wizard bella = new Wizard("Bellatrix Lestrange", 100, 47, 150, true, hechizoPersonaje, nimbus3000);
        bella.setPoderInicial(hechizo);
        bella.setArtefacto(varEspino);
        JuegoHP.PersonajesLista.add(bella);

    }

    // Hechizos
    public static void agregarHechizos() {

        AvadaKedavra avvy = new AvadaKedavra("Avada Kedavra", "Maldición de Muerte Total", true, 160, 0, 40);
        JuegoHP.HechizosAtaque.add(avvy);

        Cruciatus cruccy = new Cruciatus("Cruciatus", "Maldición de Tortura Física", true, 15, 0, 20);
        JuegoHP.HechizosAtaque.add(cruccy);

        Imperius imppy = new Imperius("Imperius", "Controlar a la victima", true, 30, 0, 10);
        JuegoHP.HechizosAtaque.add(imppy);

        PetrificusTotalus petri = new PetrificusTotalus("Petrificus Totalus", "Parálisis de cuerpo", false, 20, 0, 5);
        JuegoHP.HechizosAtaque.add(petri);

        SectumSempra sectty = new SectumSempra("Sectum Sempra", "Profundos cortes a la victima", false, 25, 0, 6);
        JuegoHP.HechizosAtaque.add(sectty);

        Episkey eppi = new Episkey("Episkey", "Cura Heridas", false, 0, 12, 2);
        JuegoHP.HechizosDefensayCuracion.add(eppi);

        Reparifors reppi = new Reparifors("Reparifors", "Cura dolencias pequeñas", false, 0, 20, 6);
        JuegoHP.HechizosDefensayCuracion.add(reppi);

        VulneraSanetur vully = new VulneraSanetur("Vulnera Sanetur", "Reduce hemorragia y cierra heridas", false, 0, 30, 10);
        JuegoHP.HechizosDefensayCuracion.add(vully);

        CaveInimicum cavvy = new CaveInimicum("Cave Inimicum", "Proteccion aleja enemigos", false, 30, 20, 30);
        JuegoHP.HechizosDefensayCuracion.add(cavvy);

        ExpectoPatronum exppy = new ExpectoPatronum("Expecto Patronum", "Repele Dementores", false, 25, 15, 20);
        JuegoHP.HechizosDefensayCuracion.add(exppy);

        Expelliarmus expelly = new Expelliarmus("Expelliarmus", "Desarma al oponente", false, 10, 0, 1);
        JuegoHP.HechizosDefensayCuracion.add(expelly);

        ProtegoMaxima protty = new ProtegoMaxima("Protego Maxima", "Crea una barrera protectora", false, 15, 20, 10);
        JuegoHP.HechizosDefensayCuracion.add(protty);

        Alohomora aloho = new Alohomora("Alohomora", "Abre puertas con cerraduras", false, 0, 0, 7);
        JuegoHP.HechizosOcio.add(aloho);

        Lumos lummy = new Lumos("Lumos", "Ilumina la punta de la varita", false, 0, 0, 3);
        JuegoHP.HechizosOcio.add(lummy);

        WingwardiumLeviosa winggy = new WingwardiumLeviosa("Wingwardium Leviosa", "Levitar objetos", false, 0, 0, 9);
        JuegoHP.HechizosOcio.add(winggy);

    }

    public static void inicioJuegoHP() {
        JuegoHP.agregarPersonajes();
        JuegoHP.mostrarListaPersonajes();
        System.out.println(" ");
        // JuegoHP.agregarArtefactos();
        JuegoHP.agregarHechizos();
    }

    public static Personaje getPersonajeByName(String nombre) {
        for (Personaje personaje : PersonajesLista) {
            if (nombre.equalsIgnoreCase(personaje.getNombre())) {
                return personaje;
            }
        }
        
        return null;

    }

    public static Personaje seleccionaPersonaje() {
        String Opcion;
        System.out.println("Escribe el nombre del personaje que quieras seleccionar tal cual sale en la lista: ");
        Opcion = Teclado.nextLine();
        return getPersonajeByName(Opcion);

    }

    public static void mostrarListaPersonajes() {
        System.out.println("LISTA DE PERSONAJES");
        for (Personaje persona : JuegoHP.PersonajesLista) {
            System.out.println(persona.getNombre());
        }
    }

    public static Hechizo elegirHechizo() { // Preguntar el forloop para imprimir la lista de hechizos.
        String nombreH;
        System.out.println(ANSI_BLUE +"Escribe el nombre del hechizo: " + ANSI_RESET);
        nombreH = Teclado.nextLine();
        for (HechizoAtaque hechizoAtaque : JuegoHP.HechizosAtaque) {
            if (nombreH.equalsIgnoreCase(hechizoAtaque.nombrePoder)) {
                return hechizoAtaque;
            }

        }

        for (Hechizo HechizosDefensayCur : JuegoHP.HechizosDefensayCuracion) {
            if (nombreH.equalsIgnoreCase(HechizosDefensayCur.nombrePoder)) {
                return HechizosDefensayCur;
            }

        }

        return null;
    }

    public static void listaHechizosAtaques() {
        System.out.println(ANSI_RESET + "LISTA HECHIZOS DE ATAQUE" + ANSI_RED);
        for (int i = 0; i < JuegoHP.HechizosAtaque.size(); i++) {
            Hechizo h = JuegoHP.HechizosAtaque.get(i);
            System.out.println(h.nombrePoder);
        }
    }

    public static void listaHechizosDefensa() {
        System.out.println(ANSI_RESET + "LISTA HECHIZOS DE DEFENSA Y CURACIÓN" + ANSI_GREEN);
        for (int i = 0; i < JuegoHP.HechizosDefensayCuracion.size(); i++) {
            Hechizo h = JuegoHP.HechizosDefensayCuracion.get(i);
            System.out.println(h.nombrePoder);
        }

    }

    public static Random randomPersonaje; // Personaje BOT

    public static Random randomAtaque; // Personaje BOT

    public static List<Personaje> excluirPersonaje(Personaje player1){
        String nombrePersonaje = player1.getNombre();
        for (Personaje personaje : JuegoHP.PersonajesLista) {
            if (!nombrePersonaje.equalsIgnoreCase(personaje.getNombre())) {
                JuegoHP.PersonajesExcluido.add(personaje);
            }

        }
        return PersonajesExcluido;
    }

    public static Personaje elegirPersonajeAleatorio(Personaje player) {
        randomPersonaje = new Random();
        List<Personaje> Excluido = excluirPersonaje(player);
        Personaje personajeAleatorio = Excluido.get(randomPersonaje.nextInt(Excluido.size() - 1));
        return personajeAleatorio;
    }

    public static HechizoAtaque elegirHechizoAtaqueAleatorio() {
        randomAtaque = new Random();
        HechizoAtaque hechizoAtaqueAleatorio = HechizosAtaque.get(randomAtaque.nextInt(HechizosAtaque.size() - 1));
        return hechizoAtaqueAleatorio;
    }

    public static Random randomDefensa; // Personaje BOT

    public static Hechizo elegirHechizosDefensayCuracionAleatorio() {
        randomDefensa = new Random();
        Hechizo HechizosDefensayCuracionAleatorio = HechizosDefensayCuracion.get(randomDefensa.nextInt(HechizosDefensayCuracion.size() - 1));
        return HechizosDefensayCuracionAleatorio;
    }

    public static void gameOver(Personaje player1, Personaje player2) {
        if (player1.estaVivo()) {
            System.out.println("El ganador es: " + player1.getNombre());
            System.out.println(player2.getNombre() + " ha muerto.\n");
        } else {
            System.out.println("El ganador es: " + player2.getNombre());
            System.out.println(player1.getNombre() + " ha muerto.\n");
        }

        System.out.println("    ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  ");
        System.out.println("    ██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ ");
        System.out.println("    ██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  ");
        System.out.println("    ██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██ ");
        System.out.println("     ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ ");
    }

    boolean turnoP1 = true;
    boolean turnoAtacar = true;

    public void JugadorVsBot() {
        JuegoHP.inicioJuegoHP();
        Personaje player0 = JuegoHP.seleccionaPersonaje();
        Personaje playerAleatorio = JuegoHP.elegirPersonajeAleatorio(player0);
        System.out.println("Tu contrincante es " + playerAleatorio.getNombre());

        if (player0 instanceof IHaceMagia && playerAleatorio instanceof IHaceMagia) {

            while (player0.estaVivo() && playerAleatorio.estaVivo()) {
                if (turnoAtacar) {

                    if (turnoP1) {
                        System.out.println(ANSI_RED + "\nTurno de Ataque para el jugador " + ANSI_RESET + player0.getNombre() + ANSI_RED);
                        JuegoHP.listaHechizosAtaques();
                        Hechizo hechizo1 = JuegoHP.elegirHechizo();
                        ((IHaceMagia) player0).aprender(hechizo1);
                        ((IHaceMagia) player0).atacar(playerAleatorio, hechizo1);
                        System.out.println("\nLa salud de " + playerAleatorio.getNombre() + " es: " + playerAleatorio.getSalud());
                        System.out.println("\nLa salud de " + player0.getNombre() + " es: " + player0.getSalud());
                    } else {
                        System.out.println(ANSI_RED + "\nTurno de Ataque para el jugador " + ANSI_RESET + playerAleatorio.getNombre() + ANSI_RED);
                        JuegoHP.listaHechizosAtaques();
                        Hechizo hechizo2 = JuegoHP.elegirHechizoAtaqueAleatorio();
                        System.out.println(ANSI_RESET + playerAleatorio.getNombre() + " te ha atacado con el hechizo: " + ANSI_RED + hechizo2.nombrePoder + ANSI_RED);
                        ((IHaceMagia) playerAleatorio).atacar(player0, hechizo2);
                        ((IHaceMagia) playerAleatorio).aprender(hechizo2);
                        System.out.println(ANSI_RESET + "\nLa salud de " + player0.getNombre() + " es: " + player0.getSalud() + ANSI_RESET);
                        System.out.println(ANSI_RESET + "\nLa salud de " + playerAleatorio.getNombre() + " es: " + playerAleatorio.getSalud() + ANSI_RESET);
                                
                    }

                    turnoP1 = !turnoP1;

                } else {

                    if (turnoP1) {
                        System.out.println(ANSI_GREEN + "\nTurno de Defensa para el jugador: " + ANSI_RESET + player0.getNombre() + ANSI_GREEN);
                        JuegoHP.listaHechizosDefensa();
                        Hechizo hechizo1 = JuegoHP.elegirHechizo();
                        ((IHaceMagia) player0).atacar(playerAleatorio, hechizo1);
                        System.out.println("\nLa salud de " + playerAleatorio.getNombre() + " es: " + playerAleatorio.getSalud());
                        System.out.println("La salud de " + player0.getNombre() + " es: " + player0.getSalud()+ ANSI_RESET );

                    } else {
                        System.out.println(ANSI_GREEN + "\nTurno de Defensa para el jugador: "+ ANSI_RESET + playerAleatorio.getNombre()+ ANSI_GREEN);
                        JuegoHP.listaHechizosDefensa();
                        Hechizo hechizo2 = JuegoHP.elegirHechizosDefensayCuracionAleatorio();
                        System.out.println(ANSI_RESET + playerAleatorio.getNombre() + " se ha defendido con el hechizo: " + ANSI_GREEN + hechizo2.nombrePoder  + ANSI_RESET);
                        ((IHaceMagia) playerAleatorio).atacar(player0, hechizo2);
                        ((IHaceMagia) playerAleatorio).aprender(hechizo2);
                        System.out.println( ANSI_GREEN + "\nLa salud de " + player0.getNombre() + " es: " + player0.getSalud());
                        System.out.println("La salud de " + playerAleatorio.getNombre() + " es: " + playerAleatorio.getSalud());
                    }

                }

                turnoAtacar = !turnoAtacar;

            }

        }
        JuegoHP.gameOver(player0, playerAleatorio);
    }

    public void dosJugadores() {
        JuegoHP.inicioJuegoHP();
        Personaje player1 = JuegoHP.seleccionaPersonaje();
        Personaje player2 = JuegoHP.seleccionaPersonaje();
        if (player1 instanceof IHaceMagia && player2 instanceof IHaceMagia) {

            while (player1.estaVivo() && player2.estaVivo()) {
                if (turnoAtacar) {

                    if (turnoP1) {
                        System.out.println(ANSI_RED + "\nTurno de Ataque para el jugador: " + ANSI_RESET + player1.getNombre()+ ANSI_RED);
                        JuegoHP.listaHechizosAtaques();
                        Hechizo hechizo1 = JuegoHP.elegirHechizo();
                        ((IHaceMagia) player1).aprender(hechizo1);
                        ((IHaceMagia) player1).atacar(player2, hechizo1);
                        System.out.println("\nLa salud de " + player2.getNombre() + " es: " + player2.getSalud());
                        System.out.println("La salud de " + player1.getNombre() + " es: " + player1.getSalud());

                    } else {
                        System.out.println(ANSI_RED + "\nTurno de Ataque para el jugador:" + ANSI_RESET + player2.getNombre()+ ANSI_RED);
                        JuegoHP.listaHechizosAtaques();
                        Hechizo hechizo2 = JuegoHP.elegirHechizo();
                        ((IHaceMagia) player2).atacar(player1, hechizo2);
                        ((IHaceMagia) player2).aprender(hechizo2);
                        System.out.println("\nLa salud de " + player1.getNombre() + " es: " + player1.getSalud()+ ANSI_RESET);
                        System.out.println("La salud de " + player2.getNombre() + " es: " + player2.getSalud()+ ANSI_RESET);
                    }

                    turnoP1 = !turnoP1;

                } else {

                    if (turnoP1) {
                        System.out.println(ANSI_GREEN + "\nTurno de Defensa para el jugador: "+ ANSI_RESET + player1.getNombre()+ ANSI_GREEN);
                        JuegoHP.listaHechizosDefensa();
                        Hechizo hechizo1 = JuegoHP.elegirHechizo();
                        ((IHaceMagia) player1).atacar(player2, hechizo1);
                        System.out.println("\nLa salud de " + player2.getNombre() + " es: " + player2.getSalud());
                        System.out.println("La salud de " + player1.getNombre() + " es: " + player1.getSalud()+ ANSI_RESET );

                    } else {
                        System.out.println(ANSI_GREEN + "\nTurno de Defensa para el jugador: "+ ANSI_RESET + player2.getNombre()+ ANSI_GREEN);
                        JuegoHP.listaHechizosDefensa();
                        Hechizo hechizo2 = JuegoHP.elegirHechizo();
                        ((IHaceMagia) player2).atacar(player1, hechizo2);
                        ((IHaceMagia) player2).aprender(hechizo2);
                        System.out.println("\nLa salud de " + player1.getNombre() + " es: " + player1.getSalud());
                        System.out.println("La salud de " + player2.getNombre() + " es: " + player2.getSalud()+ ANSI_RESET );
                    }

                }

                turnoAtacar = !turnoAtacar;

            }

        }
        JuegoHP.gameOver(player1, player2);
    }

}