package loll.clases;

public class Persona {
    private String nombre;
    private int edad;


    public void showPerson(){
        System.out.printf("Nombre: %s\nEdad: %d",nombre,edad );
    }

    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    public void setEdad(int _edad){
        this.edad = _edad;
    }
}
