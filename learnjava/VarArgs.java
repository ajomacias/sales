public class VarArgs {

    public static void main(String[] args) {
        System.out.println(sumar(1,2,3,4,10));
        System.out.println(sumar('1','2','3','4','0'));
    }

    static int sumar(int... numeros)
    {
        int resultado = 0;
        for(int n : numeros){
            resultado +=n;
        }
        return resultado;
    }

    static String sumar(char... characteres)
    {
        String cadena = "";
        for(char ch : characteres)
        {
            cadena +=ch;
        }
        return cadena;
    }

    static double sumar(){
        return 1d;
    }
    
}