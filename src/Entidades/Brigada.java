
package Entidades;


public class Brigada {
    private int codigoBrigada;
    private String nombreBrigada;
    private String especialidad;
    private boolean libre;
    private int numeroCuartel;

    public Brigada(int codigoBrigada, String nombreBrigada, String especialidad, boolean libre, int numeroCuartel) {
        this.codigoBrigada = codigoBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.numeroCuartel = numeroCuartel;
    }

    public Brigada(String nombreBrigada, String especialidad, boolean libre, int numeroCuartel) {
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.numeroCuartel = numeroCuartel;
    }

    public Brigada() {
    }
    

    public int getCodigoBrigada() {
        return codigoBrigada;
    }

    public void setCodigoBrigada(int codigoBrigada) {
        this.codigoBrigada = codigoBrigada;
    }

    public String getNombreBrigada() {
        return nombreBrigada;
    }

    public void setNombreBrigada(String nombreBrigada) {
        this.nombreBrigada = nombreBrigada;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getNumeroCuartel() {
        return numeroCuartel;
    }

    public void setNumeroCuartel(int numeroCuartel) {
        this.numeroCuartel = numeroCuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "codigoBrigada=" + codigoBrigada + ", nombreBrigada=" + nombreBrigada + ", especialidad=" + especialidad + ", libre=" + libre + ", numeroCuartel=" + numeroCuartel + '}';
    }
    
    
    
    

}
