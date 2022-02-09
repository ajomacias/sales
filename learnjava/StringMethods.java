
public class StringMethods {

    public static void main(String[] args) {
        var text = "hola ander";

        System.out.println(text.charAt(0));
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.replace("o", "i"));
        System.out.println(text.split(" "));
        System.out.println(text.replaceAll("a","e"));

    }
    
}
