package loll.herencia;

public class Empleado extends Persona {

    private int idEMpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEMpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEMpleado() {
        return idEMpleado;
    }

    public String ObtenerDetalle(){
        return super.obtenerDetalle()+"Sueldo" + this.sueldo;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Empleado{");
        sb.append(",id=").append(this.idEMpleado);
        sb.append("sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');

        return  sb.toString();
    }
}