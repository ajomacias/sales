public class Funciones {

    public static void main(String[] args) {
        quienSoy("texto");
        System.out.println(sumar(10, 20));   
        stringToArray("lololol");
        System.out.println(sumaDecima(2.1, 2.2));     
    }
    
    static void quienSoy(String text){
        System.out.println(text);
    }

    static int sumar(int n1, int n2)
    {
        return (n1+n2);
    }
    static char[] stringToArray(String text)
    {
        for(char c : text.toCharArray()){
            System.out.println(c);
        }
        return text.toCharArray();
    }
    static double sumaDecima(double a , double b)
    {
        return a + b;
    }
}