import java.util.Scanner;
public class Primos {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(esPrimo(entrada.nextInt()));
        
    }
    

    static boolean esPrimo(int num){
        
        if(num == 0) return false;

        int[] sonDivisores = new int[num];
        for(int div = 1; div<num; ++div ){
            if(num % div == 0){
                sonDivisores[div] = 0;
                continue;
            }
            sonDivisores[div] = 1;
        }
        int count = 0;
        for(int es: sonDivisores ){
            if(es == 0) count ++;

            if(count >2) return false;

        }
        return true;

    }
    
}
