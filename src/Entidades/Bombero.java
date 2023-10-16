
package Entidades;

import java.sql.Date;
import java.time.LocalDate;


public class Bombero {

    private int idBombero;
    private int dni;
    private String nombreApellido;
    private LocalDate fechaNac;
    private int celular;
    private int codigoBrigada;
    private boolean estado;
    private String grupoSanguineo;
    private int codigoCuartel;
    
    public Bombero() {
    }

    public Bombero(int idBombero, int dni, String nombreApellido, LocalDate fechaNac, int celular, int codigoBrigada, boolean estado,String grupoSanguineo, int codigoCuartel) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.grupoSanguineo =grupoSanguineo;
        this.codigoBrigada = codigoBrigada;
        this.estado = estado;
        this.codigoCuartel = codigoCuartel;
    }

    public Bombero(int dni, String nombreApellido, LocalDate fechaNac, int celular, int codigoBrigada, boolean estado,String grupoSanguineo, int codigoCuartel) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codigoBrigada = codigoBrigada;
        this.estado = estado;
        this.grupoSanguineo = grupoSanguineo;
        this.codigoCuartel = codigoCuartel;
      
    }

    public Bombero(int dni, String nombreApellido, LocalDate fechaNac, int codigoBrigada, boolean estado) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.codigoBrigada = codigoBrigada;
        this.estado = estado;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getCodigoCuartel() {
        return codigoCuartel;
    }

    public void setCodigoCuartel(int codigoCuartel) {
        this.codigoCuartel = codigoCuartel;
    }

  

    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    
    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
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
        return "Bombero{" + "idBombero=" + idBombero + ", dni=" + dni + ", nombreApellido=" + nombreApellido + ", fechaNac=" + fechaNac + ", celular=" + celular + ", codigoBrigada=" + codigoBrigada + ", estado=" + estado + ", grupoSanguineo=" + grupoSanguineo + ", codigoCuartel=" + codigoCuartel + '}';
    }

   

    

   
}
