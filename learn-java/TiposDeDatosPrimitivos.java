/*
Tipo de datos primitivos

byte = almacena numeros enteros de -128 a 127
short = almacena numeros enteros de -32,768 a 32 767
int = almacena numeros emteros de -2,147,483,648 a 2,147,483,647
long = almacena numeros enteros de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
float = almacena numeros decimales con lo suficiente para almacenar de 6 a7 digitos bytes decimal
double = almacena numeros decimales con lo suficiente para almacenar 15  digitos bytes decimal
char = Almacena un caracter o codigo ASCII
boolean = amacena valores de verdadero o falso
*/
public class TiposDeDatosPrimitivos {


    public static void main(String[] args){
        byte edad = 20;
        System.out.println(edad);
        Long numeroGrande = 1212312312312312234l;
        System.out.println(numeroGrande);
        float nd = 12123.133f;
        System.out.println(nd);
        double ndd = 12213123.12d;
        System.out.println(ndd);
        ndd = 121323.2;
        System.out.println(ndd);
        char letra = 'a'; //Funciona entre comillas simples
        System.out.println(letra);
        boolean opcion = false;
        System.out.println(opcion);
    }
    
}
