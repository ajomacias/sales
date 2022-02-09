import java.util.Scanner;
public class Primos2 {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(esPrimo(entrada.nextInt()));
        
    }
    

    static boolean esPrimo(int num){

       if(num == 0 || num == 1 || num == 4) return false;

       for(int i = 2; num>i; i++){
           if(i == num) continue;

           if(num % i == 0) return false;

       }

       return true;

    }
    
}
