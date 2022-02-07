import java.util.Scanner;

public class Practice{
  private static Scanner entradaPorTeclado = new Scanner(System.in);
 
  public static void main(String[] args)
  {
     System.out.println("QUIEN ES LA PERSONA MAS BONITA DE LA CASA ESCRIBA EN MINUSCULAS");
     
     String valorIngresado;
     for(Integer i = 3; i >=0;i--){
      System.out.println("Su respuesta:");
       valorIngresado = entradaPorTeclado.nextLine();
       if(valorIngresado.equals("isabela")){
          System.out.println("Asi es la persona mas bonita de la casa es:\n"+ valorIngresado);
          break;
        }
      System.out.println("Ups te has equivocado tienes "+i+" intentos mas");
       
     }
    
  }
}