import java.util.Scanner;

public class EsPar {

    private static Scanner entradaPorTeclado = new Scanner(System.in);

    public static void main(String[] args ){
        System.out.print("Ingrese numero: ");
        int numero = entradaPorTeclado.nextInt();

        if(numero !=0){
            if(numero > 0){
                if(numero %2 == 0 ){
                    System.out.printf("El numero es positivo par ", numero);
                }
                else{
                    System.out.printf("El numero es positivo no par ", numero);
                }

            }else{
                if(numero %2 == 0 ){
                    System.out.printf("El numero es negativo par ", numero);

                }
                else{
                    System.out.printf("El numero es positivo no par ", numero);
                }
            }

        }else{
            System.out.printf("El numero %d es neutro", numero);
        }
    }    
}
