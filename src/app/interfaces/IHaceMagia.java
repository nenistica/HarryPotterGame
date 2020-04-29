package app.interfaces;

import app.artefacto.Artefacto;
import app.personaje.Personaje;
import app.poder.Poder;
import app.poder.hechizo.Hechizo;

public interface IHaceMagia {

    public int getEnergiaMagica();

    public void setEnergiaMagica();

    public Poder getPoderInicial();

    public void setPoder(Poder poderInicial);

    public Artefacto getArtefacto();

    public void aprender(Hechizo h);

    public void atacar(Personaje personaje, String hechizo);

    public void atacar(Personaje personaje, Hechizo hechizo);
}
