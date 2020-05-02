package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import app.artefactos.Artefacto;
import app.artefactos.CapaInvisibilidad;
import app.personajes.Elfo;
import app.personajes.Personaje;
import app.personajes.Wizard;
import app.poderes.Parseltongue;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.poderes.hechizos.ataques.AvadaKedavra;
import app.poderes.hechizos.ataques.Cruciatus;
import app.poderes.hechizos.ataques.Imperius;
import app.poderes.hechizos.ataques.PetrificusTotalus;
import app.poderes.hechizos.ataques.SectumSempra;
import app.poderes.hechizos.curaciones.Episkey;
import app.poderes.hechizos.curaciones.Reparifors;
import app.poderes.hechizos.curaciones.VulneraSanetur;
import app.poderes.hechizos.defensas.CaveInimicum;
import app.poderes.hechizos.defensas.ExpectoPatronum;
import app.poderes.hechizos.defensas.Expelliarmus;
import app.poderes.hechizos.defensas.ProtegoMaxima;
import app.poderes.hechizos.ocios.Alohomora;
import app.poderes.hechizos.ocios.Lumos;
import app.poderes.hechizos.ocios.WingwardiumLeviosa;

public class JuegoHP {
    public static Scanner Teclado = new Scanner(System.in);

    public static List<Personaje> Personajes = new ArrayList<Personaje>();
    public static List<Hechizo> Hechizos = new ArrayList<Hechizo>();

 public static void agregarPersonajes(){

    Wizard harry = new Wizard("Harry Potter", 100, 17, 100, false);
    Poder parsel = new Parseltongue("Lengua Parsel", "Pude hablar con serpientes");
    Artefacto capaInvisible = new CapaInvisibilidad("Capa Invisibilidad", 0, 0.4);
    harry.setArtefacto(capaInvisible);
    harry.setPoderInicial(parsel);
    JuegoHP.Personajes.add(harry);

    Elfo dobby = new Elfo("Dobby", 100, 60, 100);
    JuegoHP.Personajes.add(dobby);
 }

    public static void agregarHechizos() {

        AvadaKedavra avvy = new AvadaKedavra("Avada Kedavra","Maldición de Muerte Total",true, 100, 0, 50);
        JuegoHP.Hechizos.add(avvy);

        Cruciatus cruccy = new Cruciatus("Cruciatus","Maldición de Tortura Física",true, 40, 0, 30);
        JuegoHP.Hechizos.add(cruccy);

        Imperius imppy = new Imperius("Imperius","Controlar a la victima",true, 30, 0, 20);
        JuegoHP.Hechizos.add(imppy);

        PetrificusTotalus petri = new PetrificusTotalus("Petrificus Totales","Parálisis de cuerpo",false, 20, 0, 10);
        JuegoHP.Hechizos.add(petri);

        SectumSempra sectty = new SectumSempra("Sectum Sempra","Profundos cortes a la victima",false, 25, 0, 15);
        JuegoHP.Hechizos.add(sectty);

        Episkey eppi = new Episkey("Episkey","Cura Heridas",false, 0, 12, 8);
        JuegoHP.Hechizos.add(eppi);

        Reparifors reppi = new Reparifors("Reparifors","Cura dolencias pequeñas",false, 0, 20, 12);
        JuegoHP.Hechizos.add(reppi);

        VulneraSanetur vully = new VulneraSanetur("Vulnera Sanetur","Reduce hemorragia y cierra heridas",false, 0, 30, 20);
        JuegoHP.Hechizos.add(vully);

        CaveInimicum cavvy = new CaveInimicum("Cave Inimicum","Proteccion aleja enemigos",false, 30, 20, 40);
        JuegoHP.Hechizos.add(cavvy);

        ExpectoPatronum exppy = new ExpectoPatronum("Expecto Patronum","Repele Dementores",false, 25, 15, 30);
        JuegoHP.Hechizos.add(exppy);

        Expelliarmus expelly = new Expelliarmus("Expelliarmus","Desarma al oponente",false, 10, 0, 5);
        JuegoHP.Hechizos.add(expelly);

        ProtegoMaxima protty = new ProtegoMaxima("Protego Maxima","Crea una barrera protectora",false, 15, 20, 15);
        JuegoHP.Hechizos.add(protty);

        Alohomora aloho = new Alohomora("Alohomora","Abre puertas con cerraduras",false, 0, 0, 7);
        JuegoHP.Hechizos.add(aloho);

        Lumos lummy = new Lumos("Lumos","Ilumina la punta de la varita",false, 0, 0, 3);
        JuegoHP.Hechizos.add(lummy);

        WingwardiumLeviosa winggy = new WingwardiumLeviosa("Wingwardium Leviosa","Levitar objetos",false, 0, 0, 9);
        JuegoHP.Hechizos.add(winggy);

    }

    



    
 
}
