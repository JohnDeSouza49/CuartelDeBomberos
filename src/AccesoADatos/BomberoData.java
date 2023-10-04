
package AccesoADatos;


import Entidades.Bombero;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;

public class BomberoData {
     private Connection con = null;
    private String sql;

    public BomberoData() {
     con = Conexion.getConexion();
    
}
     public void guardarBombero(Bombero bombero) {

        String sql = "INSERT INTO bombero (dni, nombreApellido, fechaNac, celular, codigoBrigada,estado,grupoSanguineo) VALUES (? ,?, ?, ?, ?, ?, ?)";
    
         try{    
         
          PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          ps.setInt(1,bombero.getDni());
          ps.setString(2,bombero.getNombreApellido());
          ps.setDate(3, Date.valueOf(bombero.getFechaNac()));
          ps.setInt(4, bombero.getCelular());
          ps.setInt(5, bombero.getCodigoBrigada());
          ps.setBoolean(6, bombero.isEstado());
          ps.setString(7, bombero.getGrupoSangineo());
          ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setIdBombero(rs.getInt(1));
               
                JOptionPane.showMessageDialog(null, "Bombero añadido con exito.");
            }
         }
           
catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "hay un error al cargar el bombero"+ex.getMessage());
    
                } 

}
   public void modificarBomberoActivo( Bombero bombero){
     String sql="UPDATE bombero SET dni=?, nombreApellido =?,fechaNac=?,celular=?,codigoBrigada=?,grupoSanguineo=? where idBombero=? and estado=1" ;
         try {
             PreparedStatement ps= con.prepareStatement(sql);
             ps.setInt(1, bombero.getDni());
             ps.setString(2, bombero.getNombreApellido());
             ps.setDate(3, Date.valueOf(bombero.getFechaNac()));
             ps.setInt(4, bombero.getCelular());
             ps.setInt(5, bombero.getCodigoBrigada());
             ps.setString(6, bombero.getGrupoSangineo());
             ps.setInt(7, bombero.getIdBombero());
             int exito= ps.executeUpdate();
                if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El bombero no existe o no se encuentra activo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero " + ex.getMessage());
        }
             
         
   }  
     
}
               
                  
