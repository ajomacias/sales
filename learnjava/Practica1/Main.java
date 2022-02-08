import Controllers.EstudiantesController;

public class Main{

    public static void main(String[] args) {

        EstudiantesController estudiates = new EstudiantesController();

        estudiates.ingresarEstudiantes();
        estudiates.imprimirEstudiantes();
        
    }
}