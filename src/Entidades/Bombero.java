
package Entidades;

import java.sql.Date;
import java.time.LocalDate;


public class Bombero {

    private int idBombero;
    private int dni;
    private String nombreApellido;
    private LocalDate fechaNac;
    private int celular;
    private String grupoSangineo;
    private int codigoBrigada;
    private boolean estado;
    public Bombero() {
    }

    public Bombero(int idBombero, int dni, String nombreApellido, LocalDate fechaNac, int celular,String grupoSangineo, int codigoBrigada, boolean estado) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.grupoSangineo =grupoSangineo;
        this.codigoBrigada = codigoBrigada;
        this.estado = estado;
    }

    public Bombero(int dni, String nombreApellido, LocalDate fechaNac, int celular, int codigoBrigada, boolean estado) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codigoBrigada = codigoBrigada;
        this.estado = estado;
    }

    public Bombero(int dni, String nombreApellido, LocalDate fechaNac, int codigoBrigada, boolean estado) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.codigoBrigada = codigoBrigada;
        this.estado = estado;
    }

    public Bombero(int dni, String nombreApellido, LocalDate fechaNac, int celular, String grupoSangineo, int codigoBrigada, boolean estado) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.grupoSangineo = grupoSangineo;
        this.codigoBrigada = codigoBrigada;
        this.estado = estado;
    }
    

    public String getGrupoSangineo() {
        return grupoSangineo;
    }

    public void setGrupoSangineo(String grupoSangineo) {
        this.grupoSangineo = grupoSangineo;
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
        return "Bombero{" + "idBombero=" + idBombero + ", dni=" + dni + ", nombreApellido=" + nombreApellido + ", fechaNac=" + fechaNac + ", celular=" + celular + ", codigoBrigada=" + codigoBrigada + ", estado=" + estado + '}';
    }

   
}
