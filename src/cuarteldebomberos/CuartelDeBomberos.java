
package cuarteldebomberos;
import AccesoADatos.BomberoData;
import java.time.LocalDate;
import AccesoADatos.Conexion;
import AccesoADatos.CuartelData;
import Entidades.Bombero;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CuartelDeBomberos {

   
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
    
    //Bombero bob = new Bombero(25896314, "Anibal Gimenez", LocalDate.of(1980, 3, 15), 1125896325, "AB RH+", 1, true);
  // BomberoData bd = new BomberoData();
  // bd.guardarBombero(bob);
  Cuartel c2 = new Cuartel("Cuartel2","Calle2" , 4, 5, 1146668951, "cuartel2@gmail.com");
  CuartelData cu2 = new CuartelData();
  cu2.crearCuartel(c2);
    } 
}

