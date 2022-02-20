package loll.herencia;

public class Persona {

    protected  String nombre;
    protected  char genero;
    protected  int edad;
    protected String direccion;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public String obtenerDetalle(){

        return "Nombre:"+this.nombre+"Edad:"+ this.edad;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
   @Override
   public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("nombre='").append(this.nombre + '\'');
        sb.append(", edad='").append(this.edad);
        sb.append(", genero='").append(this.genero + "'");
        sb.append(", direccion='").append(this.direccion + "', ");

        return  sb.toString();
   }

   @Override
   public boolean equals(Object object)
   {
       if(this == object) return true;
       if(object == null ) return false;
       if(getClass() != object.getClass()) return false;
       final Persona per = (Persona) object;
       if(!this.direccion.equals(per.direccion) ) return false;
       if(this.edad != per.edad ) return false;
       if(this.genero != per.genero);
       if(!this.nombre.equals(per.nombre)) return false;
       return true;

   }
}
