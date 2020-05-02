package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.personajes.Personaje;
import app.personajes.Wizard;
import app.poderes.hechizos.Hechizo;

public class JuegoHP {
 public static Scanner Teclado = new Scanner(System.in);   

 public static List<Personaje> Personajes = new ArrayList<Personaje>();
 public static List<Hechizo> Hechizos = new ArrayList<Hechizo>();

 public static void agregarPersonajes(){

    Wizard harry = new Wizard("Harry Potter", 100, 17, 100, false);
    Wizard.setArtefacto(//poner el onjeto artefacto cuando lo creemos//);
    Wizard.setPoderInicial();
    JuegoHP.Personajes.add(harry);

    Elfo dobby = new Elfo("")
    
 }
 
}
