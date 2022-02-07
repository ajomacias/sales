import java.util.Scanner;

public class esleIf {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        
        System.out.print("Ingrese una letra");
        char l = teclado.next().charAt(0);

        if(l == 'a' || l == 'A'){
            System.out.printf("la letra: %s es una vocal",l);

        }else if(l == 'e' || l == 'E'){

            System.out.printf("la letra: %s es una vocal",l);
        }else if(l == 'i' || l == 'I'){
            System.out.printf("la letra: %s es una vocal",l);

        }
        else if(l == 'o' || l == 'O'){
            System.out.printf("la letra: %s es una vocal",l);

        }
        else if(l == 'u' || l == 'U'){
            System.out.printf("la letra: %s es una vocal",l);
        }else{
            System.out.printf("la letra: %s no es una vocal",l);
        }
    } 
}
