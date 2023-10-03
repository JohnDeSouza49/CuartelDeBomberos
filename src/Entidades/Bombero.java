
package Entidades;

import java.sql.Date;


public class Bombero {

    private int idBombero;
    private String dni;
    private String nombreApellido;
    private Date fechaNac;
    private String celular;
    private int codigoBrigada;
    private boolean estado;
    public Bombero() {
    }

    public Bombero(int idBombero, String dni, String nombreApellido, Date fechaNac, String celular, int codigoBrigada, boolean estado) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codigoBrigada = codigoBrigada;
        this.estado = estado;
    }

    public Bombero(String dni, String nombreApellido, Date fechaNac, String celular, int codigoBrigada, boolean estado) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codigoBrigada = codigoBrigada;
        this.estado = estado;
    }

    public Bombero(String dni, String nombreApellido, Date fechaNac, int codigoBrigada, boolean estado) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.codigoBrigada = codigoBrigada;
        this.estado = estado;
    }

    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getCodigoBrigada() {
        return codigoBrigada;
    }

    public void setCodigoBrigada(int codigoBrigada) {
        this.codigoBrigada = codigoBrigada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bombero{" + "idBombero=" + idBombero + ", dni=" + dni + ", nombreApellido=" + nombreApellido + ", fechaNac=" + fechaNac + ", celular=" + celular + ", codigoBrigada=" + codigoBrigada + ", estado=" + estado + '}';
    }

   
}
