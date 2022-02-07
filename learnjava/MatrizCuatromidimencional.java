public class MatrizCuatromidimencional {

    public static void main(String[] args){

        int[][][][] cuatro = {
            {
                {
                    {1,2,3,4},
                    {5,6,7,8}

                },
                {
                    {9,10,11},
                    {12,13,14,15,16}

                }

            },
            {
                {
                    {17},
                    {18,19}

                },
                {
                    {20,21},
                    {22,23,24}


                }

            },
            {
                {
                    {25},
                    {26}
                }
            },
        };

        for(int[][][] tres : cuatro)
        {
            for(int[][] dos : tres )
            {
                for(int[] uno : dos)
                {
                    for(int num : uno)
                    {
                        System.out.print(num);
                    }  
                }
            }
        }
    }
}
