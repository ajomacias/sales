package com.ander.Services;
import java.sql.*;

import com.ander.Database.Conexion;

public final class Crud {
    
    public static final void listar() throws SQLException
    {
       Conexion db = new Conexion();
       Connection coneccion = db.getConexion();
       System.out.println("Coneccion exitosa");
       String sql = "SELECT * FROM mensajes";
       PreparedStatement ps = coneccion.prepareStatement(sql);
       ResultSet res = ps.executeQuery();

       while(res.next()){
           int id = res.getInt("id");
           String mensaje = res.getString("mensaje");
           String autor = res.getString("autor");
           String fecha = res.getString("fecha");
           System.out.printf("%d %s %s %s \n", id,mensaje,autor,fecha);

       }
       coneccion.close();
       res.close();
       ps.close();
        
    }
    public static final void insertarRegistro(String mensaje, String autor)
    {
        try{

        Conexion db = new Conexion();
        Connection coneccion = db.getConexion();
        String sql = ("INSERT INTO mensajes(mensaje, autor, fecha) VALUES(?,?,CURRENT_TIME())");
        PreparedStatement ps = coneccion.prepareStatement(sql);
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.executeUpdate();
        ps.close();
        coneccion.close();

       }catch(SQLException err){
           System.err.println("No se pudo añadir el registro");
           err.printStackTrace(System.out);
       }
    }

    public static final void eliminarTodo(){
        try{
            Conexion db = new Conexion();
            Connection conexion = db.getConexion();
            String sql = "DELETE FROM mensajes";{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.execute();
            ps.close();
            conexion.close();
            System.out.println("Se elmino correctamente");
            }

        }
        catch(SQLException err){
            System.out.println("No se pudieron borrar todos los registros");
            err.printStackTrace(System.out);
        }
    }

    public static final void eliminarPorId(int id){
        try{
            Conexion db = new Conexion();
            Connection coneccion = db.getConexion();
            String sql = "DELETE FROM mensajes WHERE id=?";
            PreparedStatement ps = coneccion.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
            coneccion.close();
            ps.close();
        }catch(SQLException err){
            System.out.println("No se pudo eliminar el registro");
            err.printStackTrace(System.out);
        }
    }

    public static final void editar(String msj, String autor, int id){
        try{
            Conexion db = new Conexion();
            Connection coneccion = db.getConexion();
            String sql = "UPDATE mensajes SET mensaje=?, autor=? WHERE id=?";
            PreparedStatement ps = coneccion.prepareStatement(sql);
            ps.setString(1, msj);
            ps.setString(2, autor);
            ps.setInt(3, id);
            ps.executeUpdate();
            ps.close();
            coneccion.close();

        }catch(SQLException err){
            System.out.println("No se pudo edidar");
            err.printStackTrace(System.out);

        }
    }
    public static void obtenerPorId(int id){
        try{
            Conexion db = new Conexion();
            Connection coneccion = db.getConexion();
            String sql = "SELECT * FROM mensajes WHERE id=?";
            PreparedStatement ps = coneccion.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet res = ps.executeQuery();
            while(res.next()){
            int resId = res.getInt("id");
            String mensaje = res.getString("mensaje");
            String autor = res.getString("autor");
            String fecha = res.getString("fecha");
            System.out.printf("%d %s %s %s",resId,mensaje,autor,fecha);
           }
           ps.close();
           coneccion.close();
           res.close();

        }catch(SQLException err){
            System.out.println("No se pudo obtener el registro");
            err.printStackTrace(System.out);
        }
    }
    
}