package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.RepaintManager;

import app.personajes.Elfo;
import app.personajes.Personaje;
import app.personajes.Wizard;
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
    harry.setArtefacto(//poner el onjeto artefacto cuando lo creemos//);
    harry.setPoderInicial();
    JuegoHP.Personajes.add(harry);

    Elfo dobby = new Elfo("Dobby", 100, 60, 100);
    dobby.setArtefacto();
    dobby.setPoderInicial();
    JuegoHP.Personajes.add(dobby);
 }

    public static void agregarHechizos() {

        AvadaKedavra avvy = new AvadaKedavra(true, 100, 0, 50);
        JuegoHP.Hechizos.add(avvy);

        Cruciatus cruccy = new Cruciatus(true, 40, 0, 30);
        JuegoHP.Hechizos.add(cruccy);

        Imperius imppy = new Imperius(true, 30, 0, 20);
        JuegoHP.Hechizos.add(imppy);

        PetrificusTotalus petri = new PetrificusTotalus(false, 20, 0, 10);
        JuegoHP.Hechizos.add(petri);

        SectumSempra sectty = new SectumSempra(false, 25, 0, 15);
        JuegoHP.Hechizos.add(sectty);

        Episkey eppi = new Episkey(false, 0, 12,8);
        JuegoHP.Hechizos.add(eppi);

        Reparifors reppi = new Reparifors(false, 0, 20, 12);
        JuegoHP.Hechizos.add(reppi);

        VulneraSanetur vully = new VulneraSanetur(false, 0, 30, 20);
        JuegoHP.Hechizos.add(vully);

        CaveInimicum cavvy = new CaveInimicum(false, 30, 20, 40);
        JuegoHP.Hechizos.add(cavvy);

        ExpectoPatronum exppy = new ExpectoPatronum(false,25, 15, 30 );
        JuegoHP.Hechizos.add(exppy);

        Expelliarmus expelly = new Expelliarmus(false, 10, 0, 5);
        JuegoHP.Hechizos.add(expelly);

        ProtegoMaxima protty = new ProtegoMaxima(false, 15, 20, 15);
        JuegoHP.Hechizos.add(protty);

        Alohomora aloho = new Alohomora(false, 0, 0, 7);
        JuegoHP.Hechizos.add(aloho);

        Lumos lummy = new Lumos(false, 0, 0, 3);
        JuegoHP.Hechizos.add(lummy);

        WingwardiumLeviosa winggy = new WingwardiumLeviosa(false, 0, 0, 9);
        JuegoHP.Hechizos.add(winggy);

    }
 
}
