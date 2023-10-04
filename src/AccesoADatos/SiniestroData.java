package AccesoADatos;

import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SiniestroData {
       
     private Connection con = null;
    private String sql;

    public SiniestroData() {
     con = Conexion.getConexion();
    
}
     public void guardarSiniestro(Siniestro siniestro) {

        String sql = "INSERT INTO siniestro (tipo, fechaSiniestro, coordenadaX, coordenadaY, detalles, fechaResol, puntuacion, codigoBrigada) VALUES (? ,?, ?, ?, ?, ?, ?, ?)";
    
         try{    
         
          PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          ps.setString(1,siniestro.getTipo());
          ps.setDate(2,Date.valueOf(siniestro.getFechaSiniestro()));
          ps.setInt(3, siniestro.getCoordenadaX());
          ps.setInt(4, siniestro.getCoordenadaY());
          ps.setString(5, siniestro.getDetalles());
          ps.setDate(6, Date.valueOf(siniestro.getFechaResolucion()));
          ps.setInt(7, siniestro.getPuntuacion());
          ps.setInt(8, siniestro.getCodigoBrigada());
          ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                siniestro.setCodigoSiniestro(rs.getInt(1));
               
                JOptionPane.showMessageDialog(null, "Siniestro añadido con exito.");
            }
         }
           
catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "hay un error al cargar el siniestro"+ex.getMessage());
    
                }

}
    
}
