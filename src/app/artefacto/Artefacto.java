package app.artefacto;

import app.interfaces.IEsMagico;
import app.poder.Poder;

public class Artefacto implements IEsMagico {
    // Attr
    String nombreArtefacto;
    double amplificadorDeDanio;
    double amplificadorDeCuracion;
    Poder poderArtefacto;

    // Constructores
    public Artefacto(String nombreArtefacto, double amplificadorDeDanio, double amplificadorDeCuracion,
            Poder poderArtefacto) {
        this.nombreArtefacto = nombreArtefacto;
        this.amplificadorDeDanio = amplificadorDeDanio;
        this.amplificadorDeCuracion = amplificadorDeCuracion;
        this.poderArtefacto = poderArtefacto;
    }

    // Getter & Setter
    public String getNombreArtefacto() {
        return nombreArtefacto;
    }

    public void setNombreArtefacto(String nombreArtefacto) {
        this.nombreArtefacto = nombreArtefacto;
    }

    public double getAmplificadorDeDanio() {
        return amplificadorDeDanio;
    }

    public void setAmplificadorDeDanio(double amplificadorDeDanio) {
        this.amplificadorDeDanio = amplificadorDeDanio;
    }

    public double getAmplificadorDeCuracion() {
        return amplificadorDeCuracion;
    }

    public void setAmplificadorDeCuracion(double amplificadorDeCuracion) {
        this.amplificadorDeCuracion = amplificadorDeCuracion;
    }

    public Poder getPoderArtefacto() {
        return poderArtefacto;
    }

    public void setPoderArtefacto(Poder poderArtefacto) {
        this.poderArtefacto = poderArtefacto;
    }

}
