package app.interfaces;

import app.artefactos.Artefacto;
import app.personajes.Personaje;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

public interface IHaceMagia {

    public int getEnergiaMagica();

    public void setEnergiaMagica(int energiaMagica);

    public Poder getPoderInicial();

    public void setPoder(Poder poder);

    public Artefacto getArtefacto();
    
    public void aprender(Hechizo h);

    public void atacar(Personaje personaje, Hechizo hechizo);

    public void atacar (Personaje personaje, String hechizo);
    
}
