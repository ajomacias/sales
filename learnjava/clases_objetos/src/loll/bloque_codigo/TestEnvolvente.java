package loll.bloque_codigo;

public class TestEnvolvente {

    public static void main(String[] args) {
        Integer n1 = 10;
        System.out.println("Entero->"+n1+"->"+(n1+n1) );

        String ns = n1.toString();
        System.out.println("Entero a string->"+ns+"->"+(ns+ns));
        int n2 = n1;
        n2 = Integer.parseInt(ns);
        System.out.println(n2+n2);

        double dou = Double.parseDouble(ns);
        System.err.println(dou);
    }
    
}
