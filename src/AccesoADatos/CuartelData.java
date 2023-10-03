 package AccesoADatos;

/**
 *
 * @author Kanji
 */
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CuartelData {
    
     private Connection con = null;
     private String sql;
     public CuartelData() {
     
    con = Conexion.getConexion();
    
}
     public void crearCuartel(Cuartel cuartel){
        String sql = "INSERT INTO cuartel(nombreCuartel, direccion, coordenadaX, coordenadaY, telefono, correo)VALUES (?, ?, ?, ?, ?, ?)";
        
         try {
           PreparedStatement  ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          ps.setString(1,cuartel.getNombreCuartel());
          ps.setString(2, cuartel.getDireccion());
          ps.setInt(3, cuartel.getCoordenadaX());
          ps.setInt(4, cuartel.getCoordenadaY());
          ps.setInt(5, cuartel.getTelefono());
          ps.setString(6, cuartel.getCorreoElectronico());
          ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cuartel.setCodigoCuartel(rs.getInt(1));
               
                JOptionPane.showMessageDialog(null, "Cuartel creado con exito.");
            }
         }
         
         
          catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "hay un error al cargar el cuartel"+ex.getMessage());
         }
       
     
     }
     
     
}