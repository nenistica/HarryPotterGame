package app.poder.hechizo;

import app.poder.Poder;

public class Hechizo extends Poder {

    public boolean esOscuro;
    public int nivelDanio;
    public int nivelCuracion;
    public int energiaMagicaHechizo;

        
    public Hechizo(String nombrePoder, String descripcionPoder, Integer nroPoder, boolean esOscuro, int nivelDanio,
            int nivelCuracion, int energiaMagicaHechizo) {
        super(nombrePoder, descripcionPoder, nroPoder);
        this.esOscuro = esOscuro;
        this.nivelDanio = nivelDanio;
        this.nivelCuracion = nivelCuracion;
        this.energiaMagicaHechizo = energiaMagicaHechizo;
    }

    public boolean isEsOscuro() {
        return esOscuro;
    }

    public void setEsOscuro(boolean esOscuro) {
        this.esOscuro = esOscuro;
    }

    public int getNivelDanio() {
        return nivelDanio;
    }

    public void setNivelDanio(int nivelDanio) {
        this.nivelDanio = nivelDanio;
    }

    public int getNivelCuracion() {
        return nivelCuracion;
    }

    public void setNivelCuracion(int nivelCuracion) {
        this.nivelCuracion = nivelCuracion;
    }

    public int getEnergiaMagicaHechizo() {
        return energiaMagicaHechizo;
    }

    public void setEnergiaMagicaHechizo(int energiaMagicaHechizo) {
        this.energiaMagicaHechizo = energiaMagicaHechizo;
    }



    

    


}
