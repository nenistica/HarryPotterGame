package app;

import java.util.*;
import app.artefactos.*;
import app.personajes.*;
import app.poderes.*;
import app.poderes.hechizos.*;
import app.poderes.hechizos.ataques.*;
import app.poderes.hechizos.curaciones.*;
import app.poderes.hechizos.defensas.*;
import app.poderes.hechizos.ocios.*;

public class JuegoHP {
    public static Scanner Teclado = new Scanner(System.in);

    public static List<Personaje> PersonajesLista = new ArrayList<Personaje>();
    public static List<HechizoAtaque> HechizosAtaque = new ArrayList<HechizoAtaque>();
    public static List<HechizoDefensa> HechizosDefensa = new ArrayList<HechizoDefensa>();
    public static List<HechizoCuracion> HechizosCuracion = new ArrayList<HechizoCuracion>();
    public static List<HechizoOcio> HechizosOcio = new ArrayList<HechizoOcio>();
    public static List<Hechizo> hechizoPersonaje = new ArrayList<Hechizo>();

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
        Artefacto varSauco = new Varita("Varita de Sauco", 1, 0.6, hechizo);
        Artefacto horrocruxy = new Horrocrux("Horrocrux", 0.9, 0, hechizo);

        Wizard harry = new Wizard("Harry Potter", 100, 17, 150, false,hechizoPersonaje);
        harry.setArtefacto(capaInvisible);
        harry.setPoderInicial(parsel);
        JuegoHP.PersonajesLista.add(harry);

        Elfo dobby = new Elfo("Dobby", 100, 60, 150);
        dobby.setPoderInicial(metamorfosis);
        JuegoHP.PersonajesLista.add(dobby);

        Wizard hermy = new Wizard("Hermione Granger", 100, 17, 150, false,hechizoPersonaje);
        hermy.setPoderInicial(parsel);
        hermy.setArtefacto(giratiempo);
        JuegoHP.PersonajesLista.add(hermy);

        Wizard ron = new Wizard("Ron Weasley", 100, 17, 150, false,hechizoPersonaje);
        ron.setArtefacto(varFresno);
        JuegoHP.PersonajesLista.add(ron);

        Wizard draquito = new Wizard("Draco Malfoy", 100, 17, 150, true,hechizoPersonaje);
        draquito.setPoderInicial(hechizo);
        draquito.setArtefacto(varEspino);
        JuegoHP.PersonajesLista.add(draquito);

        Wizard lunita = new Wizard("Luna Lovegood", 100, 16, 150, false,hechizoPersonaje);
        lunita.setPoderInicial(hechizo);
        lunita.setArtefacto(varFresno);
        JuegoHP.PersonajesLista.add(lunita);

        Wizard newtty = new Wizard("Newt Scamander", 100, 25, 150, false,hechizoPersonaje);
        newtty.setPoderInicial(hechizo);
        newtty.setArtefacto(varFresno);
        JuegoHP.PersonajesLista.add(newtty);

        Wizard voldy = new Wizard("Lord Voldemort", 100, 71, 150, true,hechizoPersonaje);
        voldy.setPoderInicial(parsel);
        voldy.setArtefacto(horrocruxy);
        JuegoHP.PersonajesLista.add(voldy);

        Wizard dumby = new Wizard("Albus Dumbledore", 100, 116, 150, false,hechizoPersonaje);
        dumby.setPoderInicial(hechizo);
        dumby.setArtefacto(varSauco);
        JuegoHP.PersonajesLista.add(dumby);

        Muggle dudley = new Muggle("Dudley Dursley",80,18);
        JuegoHP.PersonajesLista.add(dudley);

        Wizard snapey = new Wizard("Severus Snape", 90, 38, 150, true,hechizoPersonaje);
        snapey.setPoderInicial(hechizo);
        snapey.setArtefacto(varEspino);
        JuegoHP.PersonajesLista.add(snapey);

        Elfo kreachy = new Elfo("Kreacher", 50, 666, 150);
        kreachy.setPoderInicial(invisibilidad);
        JuegoHP.PersonajesLista.add(kreachy);

