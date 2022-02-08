public class FuncionesSobreCarga {

    public static void main(String[] args) {

        System.out.println(sumar("hola ", "ander"));
        System.out.println(sumar(3,4));
        System.out.println(sumar(1.2,12.33));
    }

    static int sumar(int a , int b){
        return a + b;
    }

    static double sumar(double a, double b)
    {
        return a + b;
    }

    static String sumar(String a, String b){
        return a + b;
    }
    
}
