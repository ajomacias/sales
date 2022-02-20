package loll.test;

import loll.herencia.*;
import java.time.LocalDate;
import java.sql.Date;
import loll.enums.*;

public class TestHerencia {

    public static void main(String[] args) {
        Clientes cliente1 = new Clientes( Date.valueOf(LocalDate.now()), false, "Ander", 'M', 19, "Cuyabeno-Tarapoa");
        Clientes cliente2 = new Clientes( Date.valueOf(LocalDate.now()), false, "Ander", 'M', 19, "Cuyabeno-Tarapoa");
        System.out.println(cliente1);
        imprimir(cliente1);
        imprimir(cliente2);

        Empleado empleado1 = new Empleado("leo", 3000d);
        empleado1.setEdad(14);
        empleado1.setGenero('M');
        empleado1.setDireccion("Cuyabeno-Tarapoa");
        System.out.println(empleado1);
        imprimir(empleado1);

        determinarTipo(empleado1);

        //Conversion de Objetos
        //Downcasting

        Persona persona1 = new Empleado("Ander", 4000);
        Empleado empleado2 = (Empleado)(persona1);
        System.out.println(empleado2.ObtenerDetalle());

        //Upcasting

        Persona persona2 = (Persona) (empleado2);
        System.out.println(persona2.toString());


        //Equals

        Persona p1 = new Persona("Ander", 'M', 19, "she");
        Persona p2 = new Persona("Ander", 'M', 19, "she");

        System.out.println(p1.equals(p2));

        //Enums 

        System.out.println(Dias.DOMINGO);
        System.out.println(Continentes.AFRICA.getPaises());

    }

    public static void imprimir(Persona persona){
        System.out.println(persona.obtenerDetalle());

    }

    public static void determinarTipo(Object objeto ){

        if( objeto instanceof Clientes) System.out.println("Es de tipo cliente");
        else if( objeto instanceof Empleado  ) System.out.println("Es de tipo Empleado");
        else if( objeto instanceof Persona ) System.out.println("Es de tipo persona");
        else if ( objeto instanceof Object ) System.out.println("Es de tipo Object");

    }

}
