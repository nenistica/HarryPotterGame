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

        AvadaKedavra avvy = new AvadaKedavra();
        JuegoHP.Hechizos.add(avvy);

        Cruciatus cruccy = new Cruciatus();
        JuegoHP.Hechizos.add(cruccy);

        Imperius imppy = new Imperius();
        JuegoHP.Hechizos.add(imppy);

        PetrificusTotalus petri = new PetrificusTotalus();
        JuegoHP.Hechizos.add(petri);

        SectumSempra sectty = new SectumSempra();
        JuegoHP.Hechizos.add(sectty);

        Episkey eppi = new Episkey();
        JuegoHP.Hechizos.add(eppi);

        Reparifors reppi = new Reparifors();
        JuegoHP.Hechizos.add(reppi);

        VulneraSanetur vully = new VulneraSanetur();
        JuegoHP.Hechizos.add(vully);

        CaveInimicum cavvy = new CaveInimicum();
        JuegoHP.Hechizos.add(cavvy);

        ExpectoPatronum exppy = new ExpectoPatronum();
        JuegoHP.Hechizos.add(exppy);

        Expelliarmus expelly = new Expelliarmus();
        JuegoHP.Hechizos.add(expelly);

        ProtegoMaxima protty = new ProtegoMaxima();
        JuegoHP.Hechizos.add(protty);

        Alohomora aloho = new Alohomora();
        JuegoHP.Hechizos.add(aloho);

        Lumos lummy = new Lumos();
        JuegoHP.Hechizos.add(lummy);

        WingwardiumLeviosa winggy = new WingwardiumLeviosa();
        JuegoHP.Hechizos.add(winggy);

    }
 
}
