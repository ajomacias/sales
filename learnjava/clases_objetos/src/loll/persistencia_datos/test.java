package loll.persistencia_datos;
import static loll.persistencia_datos.ManejoArchivos.*;
//import java.nio.file.*;

public class test {
    private static String path = "./src/loll/persistencia_datos/archivos/Hola.txt";
    public static void main(String[] args) {
        crearArchivo(path);
        escribirArchivo(path, "seeeeasd");
        //escribirArchivo("./src/loll/persistencia_datos/archivos/Hola.txt", "Hola mundo desde javas");
        //Path pathl = Paths.get("./src/loll/persistencia_datos/archivos/Hola.txt");

        //writeFile(pathl, "seeee");
        //LeerArchivo(path);
        
    }
    
}
