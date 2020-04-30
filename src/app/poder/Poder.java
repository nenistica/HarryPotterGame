package app.poder;

public class Poder {
     //Attr 
    String nombrePoder;
    String descripcionPoder;
    Integer nroPoder;
    //Constructor 
    public Poder(String nombrePoder, String descripcionPoder, Integer nroPoder) {
        this.nombrePoder = nombrePoder;
        this.descripcionPoder = descripcionPoder;
        this.nroPoder = nroPoder;
    }
    //Getters & Setters
    public String getNombrePoder() {
        return nombrePoder;
    }

    public void setNombrePoder(String nombrePoder) {
        this.nombrePoder = nombrePoder;
    }

    public String getDescripcionPoder() {
        return descripcionPoder;
    }

    public void setDescripcionPoder(String descripcionPoder) {
        this.descripcionPoder = descripcionPoder;
    }

    public Integer getNroPoder() {
        return nroPoder;
    }

    public void setNroPoder(Integer nroPoder) {
        this.nroPoder = nroPoder;
    }

}
