package loll.bloque_codigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;

    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
    }

    {
        System.out.println("ejecucion bloque no estatico");
        this.idPersona = contadorPersona++;
    }

    public Persona() {
        System.out.println("Ejecucion constructor");
    }

    public int getId(){
        return this.idPersona;
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("Persona{");
        str.append("personaId=").append(this.idPersona);
        str.append('}');
        return str.toString();

    }

    
}
