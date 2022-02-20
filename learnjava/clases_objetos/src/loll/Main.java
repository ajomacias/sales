package loll;
import loll.clases.Calculadora;
import loll.clases.Constructores;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hola");
        System.out.println(Calculadora.PI);

        Constructores constructores = new Constructores("ANder");
        System.out.println(constructores);

    }
}