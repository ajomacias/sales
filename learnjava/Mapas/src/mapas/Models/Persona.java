package mapas.Models;

import java.util.Map;

public class Persona {
    String nombre;
    String edad;
    char genero;

    Map<Integer, Familiar> familiares;

    public Persona() {
    }

    public Persona(String nombre, String edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Map<Integer, Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(Map<Integer, Familiar> familiares) {
        this.familiares = familiares;
    }

}
