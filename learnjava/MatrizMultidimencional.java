public class MatrizMultidimencional {

    public static void main(String[] args ){
        int[][] x = new int[3][3];
        x[0][0] = 1 ;
        x[0][1] = 2;
        x[0][2] = 3;

        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;

        x[2][0] = 7;
        x[2][1] = 8;
        x[2][2] = 9;

        int[][] y ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int[] MatrizInterna: x){
            for(int datos : MatrizInterna){
                System.out.println(datos);
            }

        }
        for(int[] arr : y){
            for(int n : arr){
                System.out.println(n);
            }
        }
    } 
}
