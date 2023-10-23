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
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
}
     
