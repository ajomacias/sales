import java.util.Scanner;

public class CovertirMoneda {

    private static Scanner entrada = new Scanner(System.in); 
    public static void main(String[] args) {
        
    }

    static double convertirMoneda(double valorDolar,String pais){

        System.out.printf("Ingrese la cantidad de %s",pais);
        double cantidadMoneda = entrada.nextDouble();

        double dolares = cantidadMoneda/valorDolar;

        return dolares;

    }
    
}
