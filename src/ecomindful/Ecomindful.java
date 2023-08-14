package ecomindful;

import conexionDB.conexionMysql;
import authentication.login;


public class Ecomindful {
    public static void main(String[] args) {
        
        conexionMysql conexion = new conexionMysql();
        conexion.getDbConnection();
        
        login inicio = new login();
        inicio.setVisible(true);
    }
    
}
