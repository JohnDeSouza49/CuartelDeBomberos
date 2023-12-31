
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

    private Connection con = null;

    public BrigadaData() {
        con = Conexion.getConexion();
    }

    public void guardarBrigada(Brigada brigada) {
        String sql = "INSERT INTO brigada(nombreBrigada, especialidad, libre, numeroCuartel) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombreBrigada());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getNumeroCuartel());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                brigada.setCodigoBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Brigada Añadida");
            } else {
                JOptionPane.showMessageDialog(null, "Error al añadir brigada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir la brigada");
        }

    }

    public List<Brigada> brigadasLibres() {
        List<Brigada> brigadas = new ArrayList<>();
        Brigada b = null;
        String sql = "SELECT codigoBrigada, nombreBrigada, especialidad,  numeroCuartel from brigada where libre=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                b = new Brigada();
                b.setCodigoBrigada(rs.getInt("codigoBrigada"));
                b.setNombreBrigada(rs.getString("nombreBrigada"));
                b.setEspecialidad(rs.getString("especialidad"));
                b.setNumeroCuartel(rs.getInt("numeroCuartel"));
                b.setLibre(true);
                brigadas.add(b);
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al obtener las brigadas libres");
        }
        return brigadas;
    }

    public List<Brigada> brigadasAsignadas() {
        List<Brigada> brigadas = new ArrayList<>();
        Brigada b = null;
        String sql = "SELECT codigoBrigada, nombreBrigada, especialidad, numeroCuartel from brigada where libre=0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                b = new Brigada();
                b.setCodigoBrigada(rs.getInt("codigoBrigada"));
                b.setNombreBrigada(rs.getString("nombreBrigada"));
                b.setEspecialidad(rs.getString("especialidad"));
                b.setNumeroCuartel(rs.getInt("numeroCuartel"));
                brigadas.add(b);
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al obtener las brigadas libres");
        }
        return brigadas;
    }

    public List<Brigada> brigadaslibresxCuartel(int id) {
        List<Brigada> brigadas = new ArrayList<>();
        Brigada b = null;
        String sql = "SELECT * FROM brigada WHERE numeroCuartel=? and libre=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                b = new Brigada();
                b.setCodigoBrigada(rs.getInt("codigoBrigada"));
                b.setNombreBrigada(rs.getString("nombreBrigada"));
                b.setEspecialidad(rs.getString("especialidad"));
                b.setNumeroCuartel(rs.getInt("numeroCuartel"));
                b.setLibre(true);
                brigadas.add(b);
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BrigadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return brigadas;

    }

    public List<Brigada> brigadaPorCuartel(int numeroCuartel) {

        List<Brigada> brigadas = new ArrayList<>();
        Brigada br = null;
        String consulta = "SELECT * FROM brigada WHERE numeroCuartel=?";
        try {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, numeroCuartel);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                br = new Brigada();
                br.setCodigoBrigada(rs.getInt("codigoBrigada"));
                br.setNombreBrigada(rs.getString("nombreBrigada"));
                br.setEspecialidad(rs.getString("especialidad"));
                br.setLibre(rs.getBoolean("libre"));
                brigadas.add(br);
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(BrigadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return brigadas;

    }

    public void brigadaOcupada(Brigada b) {
        int codigo = b.getCodigoBrigada();
        String sql = "UPDATE brigada SET libre=0 WHERE codigoBrigada=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BrigadaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Brigada buscarBrigada(int codigo) {

        String sql = "SELECT * FROM brigada  where codigoBrigada=?";
        Brigada br =null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                br = new Brigada();
                br.setCodigoBrigada(rs.getInt("codigoBrigada"));
                br.setEspecialidad(rs.getString("especialidad"));
                br.setNombreBrigada(rs.getString("nombreBrigada"));
                br.setLibre(rs.getBoolean("libre"));
                br.setNumeroCuartel(rs.getInt("numeroCuartel"));
            }  

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "la brigada no existe");

        }

        return br;
    }
 public void brigadaLibre(int codigo ) {
        String sql = "UPDATE brigada SET libre=1 WHERE codigoBrigada=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BrigadaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 public int cantBomberos(int cod){
        String sql="SELECT COUNT(*) from bombero where codigoBrigada=? AND estado=1";
        int cant=0;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cant=rs.getInt(1);
            }
            
        }catch (SQLException ex) {
            
        }
     
     
     return cant;
    
}
 public int verificar(String nombre, String esp){
        String sql="SELECT COUNT(*) FROM brigada where nombreBrigada=? AND especialidad=?";
        int cant=0;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, esp);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cant=rs.getInt(1);
            }
            
        }catch (SQLException ex) {
            
        }
     
     
     return cant;
    
}
     }
 

