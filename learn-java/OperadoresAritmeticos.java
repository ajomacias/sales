public class OperadoresAritmeticos {

    public static void main(String[] args )
    {
        int a = 12;
        int b = 2;
        int c = 32;

        System.out.println(b-a);
        System.out.println((a-b*c)/4);//Aritmetica

        //Operadores en asignacion

        a+=b; //a->14
        a*=b; //a->24
        a/=b; //a->6
        a%=b; //a->0

        //Operadores de decremento y incremento

        int d, e;
        d = 0;
        e = 0;

        d++;
        d++;
        e++;
        e++;
        d--;
        e--;
        e++;//se incrementa despues de la ejecucion post incremento
        ++e;//se incrementa en la ejecucion Pre incremento

        System.out.println("d: " +d + " e: "+e);



    }
    
}