package loll.excepciones;

import java.util.*;
import loll.excepciones.OperadorException;

public class ExepcionesMain {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int[] valores = new int[3];
        boolean lol = true;
        do{
        try{
        System.out.print("Ingrese N1");
        valores[0] = entrada.nextInt();
        System.out.print("Ingrese N1");
        valores[1] = entrada.nextInt();

        valores[2] = dividir(valores[1], valores[0]);

        //System.out.println(valores[2]);
        lol=false;
       }
       catch(InputMismatchException err) {
           System.err.println("El dato ingresado no es correcto");
           System.out.println(err);
           entrada.nextLine();
       }
       catch(OperadorException err){
        System.err.println("error="+err.getMessage());
       }
       catch(Exception err){
           err.printStackTrace(System.out);
       }finally{
           System.out.println("Se reviso la division");
       }
    } 
       while(lol);
    }

    static int dividir(int n , int n2) throws OperadorException{

        if(n2 == 0){
            throw new OperadorException("Division entre cero");
        }
        
        return n / n2;

    }
    
}
