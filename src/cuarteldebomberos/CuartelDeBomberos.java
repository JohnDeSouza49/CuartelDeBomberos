
package cuarteldebomberos;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CuartelDeBomberos {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();

//Bombero bob = new Bombero(23456781, "Nahuel Martinez", LocalDate.of(1880, 4, 16), 1125896325, "0+", 1, true);
    //BomberoData bd = new BomberoData();
       //bd.DesactivarBombero(bob);
        //bd.modificarBomberoActivo(bob);
    //   bd.guardarBombero(bob);
//System.out.println(bd.listarBomberos());
        //Bombero bob = new Bombero(25896314, "Anibal Gimenez", LocalDate.of(1980, 3, 15), 1125896325, "AB RH+", 12, true);
        //BomberoData bd = new BomberoData();
        //bd.guardarBombero(bob);
       BrigadaData bd= new BrigadaData();
      
        //bd.guardarBrigada(nueva);
       // System.out.println(bd.brigadaslibresxCuartel(1));
        // System.out.println(bd.brigadasAsignadas());
       // Cuartel c2 = new Cuartel("Cuartel2", "Calle2", 4, 5, "159254123" "cuartel2@gmail.com");
       
        //CuartelData cu3 = new CuartelData();
        //Cuartel c3 = new Cuartel("Cuartel2", "Salta 451", -1, 5, 1145896325, "cuartel3@gmail.com");
        //cu3.crearCuartel(c3);
        //System.out.println(cu3.BuscarCuartel(1145678921));
        //Siniestro siniestro = new Siniestro("incendios", LocalDate.of(2020,2,21), 2, 2, "incendio en departamento", LocalDate.of(2020,2,21),9,1);
         //SiniestroData sd = new SiniestroData();
        
     //
     // Brigada nueva= new Brigada("Beta", "Incendios", true, 2);
      //bd.guardarBrigada(nueva);
      // ArrayList<Cuartel> dist = new ArrayList<>();
       // System.out.println(dist=sd.cuartelMasCercano(siniestro));
       // System.out.println(sd.AsignarBrigada(dist, siniestro));
       // sd.guardarSiniestro(siniestro);
       //CuartelData cD = new CuartelData();
        //System.out.println(cD.mostrarTodosCuarteles());  

      SiniestroData sd= new SiniestroData();
        Siniestro a= new Siniestro("Incendios", LocalDate.MIN, 5, 2);
       System.out.println(sd.AsignarBrigada(a));

        
    } 
}

