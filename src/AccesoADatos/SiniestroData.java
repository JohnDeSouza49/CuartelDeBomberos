package AccesoADatos;

import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SiniestroData {

    private Connection con = null;
    private String sql;

    public SiniestroData() {
        con = Conexion.getConexion();

    }

    public void guardarSiniestro2(Siniestro siniestro) {

        String sql = "INSERT INTO siniestro (tipo, fechaSiniestro, coordenadaX, coordenadaY, detalles, fechaResol, puntuacion, codigoBrigada) VALUES (? ,?, ?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFechaSiniestro()));
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "hay un error al cargar el siniestro" + ex.getMessage());

        }

    }

    public double distanciaEntreDosPuntos(Siniestro siniestro, Cuartel cuartel) {

        int x1 = siniestro.getCoordenadaX();
        int y1 = siniestro.getCoordenadaY();

        int x2 = cuartel.getCoordenadaX();
        int y2 = cuartel.getCoordenadaY();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }

    public List<Brigada> cuartelMasCercano(Siniestro siniestro) {
        ArrayList<Cuartel> dist = new ArrayList<>();
        double resultado = 0;
        CuartelData cd = new CuartelData();
        List<Cuartel> cuartel = new ArrayList<>();
        cuartel = cd.mostrarTodosCuarteles();
        for (Cuartel aux : cuartel) {
            resultado = distanciaEntreDosPuntos(siniestro, aux);
            Cuartel a = new Cuartel(aux.getCodigoCuartel(), aux.getNombreCuartel(), aux.getDireccion(), aux.getTelefono(), aux.getCorreoElectronico(), resultado, aux.isEstado());
            dist.add(a);

        }
        Collections.sort(dist, new Comparator<Cuartel>() {
            @Override
            public int compare(Cuartel t, Cuartel t1) {
                double dist1 = t.getDistancia();
                double dist2 = t1.getDistancia();
                return (int) (dist1 - dist2);
            }
        });
        BrigadaData bd = new BrigadaData();
        List<Brigada> brigadasCerca = new ArrayList<>();
        List<Brigada> brigadas = new ArrayList<>();
        for (int i = 0; i < dist.size(); i++) {
            Cuartel actual = (Cuartel) dist.get(i);
            Cuartel cA = cd.BuscarCuartel(actual.getTelefono());
            brigadasCerca = bd.brigadaslibresxCuartel(cA.getCodigoCuartel());
            for (Brigada aux : brigadasCerca) {
                Brigada b = new Brigada(aux.getCodigoBrigada(), aux.getNombreBrigada(), aux.getEspecialidad(), aux.isLibre(), aux.getNumeroCuartel());
                brigadas.add(b);
            }

        }

        //System.out.println(dist);
        return brigadas;

    }

    public Brigada AsignarBrigada(Siniestro siniestro) {
        BrigadaData bd = new BrigadaData();
        CuartelData cd = new CuartelData();
        Brigada asignada = null;
        List<Brigada> brigadas = new ArrayList<>();
        brigadas = cuartelMasCercano(siniestro);
        String tipo = siniestro.getTipo();
        for (Brigada aux : brigadas) {
            String esp = aux.getEspecialidad();
            if (esp.equalsIgnoreCase(tipo)) {
                asignada = aux;
                break;
            }

        }
        return asignada;
    }

    public void guardarSiniestro(Siniestro siniestro) {
        String sql = "INSERT INTO siniestro (tipo, fechaSiniestro, coordenadaX, coordenadaY, detalles,  codigoBrigada) VALUES (? ,?, ?, ?, ?, ? )";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFechaSiniestro()));
            ps.setInt(3, siniestro.getCoordenadaX());
            ps.setInt(4, siniestro.getCoordenadaY());
            ps.setString(5, siniestro.getDetalles());
            ps.setInt(6, siniestro.getCodigoBrigada());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                siniestro.setCodigoSiniestro(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Siniestro añadido con exito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "hay un error al cargar el siniestro" + ex.getMessage());

        }

    }

    public List<Siniestro> consultarSiniestroUlt24Hs() {
        List<Siniestro> siniestro = new ArrayList<>();
       Siniestro s = null;
        Calendar calendar = Calendar.getInstance();
        Timestamp fechaActual = new Timestamp(calendar.getTimeInMillis());
        calendar.add(Calendar.HOUR, -24);
        Timestamp fechaHace24Horas = new Timestamp(calendar.getTimeInMillis());
        try {
            String sql = "SELECT codigoSiniestro, tipo, fechaSiniestro, codigoBrigada FROM siniestros WHERE fechaSiniestro >= ? AND fechaSiniestro <= ?";
            PreparedStatement ps;

            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, siniestro.getCodigoSiniestro());
            ps.setString(2, siniestro.getTipo());
            ps.setDate(3, Date.valueOf(siniestro.getFechaSiniestro()));

            ps.setInt(4, siniestro.getCodigoBrigada());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            while (rs.next()) {
                int codSin = rs.getInt("codigoSinietro");
                Timestamp fechaS = rs.getTimestamp("fechaSiniestro");
                int codBrig = rs.getInt("codigoBrigada");
                String tipo = rs.getString("tipo");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "hay un error al consultar el siniestro" + ex.getMessage());

        }
    }

    public void siniestroSinResolver() {
        try {
            String sql = "SELECT codigoSiniestro, tipo, fechaSiniestro, fechaResol, puntuacion, codigoBrigada FROM siniestro WHERE fechaResol IS NULL AND puntuacion = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int codSin = rs.getInt("codigoSiniestro");
                Timestamp fechaS = rs.getTimestamp("fechaSiniestro");
                Timestamp fechaRS = rs.getTimestamp("fechaResol");
                int punt = rs.getInt("puntuacion");
                String tipo = rs.getString("tipo");
                int codBrig = rs.getInt("codigoBrigada");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hay un error al consultar el siniestro: " + ex.getMessage());
        }

    }

    public void eliminarSiniestro(int codigoSiniestro) {
        try {
            String sql = "DELETE FROM siniestro WHERE codigoSiniestro = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigoSiniestro);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Siniestro eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún siniestro con ese código.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hay un error al eliminar el siniestro: " + ex.getMessage());
        }
    }

    public void asignarPuntuacion(int codigoSiniestro, int puntuacion) {
        try {
            String sql = "UPDATE siniestro SET puntuacion = ?, fechaResol = ? WHERE codigoSiniestro = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            Calendar calendar = Calendar.getInstance();
            Timestamp fechaResolucion = new Timestamp(calendar.getTimeInMillis());

            ps.setInt(1, puntuacion);
            ps.setTimestamp(2, fechaResolucion);
            ps.setInt(3, codigoSiniestro);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Siniestro resuelto.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún siniestro con ese código.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hay un error al asignar puntuación al siniestro: " + ex.getMessage());
        }
    }
}


/*String sql = "SELECT * FROM bombero";
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
            ps.close();*/