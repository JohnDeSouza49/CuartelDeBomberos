
package cuarteldebomberos;

import AccesoADatos.BomberoData;
import java.time.LocalDate;
import AccesoADatos.Conexion;
import AccesoADatos.CuartelData;
import AccesoADatos.SiniestroData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.Month;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CuartelDeBomberos {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();

//Bombero bob = new Bombero(23456781, "Nahuel Martinez", LocalDate.of(1880, 4, 16), 1125896325, "0+", 1, true);
  //    BomberoData bd = new BomberoData();
       //bd.DesactivarBombero(bob);
        //bd.modificarBomberoActivo(bob);
    //   bd.guardarBombero(bob);
//System.out.println(bd.listarBomberos());
        //Bombero bob = new Bombero(25896314, "Anibal Gimenez", LocalDate.of(1980, 3, 15), 1125896325, "AB RH+", 12, true);
        //BomberoData bd = new BomberoData();
        //bd.guardarBombero(bob);
        //BrigadaData bd= new BrigadaData();
        //Brigada nueva= new Brigada("Omega", "salvamento en derrumbes", false, 1);
        //bd.guardarBrigada(nueva);
        // System.out.println(bd.brigadasLibres());
        // System.out.println(bd.brigadasAsignadas());
       // Cuartel c2 = new Cuartel("Cuartel2", "Calle2", 4, 5, "159254123" "cuartel2@gmail.com");
       
        //CuartelData cu3 = new CuartelData();
        //Cuartel c3 = new Cuartel("Cuartel2", "Salta 451", -1, 5, 1145896325, "cuartel3@gmail.com");
        //cu3.crearCuartel(c3);
        
       // Siniestro siniestro = new Siniestro("incendio", LocalDate.of(2020,2,21), 2, 2, "incendio en departamento", LocalDate.of(2020,2,21),9,1);
       // SiniestroData sd = new SiniestroData();
       // sd.guardarSiniestro(siniestro);
       //CuartelData cD = new CuartelData();
        //System.out.println(cD.mostrarTodosCuarteles());  
       SiniestroData sd= new SiniestroData();
        Siniestro a= new Siniestro("incendio", LocalDate.MIN, 5, 2);
        System.out.println(sd.cuartelMasCercano(a));
        
    } 
}

