package loll.persistencia_datos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){

        File archivo = new File(nombreArchivo);
        try {
           PrintWriter salida = new PrintWriter(archivo);
           salida.close();

        } catch (FileNotFoundException e) {
    
            e.printStackTrace(System.out);
        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido){
        contenido= contenido + "\n";
        File archivo = new File(nombreArchivo);
        try{
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivo,true));
            salida.write(contenido);
            salida.close();
            
        }catch(FileNotFoundException err){
            err.printStackTrace(System.out);

        }
        catch(IOException err){
            err.printStackTrace(System.out);
        }
    }
    
}
