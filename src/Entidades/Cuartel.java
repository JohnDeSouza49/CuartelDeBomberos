
package Entidades;


public class Cuartel {
    
   
private int codigoCuartel;
private String nombreCuartel;
private String direccion;
private int coordenadaX;
private int coordenadaY;
private int telefono;
private String correoElectronico;
private double distancia;

    public Cuartel(int codigoCuartel, String nombreCuartel, String direccion, int coordenadaX, int coordenadaY, int telefono, String correoElectronico) {
        this.codigoCuartel = codigoCuartel;
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public Cuartel(String nombreCuartel, String direccion, int coordenadaX, int coordenadaY, int telefono, String correoElectronico) {
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public Cuartel(String nombreCuartel, String direccion, int telefono, String correoElectronico) {
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public Cuartel(int codigoCuartel, String nombreCuartel, String direccion, int telefono, String correoElectronico, double distancia) {
        this.codigoCuartel = codigoCuartel;
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.distancia = distancia;
    }

  

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Cuartel() {
    }

    public int getCodigoCuartel() {
        return codigoCuartel;
    }

    public void setCodigoCuartel(int codigoCuartel) {
        this.codigoCuartel = codigoCuartel;
    }

    public String getNombreCuartel() {
        return nombreCuartel;
    }

    public void setNombreCuartel(String nombreCuartel) {
        this.nombreCuartel = nombreCuartel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Cuartel{" + "codigoCuartel=" + codigoCuartel + ", nombreCuartel=" + nombreCuartel + ", direccion=" + direccion + " telefono=" + telefono + ", correoElectronico=" + correoElectronico + '}';
    }

  
    
    
}
