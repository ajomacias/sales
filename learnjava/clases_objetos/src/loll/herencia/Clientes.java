package loll.herencia;
import java.time.LocalDate;
import java.sql.Date;
public class Clientes extends Persona{

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contador;

    public  Clientes(Date fecha, boolean vip, String nombre, char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++contador;
        this.vip = vip;
        this.fechaRegistro = Date.valueOf(LocalDate.now());
    }

    public Clientes(){
        this.idCliente = ++contador;
        this.fechaRegistro = Date.valueOf(LocalDate.now());
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String obtenerDetalle(){
        return super.obtenerDetalle() + "vip:" + this.vip;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("id=").append(this.idCliente);
        sb.append(',').append(super.toString());
        sb.append("fechaRegistro=").append(this.fechaRegistro);
        sb.append(", vip=").append(this.vip);
        sb.append("}");

        return  sb.toString();
    }
}
