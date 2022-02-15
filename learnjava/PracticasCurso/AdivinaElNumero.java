import java.util.Scanner;

public class AdivinaElNumero {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        elegirDificultad();

    }

    static void elegirDificultad() {
        WHILE: while (true) {
            System.out.println("JUEGO DE ADVINAR UN NUMERO");
            System.out.println("Elija el nivel de dificultad\n" + "1 - facil\n" +
                    "2 - medio\n" +
                    "3 - dificil\n" +
                    "4 - salir");
            char opcion = entrada.next().charAt(0);
            switch (opcion) {
                case '1':
                jugar(opcion);
                break;
                case '2':
                jugar(opcion);
                break;
                case '3':
                jugar(opcion);
                break;
                case '4':
                System.out.println("cerrando");
                break WHILE;
                default:
                System.out.println("opcion incorrecta");
                break;

            }

        }
    }

    static void jugar(char dificultad) {
        int res,op,dif;
        dif = 21;
        if('1' == dificultad ) dif = 21;
        if('2' == dificultad ) dif = 51;
        if('3' == dificultad) dif = 101; 

            op = (int)(Math.random()*dif);
            for(int i = 6; i>=0; --i){
                System.out.println("vidas: "+ i);
                System.out.printf("Adivine el numero, numero entre 1-%d :",dif);
                res = entrada.nextInt();

                if(op == res){
                    System.out.println("Correcto, felicidades :)");
                    break;
                }
                if(op < res){
                    System.out.println("La respuesta es menor al numero ingresado");
                }
                if(op > res){
                    System.out.println("La respuesta es mayor al numero ingresado");
                }

                if(i == 0){
                    System.out.println("Perdio");
                }
            }
    }

}
