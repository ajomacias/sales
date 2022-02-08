package Models;

public class Estudiante {

    private String nombre;
    private String apellido;
    private Double[] notas;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Double[] getNotas() {
        return notas;
    }
    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
    
}
