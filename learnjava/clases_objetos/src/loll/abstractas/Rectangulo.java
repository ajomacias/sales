package loll.abstractas;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String figura) {
        super(figura);
    }
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un:" + getClass().getSimpleName());
    }
    
}
