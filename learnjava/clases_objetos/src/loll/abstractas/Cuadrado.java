package loll.abstractas;

public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(String nombre){
        super(nombre);
    }
    public void dibujar(){
        System.out.println( "se dibuja un: "+ this.getClass().getSimpleName());
    }
}
