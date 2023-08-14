package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionMysql {

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String USUARIO = "upzkpud5rert38ou";
    private static String PASSWORD = "w6EIBraIE0wTlb8Koslb";
    private static String URL = "jdbc:mysql://upzkpud5rert38ou:w6EIBraIE0wTlb8Koslb@bfwpkqfepjxmy3c9lq9l-mysql.services.clever-cloud.com:3306/bfwpkqfepjxmy3c9lq9l";
    //private static String URL = "jdbc:mysql://localhost:3306/bfwpkqfepjxmy3c9lq9l";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }

    public Connection getDbConnection() {
        Connection con = null;

        try {
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Base de datos " + DRIVER + " conectada exitosamente.");
            System.out.println( "Base de datos " + DRIVER + " conectada exitosamente.");
            return con;
        }catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Error al conectar la base de datos: " + DRIVER +" "+e );
            System.out.println("conexion fallida: " + e);
        }
        return null;
    }
}