        Wizard bella = new Wizard("Bellatrix Lestrange", 100, 47, 150, true,hechizoPersonaje);
        bella.setPoderInicial(hechizo);
        bella.setArtefacto(varEspino);
        JuegoHP.PersonajesLista.add(bella);
        

    }

    // Hechizos
    public static void agregarHechizos() {

        AvadaKedavra avvy = new AvadaKedavra("Avada Kedavra", "Maldición de Muerte Total", true, 100, 0, 50);
        JuegoHP.HechizosAtaque.add(avvy);

        Cruciatus cruccy = new Cruciatus("Cruciatus", "Maldición de Tortura Física", true, 15, 0, 30);
        JuegoHP.HechizosAtaque.add(cruccy);

        Imperius imppy = new Imperius("Imperius", "Controlar a la victima", true, 30, 0, 20);
        JuegoHP.HechizosAtaque.add(imppy);

        PetrificusTotalus petri = new PetrificusTotalus("Petrificus Totalus", "Parálisis de cuerpo", false, 20, 0, 10);
        JuegoHP.HechizosAtaque.add(petri);

        SectumSempra sectty = new SectumSempra("Sectum Sempra", "Profundos cortes a la victima", false, 25, 0, 15);
        JuegoHP.HechizosAtaque.add(sectty);

        Episkey eppi = new Episkey("Episkey", "Cura Heridas", false, 0, 12, 8);
        JuegoHP.HechizosCuracion.add(eppi);

        Reparifors reppi = new Reparifors("Reparifors", "Cura dolencias pequeñas", false, 0, 20, 12);
        JuegoHP.HechizosCuracion.add(reppi);

        VulneraSanetur vully = new VulneraSanetur("Vulnera Sanetur", "Reduce hemorragia y cierra heridas", false, 0, 30, 20);
        JuegoHP.HechizosCuracion.add(vully);

        CaveInimicum cavvy = new CaveInimicum("Cave Inimicum", "Proteccion aleja enemigos", false, 30, 20, 40);
        JuegoHP.HechizosDefensa.add(cavvy);

        ExpectoPatronum exppy = new ExpectoPatronum("Expecto Patronum", "Repele Dementores", false, 25, 15, 30);
        JuegoHP.HechizosDefensa.add(exppy);

        Expelliarmus expelly = new Expelliarmus("Expelliarmus", "Desarma al oponente", false, 10, 0, 5);
        JuegoHP.HechizosDefensa.add(expelly);

        ProtegoMaxima protty = new ProtegoMaxima("Protego Maxima", "Crea una barrera protectora", false, 15, 20, 15);
        JuegoHP.HechizosDefensa.add(protty);

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

    public Personaje getPersonajeByName(String nombre) {
        for (Personaje personaje : PersonajesLista) {
            if (nombre.equalsIgnoreCase(personaje.getNombre())) {
                return personaje;
            }
        }
        // return System.out.println("Tu personaje no pertenece al mundo mágico");;
        return null;

    }

    public Personaje seleccionaPersonaje() {
        String Opcion;
        System.out.println("Escribe el nombre del personaje que quieras seleccionar tal cual sale en la lista: ");
        Opcion = Teclado.nextLine();
        return getPersonajeByName(Opcion);

    }

    static void mostrarListaPersonajes() {
        System.out.println("LISTA DE PERSONAJES");
        for (Personaje persona : JuegoHP.PersonajesLista) {
            System.out.println(persona.getNombre());
        }
    }

    public Hechizo elegirHechizo() { //Preguntar el forloop para imprimir la lista de hechizos.
        String nombreH;
        System.out.println("Escribe el nombre del hechizo: ");
        nombreH = Teclado.nextLine();
        for (HechizoAtaque hechizoAtaque : JuegoHP.HechizosAtaque) {
            if (nombreH.equalsIgnoreCase(hechizoAtaque.nombrePoder)) {
                return hechizoAtaque;
            }

        }  
        
        for (HechizoDefensa hechizoDefensa : JuegoHP.HechizosDefensa) {
            if (nombreH.equalsIgnoreCase(hechizoDefensa.nombrePoder)) {
                return hechizoDefensa;
            }
        
        }
        
         return null;
    }   
    
    public static void listaHechizosAtaques(){
        System.out.println("LISTA HECHIZOS DE ATAQUE");
        for(int i = 0; i<JuegoHP.HechizosAtaque.size(); i++) { 
            Hechizo h = JuegoHP.HechizosAtaque.get(i);
            System.out.println(h.nombrePoder);
        }
    }

    public static void listaHechizosDefensa(){
        System.out.println("LISTA HECHIZOS DE DEFENSA");
        for(int i = 0; i<JuegoHP.HechizosDefensa.size(); i++) { 
            Hechizo h = JuegoHP.HechizosDefensa.get(i);
            System.out.println(h.nombrePoder);
        }


    }

}