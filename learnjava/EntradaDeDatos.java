import java.util.Scanner;
import java.util.StringTokenizer;

public class EntradaDeDatos{
    private static Scanner entradaPorTeclado = new Scanner(System.in);

    public static void main(String[] args){
        StringTokenizer stringTokenizer;
        String nombre;
        int edad;
        char caracter; 
        System.out.print("Ingrese su noombre:");
        stringTokenizer = new StringTokenizer(entradaPorTeclado.nextLine());
        nombre = stringTokenizer.nextToken();
        System.out.print("Ingrese edad:");
        edad = entradaPorTeclado.nextInt();
        System.out.print("Ingrese un caracter");
        caracter = entradaPorTeclado.next().charAt(0);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("caracter: "+ caracter);
        System.out.printf("nombre: %s Edad: %d ", nombre, edad);
        System.out.println("caracter: " + caracter);
        System.out.println("\"");
        System.out.println('\'');
        System.out.println("\\");
        System.out.println("hola mundo\bjkash");

    }
}