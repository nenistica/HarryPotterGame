package app.interfaces;

import app.artefactos.Artefacto;
import app.personajes.Personaje;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

public interface IHaceMagia {
    // Métodos de Interface IHacemagia
    public int getEnergiaMagica();

    public void setEnergiaMagica(int energiaMagica);

    public Poder getPoderInicial();

    public void setPoderInicial(Poder poderInicial);

    public Artefacto getArtefacto();

    public void aprender(Hechizo h);

    public void atacar(Personaje personaje, Hechizo hechizo);

    public void atacar(Personaje personaje, String hechizo);

}
