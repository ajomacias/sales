public class OperadoresRelacionales {

    public static void main(String[] args){
        int a = 3;
        int b = 4;

        System.out.println(a == b); //false
        System.out.println(!false);  //true
        System.out.println(a == b && a > b); //false
        System.out.println(a != b || b < a); //true
        System.out.println(a == b|| a > b); //false
    }
    
}