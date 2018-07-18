/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angular.js.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    static String db = "tienda";
    static String login = "postgres";
    static String password = "morocho2017";
    static String url = "jdbc:postgresql://localhost/" + db;

    Connection conn = null;

    public DbConnection() {
        try {

            //Obtener driver para postgres
            Class.forName("org.postgresql.Driver");

            //Obtener conexion
            conn = DriverManager.getConnection(url, login, password);

            if (conn != null) {
                System.out.println("Base de datos: " + db + " Conectada Correctamente");
            }

        } catch (SQLException ex) {
            System.out.println("Excepcion por la conexion " + ex);
        } catch (ClassNotFoundException e) {
            System.out.println("Excepcion driver: " + e);

        }
    }

    public Connection getConnection() {
        return conn;
    }

    //Quitar de memoria la conexion
    public void disconnect() {
        System.out.println("Cerrando base de datos: " + db);
        if (conn != null) {
            try {
                System.out.println("Desconectado de la base de datos: " + db);
                conn.close();

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }


}


