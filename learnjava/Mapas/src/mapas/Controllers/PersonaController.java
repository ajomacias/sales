package mapas.Controllers;

import mapas.Models.Persona;
import java.util.*;

public class PersonaController {
    private Map<Integer, Persona> personasMap = new HashMap<>();
    Scanner entrada = new Scanner(System.in);

    public Map<Integer, Persona> getPersonasMap() {
        return personasMap;
    }

    public void setPersonasMap() {

       boolean seguir = true;
       String campo;

        while(seguir){

            System.out.println("-----------INGRESO PERSONA--------------");
            System.out.println("¿Desea ingresar nueva persona? si o no");
            campo = entrada.nextLine().toUpperCase();
            
            if(campo.equals("NO"))seguir = false;
            
            else if(campo.equals("SI")){
                System.out.println("simon");

            }
            else System.out.println("valor ingresado no valido");

        }
        System.out.println("Cerrado el registro");
        
    }
    
}
