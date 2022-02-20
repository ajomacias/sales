package loll.persistencia_datos;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class CrearArchivos {
    private static final String NEW_LINE = System.lineSeparator();

    public static void writeFile(Path path, String contenido){
        var nor = contenido + NEW_LINE;
        try{
        Files.write(path, nor.getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND,StandardOpenOption.CREATE);
    }catch(IOException e){
        e.printStackTrace(System.out);
    }
    } 
    
    public static void LeerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            int contador =0;
            FileInputStream entrada = new FileInputStream(archivo);
            int lol;
            while((lol = entrada.read())  !=-1 ){
                System.out.println(lol);
                contador++;


            }

            entrada.close();
        }
        catch(IOException err){

        }

    }
}
