/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Brigada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BrigadaData {
    private Connection con=null;

    public BrigadaData() {
        con=Conexion.getConexion();
    }
     public void guardarBrigada(Brigada brigada){
         String sql="INSERT INTO brigada(nombreBrigada, especialidad, libre, numeroCuartel) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombreBrigada());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getNumeroCuartel());
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                brigada.setCodigoBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Brigada Añadida");
            }else{
                JOptionPane.showMessageDialog(null, "Error al añadir brigada");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir la brigada");
        }
         
     }
    
     public List<Brigada> brigadasLibres() {
         List<Brigada> brigadas = new ArrayList<>();
         Brigada b=null;
         String sql="SELECT codigoBrigada, nombreBrigada, especialidad,  numeroCuartel from brigada where libre=1";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                b= new Brigada();
                b.setCodigoBrigada(rs.getInt("codigoBrigada"));
                b.setNombreBrigada(rs.getString("nombreBrigada"));
                b.setEspecialidad(rs.getString("especialidad"));
                b.setNumeroCuartel(rs.getInt("numeroCuartel"));
                b.setLibre(true);
                brigadas.add(b);
                ps.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al obtener las brigadas libres");
        }
        return brigadas;
     }
         public List<Brigada> brigadasAsignadas() {
         List<Brigada> brigadas = new ArrayList<>();
         Brigada b=null;
         String sql="SELECT codigoBrigada, nombreBrigada, especialidad, numeroCuartel from brigada where libre=0";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                b= new Brigada();
                b.setCodigoBrigada(rs.getInt("codigoBrigada"));
                b.setNombreBrigada(rs.getString("nombreBrigada"));
                b.setEspecialidad(rs.getString("especialidad"));
                b.setNumeroCuartel(rs.getInt("numeroCuartel"));
                brigadas.add(b);
                ps.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al obtener las brigadas libres");
        }
        return brigadas;
     }
}
