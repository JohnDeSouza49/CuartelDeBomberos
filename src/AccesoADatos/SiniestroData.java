package AccesoADatos;

import Entidades.Cuartel;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
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
      public double distanciaEntreDosPuntos(Siniestro siniestro, Cuartel cuartel) {
        
        int x1 =siniestro.getCoordenadaX();
        int y1 = siniestro.getCoordenadaY();

        int x2 = cuartel.getCoordenadaX();
        int y2 = cuartel.getCoordenadaY();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
    
     public Cuartel cuartelMasCercano(Siniestro siniestro){
         ArrayList<Cuartel> dist = new ArrayList<>();
         double resultado=0;
         double mayor=0;
         double menor=0;
         Cuartel cercano=null;
         Cuartel lejano=null;
         CuartelData cd= new CuartelData();
         List<Cuartel> cuartel = new ArrayList<>();
         cuartel=cd.mostrarTodosCuarteles();
         for(Cuartel aux:cuartel){
              resultado=distanciaEntreDosPuntos(siniestro, aux);
              Cuartel a= new Cuartel(aux.getCodigoCuartel(), aux.getNombreCuartel(), aux.getDireccion(), aux.getTelefono(), aux.getCorreoElectronico(), resultado);
              dist.add(a);
              
     }
         for (int i = 0; i < dist.size(); i++) {
             Cuartel cuartelActual=dist.get(i); 
             double disActual=cuartelActual.getDistancia();
             
             if(disActual>mayor){
                 mayor=disActual;
                 lejano=cuartelActual;
             }
       
   } 
         menor=mayor;
               for (int i = 0; i < dist.size(); i++) {
             Cuartel cuartelActual=dist.get(i);
             double disActual=cuartelActual.getDistancia();
             if(disActual<menor){
                 menor=disActual;
                 cercano=cuartelActual;
             }
      
   }
               System.out.println(cercano.getDistancia());
  
         return cercano;

}
     }
     
     
