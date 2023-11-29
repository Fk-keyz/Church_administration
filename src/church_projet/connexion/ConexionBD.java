/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package church_projet.connexion;

import com.sun.jdi.connect.spi.Connection;
//import java.sql.Connection;
//import java.sql.DiverManager;
//import java.sql.SQLExeption;

/**
 *
 * @author Ibrahim
 */
public class ConexionBD {

    Connection conn = null;

    public static Connection Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnecton("jdbc:mysql://localhost/church_BD","root","");
            if (conn != null) {
                System.out.println("connexion reussi ");
            } else {
                System.out.println("probleme de connexion alabse de donnee ");
            }
            return conn;
           
        }
        catch (Exception e) {
            System.out.println("SQLException :" +e );
        }
        return null;

    }

    private static class DriverManager {

        private static Connection getConnecton(String jdbcmysqllocalhostchurch_BD, String root, String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DriverManager() {
        }
    }

}
