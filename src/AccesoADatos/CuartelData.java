package AccesoADatos;

import Entidades.Cuartel;
import com.sun.org.apache.regexp.internal.recompile;
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

    public void crearCuartel(Cuartel cuartel) {
        String sql = "INSERT INTO cuartel(nombreCuartel, direccion, coordenadaX, coordenadaY, telefono, correo)VALUES (?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDireccion());
            // try {
            //int coordenadaX = Integer.parseInt(cuartel.getCoordenadaX());
            //int coordenadaY = Integer.parseInt(cuartel.getCoordenadaY());
            ps.setInt(3, cuartel.getCoordenadaX());
            ps.setInt(4, cuartel.getCoordenadaY());
            ps.setInt(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreoElectronico());
            String correo = cuartel.getCorreoElectronico();
            String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,6}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(correo);
            if (!correo.contains("@") || !correo.contains(".")) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido.");
                return;

                // } catch (NumberFormatException e) {
                //JOptionPane.showMessageDialog(null, "debe ingresar numeros en las coordenadas");
                // return;
                //}
                //try {
                //  int telefono = Integer.parseInt(cuartel.getTelefono());
                //ps.setInt(5, cuartel.getTelefono());
                //} catch (NumberFormatException e) {
                //  JOptionPane.showMessageDialog(null, "debe ingresar numeros en el numero de telefono");
                // return;
                //}
            }

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cuartel.setCodigoCuartel(rs.getInt(1));

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
               c = new Cuartel();
               c.setCodigoCuartel(rs.getInt("codigoCuartel"));
                c.setNombreCuartel(rs.getString("nombreCuartel"));
                c.setDireccion(rs.getString("direccion"));
                c.setCoordenadaX(rs.getInt("coordenadax"));
                c.setCoordenadaY(rs.getInt("coordenaday"));
                c.setTelefono(rs.getInt("telefono"));
                c.setCorreoElectronico(rs.getString("correo"));
                cuarteles.add(c);
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "hay un error al conectar con la base de datos" + ex.getMessage());
        }
        return cuarteles;

    }
    
    public Cuartel BuscarCuartel( int telefono){
          String sql="SELECT * from cuartel where telefono=?";
          Cuartel c= new Cuartel();
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, telefono);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                  c = new Cuartel();
                  int codigo=(rs.getInt("codigoCuartel"));
               String nombre=(rs.getString("nombreCuartel"));
                 String direc=(rs.getString("direccion"));
                 int x =(rs.getInt("coordenadax"));
                 int y=(rs.getInt("coordenaday"));
                 int tel=(telefono);
                 String correo=(rs.getString("correo"));
                   c = new Cuartel(codigo, nombre, direc, codigo, codigo, telefono, correo);
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CuartelData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
          
    }
            
}
