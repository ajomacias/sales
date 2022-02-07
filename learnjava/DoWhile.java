import java.util.Scanner;

public class DoWhile {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        String res;
        boolean validacion = true;

        do{
            System.out.println("¿Que sigue? Y AQUI SUCEDIO, NUESTRO");
            res = entrada.nextLine();
            res = res.toUpperCase();

            if(res.equals("PRIMER BESO")){
                System.out.println("!Correcto :D, PRIMER BESOOOOOO");
                validacion = false;
            }
            else{
                System.out.println("Incorrecto :(, ¿Vives en una roca?");
            }
        }
        while(validacion);
    }
}
