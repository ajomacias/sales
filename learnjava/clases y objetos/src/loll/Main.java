package loll;
import loll.clases.Calculadora;
import loll.clases.Constructores;
import loll.clases.Persona;

public class Main {

    public static void main(String[] args) {

        System.out.println(Calculadora.sumar(10,10,10));

        Constructores constructores = new Constructores();
        Constructores constructores1 = new Constructores("Ander");

        System.out.println(Calculadora.sumar("Ander ", "papu"));

    }
}
