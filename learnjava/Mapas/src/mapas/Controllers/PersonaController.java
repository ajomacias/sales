package mapas.Controllers;

import mapas.Models.Familiar;
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
       boolean ingFamiliar;
       String campo;
       int count = 1;

        while(seguir){
            Persona persona = null;
            ingFamiliar=false;
            System.out.println("-----------INGRESO PERSONA--------------");
            System.out.println("¿Desea ingresar nueva persona? si o no");
            campo = entrada.nextLine().toUpperCase();
            
            if(campo.equals("NO"))seguir = false;
            
            else if(campo.equals("SI")){
                persona = getInfoPerson();
                System.out.print("¿Ingresar familiar?SI NO por default no!!: ");
                ingFamiliar = (entrada.nextLine().toUpperCase().equalsIgnoreCase("SI")) ?true :false;
            }
            else System.out.println("valor ingresado no valido");

            if(ingFamiliar){
                persona.setFamiliares(getInfoFamily());
                personasMap.put(count, persona);
                count++;
            }else{
                personasMap.put(count, persona);
                count++;
            }
        }
        System.out.println("-------------Cerrado el registro----------------"); 
    }

    private Persona getInfoPerson(){
        Persona persona = new Persona();
        System.out.print("Ingrese sus nombres:");
        persona.setNombre(entrada.nextLine());
        System.out.print("Ingrese su edad:");
        persona.setEdad(entrada.nextLine());
        System.out.print("Ingrese su genero:");
        persona.setGenero(entrada.nextLine().charAt(0));
        return persona;
    }
    private Map<Integer, Familiar> getInfoFamily(){
        int count=0;
        Map<Integer, Familiar> mapFamily = new HashMap<Integer,Familiar>();
        Familiar familiar = new Familiar();
        System.out.println("--------Ingresar Familiar--------");

        while(true){

            System.out.print("Ingrese el nombre del familiar: ");
            familiar.setNombre(entrada.nextLine());
            System.out.println("Que es para usted este familiar: ");
            familiar.setqueEs(entrada.nextLine());
            System.out.println("¿Desea ingresar mas familiares? SI NO por default no!!: ");
            boolean confirm = (entrada.nextLine().toUpperCase().equalsIgnoreCase("SI")) ?true:false;
            if(!confirm) break;

            mapFamily.put(count, familiar);
            count++;
        }

        return mapFamily;
        
    }
    
}
