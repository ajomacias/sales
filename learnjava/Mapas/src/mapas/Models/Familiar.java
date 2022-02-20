package mapas.Models;
public class Familiar {
    private String nombre;
    private String vinculo;

    public Familiar(){

    }

    public Familiar(String nombre, String vinculo){
        this.nombre = nombre;
        this.vinculo = vinculo;
    }

    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setqueEs(String vinculo){
        this.vinculo = vinculo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getVinculo(){
        return this.vinculo;
    }
    
}
