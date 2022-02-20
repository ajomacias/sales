package com.ander.Database;
import java.sql.*;

public final class Conexion {
    private Connection conexion;
    
    public Conexion() throws SQLException {
        this.conexion = DriverManager.getConnection(Data.URL.getData(), Data.USER.getData(), Data.PASSWORD.getData());
    }

    public Connection getConexion(){
        return this.conexion;
    }
    
}