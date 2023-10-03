
package Entidades;

import java.sql.Date;


public class Siniestro{
    private int codigoSiniestro;
    private String Tipo;
    private Date fechaSiniestro;
    private double coordenadaX;
    private double coordenadaY;
    private String detalles;
    private Date fechaResolucion;
    private int calificacion;       
    private int brigadaId;

    public Siniestro(int codigoSiniestro, String Tipo, Date fechaSiniestro, double coordenadaX, double coordenadaY, String detalles, Date fechaResolucion, int calificacion, int brigadaId) {
        this.codigoSiniestro = codigoSiniestro;
        this.Tipo = Tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.calificacion = calificacion;
        this.brigadaId = brigadaId;
    }

    public Siniestro(String Tipo, Date fechaSiniestro, double coordenadaX, double coordenadaY, String detalles, Date fechaResolucion, int calificacion, int brigadaId) {
        this.Tipo = Tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.calificacion = calificacion;
        this.brigadaId = brigadaId;
    }

    public Siniestro() {
    }
    

    public int getCodigoSiniestro() {
        return codigoSiniestro;
    }

    public void setCodigoSiniestro(int codigoSiniestro) {
        this.codigoSiniestro = codigoSiniestro;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Date getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(Date fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getBrigadaId() {
        return brigadaId;
    }

    public void setBrigadaId(int brigadaId) {
        this.brigadaId = brigadaId;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "codigoSiniestro=" + codigoSiniestro + ", Tipo=" + Tipo + ", fechaSiniestro=" + fechaSiniestro + ", coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", detalles=" + detalles + ", fechaResolucion=" + fechaResolucion + ", calificacion=" + calificacion + ", brigadaId=" + brigadaId + '}';
    }
    
   
   
}



