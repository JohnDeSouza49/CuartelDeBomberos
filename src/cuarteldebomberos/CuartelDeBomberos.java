
package cuarteldebomberos;
import AccesoADatos.BomberoData;
import java.time.LocalDate;
import AccesoADatos.Conexion;
import Entidades.Bombero;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CuartelDeBomberos {

   
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
    
    Bombero bob = new Bombero(25896314, "Anibal Gimenez", LocalDate.of(1980, 3, 15), 1125896325, "AB RH+", 12, true);
   BomberoData bd = new BomberoData();
   bd.guardarBombero(bob);
    } 
}

