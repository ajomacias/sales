public class FuncionesRecursivas {

    public static void main(String[] args) {
        System.out.println();
    }

    static void cuantaRegresiva(int numero)
    {
        --numero;

        if(numero>0){
            System.out.println(numero);
            cuantaRegresiva(numero);
        }else{
            System.out.println("fin");
        }
    }
}
