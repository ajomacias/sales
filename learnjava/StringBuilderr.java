public class StringBuilderr {

    public static void main(String[] args) {
        StringBuilder nuevo = new StringBuilder();
        System.out.println(nuevo);

        nuevo.append("Hola");

        System.out.println(nuevo);

        nuevo.append(" Mundo");

        System.out.println(nuevo.toString());
    }
    
}
