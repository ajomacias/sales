package com.ander;
import java.sql.*;
import com.ander.Services.Crud;
public class Main {
    public static void main(String[] args) throws SQLException {
        
        Crud.insertarRegistro("Aver si no hacemos algo......", "El Leo");
        //Crud.insertarRegistro("Aver si hacemos algo......", "El Ander");
        //Crud.eliminarTodo();
        //Crud.eliminarPorId(12);
        //Crud.editar("ahora lo edito el puto amo", "El ander", 13);
        //Crud.listar();
        Crud.obtenerPorId(14);
    }
}