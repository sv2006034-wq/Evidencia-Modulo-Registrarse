
package conectionjava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PruebaConexion {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        Connection cn = con.getConexion();

        if (cn != null) {
            System.out.println("Conexión exitosa!");
            try {
    PreparedStatement ps = cn.prepareStatement("SHOW TABLES;");
    ResultSet rs = ps.executeQuery();

    System.out.println("Tablas en la base:");
    while (rs.next()) {
        System.out.println(" - " + rs.getString(1));
    }
} catch (Exception e) {
    System.out.println("Error consultando: " + e.getMessage());
}
        } else {
            System.out.println("Error al conectar.");
        }
    }
}
