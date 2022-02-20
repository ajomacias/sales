package loll.interfaces;
import loll.interfaces.BaseDatos;

public class ImplementarMysql implements BaseDatos {

    @Override
    public void insertar() {
        System.out.println("Se inserto un dato");
        
    }

    @Override
    public void listar() {
        System.out.println("Se listo los datos");
        
    }

    @Override
    public void actualizar() {
        System.out.println("Se actualizo un dato");
        
    }

    @Override
    public void borrar() {
        System.out.println("Se borro un dato");
        
    }
    
}
