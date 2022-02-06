import java.util.Scanner;
public class Switch {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Ingrese un numero: ");
        int n = entrada.nextInt();
        switch (n) {
            case 1 :
            System.out.printf("el numero %d es menor que 3", n);
            break;
            case 2 :
            System.out.printf("el numero %d es menor que 3", n);
            break;
            case 3 :
            System.out.printf("el numero %d es igual que 3", n);
            default:
            System.out.printf("el numero %d es meyor que 3", n);
        }
    }
    
}
