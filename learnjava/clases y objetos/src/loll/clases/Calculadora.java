package loll.clases;

public class Calculadora {

    public static final double PI = 3.151592;

    public static final int sumar(int... n) {
        int result = 0;
        for(int i = 0; n.length > i; i++){
           result +=n[i];

        }
        return result;
    }

    public static final String sumar(String... n) {
        String result = "";
        for(int i = 0; n.length > i; i++){
            result +=n[i];

        }
        return result;
    }
}
