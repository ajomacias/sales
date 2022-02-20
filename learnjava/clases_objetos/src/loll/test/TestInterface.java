package loll.test;
import loll.interfaces.*;

public class TestInterface {
    public static void main(String[] args) {
        BaseDatos datos = new ImplementarMysql();
        datos.insertar();
    }
    
}
