import java.util.Scanner;
import java.text.DecimalFormat;

public class CovertirMoneda {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        EXTERNA:
        while (true) {
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - soles peruanos a dolares.\n"+
            "2 - pesos mexicanos a dolares.\n"+
            "3 - pesos colombianos a dolares.\n"+
            "4 - salir");

            char opcion = entrada.next().charAt(0);

            switch(opcion){
                case '1':
                convertirMoneda(3,81, "Soles Peruano");
                break;
                case '2':
                convertirMoneda(20.49, "Pesos mexicanos");
                break;
                case '3':
                convertirMoneda(3925.92, "Pesos colombianos");
                case '4':
                System.out.println("Cerrando");
                break EXTERNA;
                default:
                System.out.println("La opcion es incorrecta");

            }

        }

    }

    static void convertirMoneda(double valorDolar, String pais) {
        DecimalFormat d = new DecimalFormat("######.##");

        System.out.printf("Ingrese la cantidad de %s", pais);
        double cantidadMoneda = entrada.nextDouble();

        double dolares = cantidadMoneda / valorDolar;

        System.out.println("----------------------------------------");
        System.out.println("|     Tiene: " + d.format(dolares) + " dolares      |");
        System.out.println("----------------------------------------");
    }

}