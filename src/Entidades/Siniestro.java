package Entidades;

import java.sql.Date;
import java.time.LocalDate;

public class Siniestro {

    private int codigoSiniestro;
    private String tipo;
    private LocalDate fechaSiniestro;
    private int coordenadaX;
    private int coordenadaY;
    private String detalles;
    private LocalDate fechaResolucion;
    private int puntuacion;
    private int codigoBrigada;

    public Siniestro(int codigoSiniestro, String tipo, LocalDate fechaSiniestro, int coordenadaX, int coordenadaY, String detalles, LocalDate fechaResolucion, int calificacion, int codigoBrigada) {
        this.codigoSiniestro = codigoSiniestro;
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = calificacion;
        this.codigoBrigada = codigoBrigada;
    }

    public Siniestro(String tipo, LocalDate fechaSiniestro, int coordenadaX, int coordenadaY, String detalles, LocalDate fechaResolucion, int calificacion, int codigoBrigada) {
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = calificacion;
        this.codigoBrigada = codigoBrigada;
    }

    public Siniestro() {
    }

    public Siniestro(String tipo, LocalDate fechaSiniestro, int coordenadaX, int coordenadaY) {
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public Siniestro(String tipo, LocalDate fechaSiniestro, int coordenadaX, int coordenadaY, String detalles, int codigoBrigada) {
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.codigoBrigada = codigoBrigada;
    }

    public Siniestro(int codigoSiniestro, String tipo, LocalDate fechaSiniestro, LocalDate fechaResolucion, int puntuacion, int codigoBrigada) {
        this.codigoSiniestro = codigoSiniestro;
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codigoBrigada = codigoBrigada;
    }

  
  
 
    public int getCodigoSiniestro() {
        return codigoSiniestro;
    }

    public void setCodigoSiniestro(int codigoSiniestro) {
        this.codigoSiniestro = codigoSiniestro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(LocalDate fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getCodigoBrigada() {
        return codigoBrigada;
    }

    public void setCodigoBrigada(int codigoBrigada) {
        this.codigoBrigada = codigoBrigada;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "codigoSiniestro=" + codigoSiniestro + ", Tipo=" + tipo + ", fechaSiniestro=" + fechaSiniestro + ", coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", detalles=" + detalles + ", fechaResolucion=" + fechaResolucion + ", calificacion=" + puntuacion + ", codigoBrigada=" + codigoBrigada + '}';
    }

}
