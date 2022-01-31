package demo.database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Conection {
    private final static String URL = "jdbc:postgresql://localhost:5432/ventas";
    private final static String USER = "postgres";
    private final static String PASSWORD = "0981942117";

    public static void main(String[] args) throws SQLException{
        try{
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement smt = conn.createStatement();
        smt.executeQuery("SELECT*FROM proveedorcategoria");
     }
     catch(Exception err){
         System.out.println(err);
     }
    }
    
}
