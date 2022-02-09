import java.util.Scanner;

public class Sumar {
    private static Scanner entradaPorTeclado = new Scanner(System.in);

    public static void main(String[] args ){
        int numero1,numero2, resultado;
        System.out.println("--------------suma----------------");
        System.out.print("Ingrese numero1: ");
        numero1 = entradaPorTeclado.nextInt();
        System.out.print("Ingrese numero2: ");
        numero2 = entradaPorTeclado.nextInt();

        resultado = MathMethods.abs(numero1) + MathMethods.abs(numero2);

        System.out.println("El resultado es= " +resultado );
        System.out.println("--------------suma-----------------");

    }
    
}
