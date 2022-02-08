package Controllers;
import java.util.Scanner;
import Models.Estudiante;
import java.util.Map;
import java.util.HashMap;
import Functions.Operaciones;
import java.util.Iterator;
import java.util.Map.Entry;;

public class EstudiantesController {

    private Map<Integer, Estudiante> s = new HashMap<Integer,Estudiante>();

    private Scanner entrada = new Scanner(System.in);

    public void ingresarEstudiantes(){
        boolean con = true;
        String confirmacion,nombres,apellidos;
        Integer keyMap = 1;

        do{
            System.out.println("Desea añadir un estudiante:");
            confirmacion = entrada.nextLine().toUpperCase();

            if(confirmacion.equals("SI") || confirmacion.equals("VERDADERO")){

                Estudiante estudiante = new Estudiante();

                System.out.print("Ingrese los nombres del estudiante: ");
                nombres = entrada.nextLine().toUpperCase();
                estudiante.setNombre(nombres);
                
                System.out.print("\nIngrese los apellidos del estudiante: ");
                apellidos = entrada.nextLine().toUpperCase();
                estudiante.setApellido(apellidos);
                System.out.println("Ingrese las notas del estudiante ejemplo: 10,8,7,8 =");

                String[] notasInString = entrada.nextLine().split(","); 
                Double[] notasInInt = new Double[notasInString.length] ;

                int count = 0;

                while(count < notasInString.length){

                    notasInInt[count] = Double.valueOf(notasInString[count]);
                    count++;

                }

                estudiante.setNotas(notasInInt);
                
                System.out.println(Operaciones.obtenerPromedio(estudiante.getNotas()));

                s.put(keyMap, estudiante);
                keyMap++;
            }
            else{
                con = false;
            }
            
        }
        while(con);

    }

    public void imprimirEstudiantes(){

        for(Integer index : s.keySet()){
            System.out.println(index +"==>"+ s.get(index));
            
        }

        System.out.println();

        Iterator<Integer> entries = s.keySet().iterator();

        while(entries.hasNext()){
            System.out.println(entries.next()+"==>"+s.get(entries.next()));
        }

        System.out.println();
        Iterator<Entry<Integer, Estudiante>> entriees = s.entrySet().iterator();
        while(entriees.hasNext()){
            Entry<Integer, Estudiante> entry = entriees.next();
            System.out.println(entry.getKey()+"==>"+ entry.getValue());
        }

        System.out.println();
        
        for( Iterator<Entry<Integer, Estudiante>> entrieees = s.entrySet().iterator(); entrieees.hasNext(); ){
            Entry<Integer, Estudiante> entry = entrieees.next();
            System.out.println(entry.getKey() +"==>"+entry.getValue().getNombre()+" "+entry.getValue().getApellido());
            System.out.printf("Promedio: %f\n", Operaciones.obtenerPromedio(entry.getValue().getNotas()));
        }

    }

}
