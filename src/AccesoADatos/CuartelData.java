package AccesoADatos;

import Entidades.Cuartel;
//import com.sun.org.apache.regexp.internal.recompile;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CuartelData {

    private Connection con = null;
    private String sql;

    public CuartelData() {

        con = Conexion.getConexion();

    }

    public void guardarCuartel(Cuartel cuartel) {
        String sql = "INSERT INTO cuartel(nombreCuartel, direccion, coordenadaX, coordenadaY, telefono, correo, estado)VALUES (?, ?, ?, ?, ?, ?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDireccion());

            ps.setInt(3, cuartel.getCoordenadaX());
            ps.setInt(4, cuartel.getCoordenadaY());
            ps.setInt(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreoElectronico());
            ps.setBoolean(7, cuartel.isEstado());
            String correo = cuartel.getCorreoElectronico();
            String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,6}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(correo);
            if (!correo.contains("@") || !correo.contains(".")) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido.");
                return;

            }

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cuartel.setCodigoCuartel(rs.getInt(1));
            }
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cuartel agregado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "verifique los datos ingresados");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "hay un error al cargar el cuartel");
        }

    }

    public List<Cuartel> mostrarTodosCuarteles() {
        List<Cuartel> cuarteles = new ArrayList<>();
        Cuartel c = null;
        String sql = "SELECT * FROM cuartel";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int cod = (rs.getInt("codigoCuartel"));
                String nom = (rs.getString("nombreCuartel"));
                String dir = (rs.getString("direccion"));
                int cooX = (rs.getInt("coordenadax"));
                int CooY = (rs.getInt("coordenaday"));
                int tel = (rs.getInt("telefono"));
                String correo = (rs.getString("correo"));
                boolean est = (rs.getBoolean("estado"));
                c = new Cuartel(cod, nom, dir, cooX, CooY, tel, correo, est);
                cuarteles.add(c);
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "hay un error al conectar con la base de datos" + ex.getMessage());
        }
        return cuarteles;

    }

    public Cuartel BuscarCuartel(int telefono) {
        String sql = "SELECT * from cuartel where telefono=?";
        Cuartel c = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, telefono);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int codigo = (rs.getInt("codigoCuartel"));
                String nombre = (rs.getString("nombreCuartel"));
                String direc = (rs.getString("direccion"));
                int x = (rs.getInt("coordenadax"));
                int y = (rs.getInt("coordenaday"));
                int tel = (rs.getInt("telefono"));
                String correo = (rs.getString("correo"));
                boolean est = (rs.getBoolean("estado"));
                c = new Cuartel(codigo, nombre, direc, x, y, tel, correo, est);
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CuartelData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;

    }

    public Cuartel BuscarCuartelPorCodigo(int cod) {
        String sql = "SELECT * from cuartel where codigoCuartel=?";
        Cuartel c = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int codigo = (rs.getInt("codigoCuartel"));
                String nombre = (rs.getString("nombreCuartel"));
                String direc = (rs.getString("direccion"));
                int x = (rs.getInt("coordenadax"));
                int y = (rs.getInt("coordenaday"));
                int tel = (rs.getInt("telefono"));
                String correo = (rs.getString("correo"));
                boolean est = (rs.getBoolean("estado"));
                c = new Cuartel(codigo, nombre, direc, x, y, tel, correo, est);
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CuartelData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;

    }

    public void eliminarCuartel(Cuartel cuartel) {
        String sql = "UPDATE `cuartel` set estado=0 where codigoCuartel=?";
        if (cuartel.isEstado() == true) {
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, cuartel.getCodigoCuartel());

                int exito = ps.executeUpdate();
                if (exito == 1) {
                    JOptionPane.showMessageDialog(null, "Cuartel inactivo");
                } else {
                    JOptionPane.showMessageDialog(null, "El Cuartel no existe o no se encuentra inactivo");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "el Cuartel ya se encuentra inactivo");
        }

    }

    public void modificarCuartel(Cuartel cuartel) {

        String sql = "UPDATE cuartel SET nombreCuartel = ?, direccion = ?, "
                + "coordenadaX = ?, coordenadaY = ?, telefono = ?, correo = ?, estado = ? WHERE codigoCuartel = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoordenadaX());
            ps.setInt(4, cuartel.getCoordenadaY());
            ps.setString(5, cuartel.getTelefono() + "");
            ps.setString(6, cuartel.getCorreoElectronico());
            ps.setBoolean(7, cuartel.isEstado());
            ps.setInt(8, cuartel.getCodigoCuartel());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cuartel modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El cuartel no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel " + ex.getMessage());
        }

    }

    public boolean existeCuartelConNombre(String nombreCuartel) {
       try {
        String query = "SELECT COUNT(*) FROM cuartel WHERE nombreCuartel = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, nombreCuartel);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Cuartel ya Existe " + ex.getMessage());
    }
    return false;

}
}

