package mapas.Controllers;

import mapas.Models.Familiar;
import mapas.Models.Persona;

import java.util.*; 

public class PersonaController {
    Map<Integer, Persona> personasMap = new HashMap<>();
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
                this.personasMap.put(count, persona);
                count++;
            }else{
                this.personasMap.put(count, persona);
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
        
        System.out.println("--------Ingresar Familiar--------");

        while(true){
            Familiar familiar = new Familiar();
            System.out.print("Ingrese el nombre del familiar: ");
            familiar.setNombre(entrada.nextLine());
            System.out.println("Que es para usted este familiar: ");
            familiar.setqueEs(entrada.nextLine());
            System.out.println("¿Desea ingresar mas familiares? SI NO por default no!!: ");
            mapFamily.put(count, familiar);
            count++;
            boolean confirm = (entrada.nextLine().toUpperCase().equalsIgnoreCase("SI")) ?true:false;
            
            if(!confirm) break;
        }

        return mapFamily;
        
    }

    public void imprimirPersonas(){
        System.out.println("---------------------------------");
        for(Persona entry : this.personasMap.values()){
          if(entry==null) continue;
         
            System.out.println("-------------"+entry.getNombre()+"-----------");
            System.out.printf("Nombre: %s \n",entry.getNombre());
            System.out.printf("Edad: %s \n",entry.getEdad());
            System.out.printf("Sexo: %s \n",entry.getGenero());
            imprimirFamiliares(entry.getFamiliares());
            System.out.println("-------------"+entry.getNombre()+"-----------");
          
        }
    }

    private boolean imprimirFamiliares(Map<Integer,Familiar> familiares){
        System.out.println("------------Familiares--------------");
        for(Familiar f : familiares.values()){

            if(f==null)continue;
            
            System.out.println("..........");
            System.out.printf("Nombre: %s\n",f.getNombre());
            System.out.printf("Vinculo: %s\n",f.getVinculo());
        }
        System.out.println("------------Familiares--------------");
        return true;
        
    }
}
