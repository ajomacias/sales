import java.util.Scanner;

public class Palindromo {

    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
    System.out.print("Ingrese una palabra para verificar si es palindromo: ");
    if(esPalindromo(entrada.nextLine())){
        System.out.println("Es palindrom");

    }else{
        System.out.println("No es palindromo");
    }
        
    }

    static boolean esPalindromo(String cadena){

        cadena = cadena.replaceAll(" ","");
        cadena = cadena.toUpperCase();

        StringBuilder cadenaAlrevez = new StringBuilder();

        int count = cadena.length() -1;

        while(count <= cadena.length() && count>-1){
            cadenaAlrevez.append(cadena.charAt(count));
            count--;
        }

        if( cadenaAlrevez.toString().equals(cadena)) return true;

        return false;

    }
    
}
