public class Prueba{

    public static void main(String[] args) {

        String nombres[];
        nombres = new String[3];

        nombres[0] = "L1";
        nombres[1] = "L2";
        nombres[2] = "L3";

        System.out.println(nombres.length);

        int[] array1 = {1,2,3};

        for(int i : array1){
            System.out.println(i);
        }

        int i = 0;
        while(i<array1.length){
            System.out.println(array1[i]);
            i++;
        }

        for(int j = 0; j<nombres.length; j++){
            System.out.println(nombres[j]); 
        }
    }
}