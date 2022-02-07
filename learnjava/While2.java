import java.util.Scanner;
public class While2 {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        int n,i;
        System.out.print("Ponga la tabla de multiplicar que desea saber: ");
        n = entrada.nextInt();
        i = 1;
        while(i<=20){
            System.out.printf("%d x %d = %d\n",n,i,(i*n));
            ++i;
        }
    }
}