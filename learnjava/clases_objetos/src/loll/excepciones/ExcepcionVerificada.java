package loll.excepciones;

import java.io.*;


public class ExcepcionVerificada extends IOException{
   public static void main(String[] args){
       readFile();
       
   }

   public static void readFile(){
       try{
       File file = new File("C:/Users/Anderson/Desktop/text.txt");
       FileReader fr = new FileReader(file);
    }catch(FileNotFoundException err){
        System.err.println("No se encontro el archivo");
        err.printStackTrace(System.out);
    }

   }
}