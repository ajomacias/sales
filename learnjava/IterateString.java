public class IterateString{

    public static void main(String[] args){
        String cadena = " Hola papu soy ander";
        char[] chars = cadena.toCharArray();

        for(char l : chars){
            if(Character.compare(l, ' ') == 0){
                continue;
            }
            System.out.println(l);
        }
    }
}