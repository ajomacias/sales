package loll.test;
import loll.abstractas.*;

public class TestAbstracta {

    public static void main(String[] args) {

        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        System.out.println(figura);
        figura.dibujar();

        figura = new Cuadrado("Cuadrado");
        figura.dibujar();
        
    }
    
}
