import java.util.Scanner;

public class PrecioVenta {
    private static Scanner entradaPorTeclado = new Scanner(System.in);

    public static void main(String[] args ){
        double vv,igv, pv;
        System.out.println("--------------Precio de venta----------------");
        System.out.print("Ingrese valor de venta: ");
        vv = entradaPorTeclado.nextDouble();
        igv = vv* 0.18;
        pv = igv + vv;

        System.out.println("valor de venta: "+ vv);
        System.out.println("IGV: "+ igv);
        System.out.println("precio de venta: "+pv);
        System.out.println("--------------Precio de venta----------------");

    }
    
}