package loll.herencia;
import  loll.herencia.Persona;

public class Empleado extends Persona {

    private int idEMpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, int idEMpleado, double sueldo) {
        super(nombre);
        this.idEMpleado = ++idEMpleado;
        this.sueldo = sueldo;
    }

    public int getIdEMpleado() {
        return idEMpleado;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder("Empleado{");
        sb.append(",id=").append(this.idEMpleado);
        sb.append("sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');

        return  sb.toString();
    }
}
