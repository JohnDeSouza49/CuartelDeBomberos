package AccesoADatos;

import Entidades.Bombero;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class BomberoData {

    private Connection con = null;
    

    public BomberoData() {
        con = Conexion.getConexion();

    }

    public void guardarBombero(Bombero bombero) {

        String sql =  "INSERT INTO bombero(dni,nombreApellido,fechaNac,celular,codigoBrigada,estado,grupoSanguineo,codigoCuartel )VALUES (?,?, ?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombreApellido());
            ps.setDate(3, Date.valueOf(bombero.getFechaNac()));
            ps.setInt(4, bombero.getCelular());
            ps.setInt(5, bombero.getCodigoBrigada());
            ps.setBoolean(6, bombero.isEstado());
            ps.setString(7, bombero.getGrupoSanguineo());
            ps.setInt(8, bombero.getCodigoCuartel());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setIdBombero(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Bombero añadido con exito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el bombero" + ex.getMessage());
            

        }

    }

    public void modificarBomberoActivo(Bombero bombero) {
        String sql = "UPDATE bombero SET dni=?, nombreApellido =?,fechaNac=?,celular=?,codigoBrigada=?,grupoSanguineo=?, codigoCuartel=? where idBombero=? and estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombreApellido());
            ps.setDate(3, Date.valueOf(bombero.getFechaNac()));
            ps.setInt(4, bombero.getCelular());
            ps.setInt(5, bombero.getCodigoBrigada());
            ps.setString(6, bombero.getGrupoSanguineo());
            ps.setInt(7, bombero.getIdBombero());
            ps.setInt(8, bombero.getCodigoCuartel());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El bombero no existe o no se encuentra activo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero " + ex.getMessage());
        }

    }

    public void ActivarBombero(Bombero bombero) {
        String sql = "UPDATE `bombero` set estado=1 where idBombero=?";
        if (bombero.isEstado() == false) {
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, bombero.getIdBombero());

                int exito = ps.executeUpdate();
                if (exito == 1) {
                    JOptionPane.showMessageDialog(null, "Bombero activo");
                } else {
                    JOptionPane.showMessageDialog(null, "El bombero no existe o no se encuentra inactivo");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "el bombero ya se encuentra activo");
        }

    }

    public void DesactivarBombero(Bombero bombero) {
        String sql = "UPDATE `bombero` set estado=0 where idBombero=?";
        if (bombero.isEstado() == true) {
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, bombero.getIdBombero());

                int exito = ps.executeUpdate();
                if (exito == 1) {
                    JOptionPane.showMessageDialog(null, "Bombero inactivo");
                } else {
                    JOptionPane.showMessageDialog(null, "El bombero no existe o no se encuentra inactivo");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "el bombero ya se encuentra inactivo");
        }

    }

    public List<Bombero> listarBomberos() {

        List<Bombero> bomberos = new ArrayList<>();
        Bombero b = null;
        try {
            String sql = "SELECT * FROM bombero";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                b = new Bombero();
                b.setIdBombero(rs.getInt("idBombero"));
                b.setDni(rs.getInt("dni"));
                b.setNombreApellido(rs.getString("NombreApellido"));
                b.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                b.setCelular(rs.getInt("celular"));
                b.setCodigoBrigada(rs.getInt("codigoBrigada"));
                b.setEstado(rs.getBoolean("estado"));
                b.setGrupoSanguineo(rs.getString("GrupoSanguineo"));
                b.setCodigoCuartel(rs.getInt("codigoCuartel"));
                bomberos.add(b);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return bomberos;
    }
    
    public Bombero  buscarBomberoPorDni(int dni){
        
         String sql = "SELECT * FROM bombero  where dni=?";
        Bombero b = new Bombero();
        try{
         PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
               b.setIdBombero(rs.getInt("idBombero"));
               b.setDni(rs.getInt("dni"));
               b.setNombreApellido(rs.getString("nombreApellido"));
               b.setFechaNac(rs.getDate("fechanac").toLocalDate());
               b.setCelular(rs.getInt("celular"));
               b.setCodigoBrigada(rs.getInt("codigoBrigada"));
               b.setEstado(rs.getBoolean("estado"));
               b.setGrupoSanguineo(rs.getString("gruposanguineo"));
               b.setCodigoCuartel(rs.getInt("codigoCuartel"));
                
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "El bombero no existe");
        }
        return b;
    }
      public Bombero  buscarBomberoPorNombre(String nombre){
        
         String sql = "SELECT * FROM bombero  where nombreApellido=?";
        Bombero b = new Bombero();
        try{
         PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
               b.setIdBombero(rs.getInt("idBombero"));
               b.setDni(rs.getInt("dni"));
               b.setNombreApellido(rs.getString("nombreApellido"));
               b.setFechaNac(rs.getDate("fechanac").toLocalDate());
               b.setCelular(rs.getInt("celular"));
               b.setCodigoBrigada(rs.getInt("codigoBrigada"));
               b.setEstado(rs.getBoolean("estado"));
               b.setGrupoSanguineo(rs.getString("gruposanguineo"));
               b.setCodigoCuartel(rs.getInt("codigoCuartel"));
                
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "El bombero no existe");
        }
        return b;
    }

}
