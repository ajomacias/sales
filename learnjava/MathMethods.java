public class MathMethods {

    public static void main(String[] args) {
        System.out.println(MathMethods.PI);
        System.out.println(MathMethods.E);

        System.out.println(MathMethods.pow(4,2));

        System.out.println(MathMethods.random());

        int numeroRandom = (int)(MathMethods.random()*101);

        System.out.println(numeroRandom);
        System.out.println((int)(MathMethods.sqrt(64)));
        System.out.println(MathMethods.max(23, 3));
        System.out.println(MathMethods.min(3,2));
        System.out.println(MathMethods.round(1.8));

        double moneda = (double)MathMethods.round(3.4323*1000d)/1000;

        System.out.println(moneda);
    }
    
}
