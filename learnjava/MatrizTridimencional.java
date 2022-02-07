public class MatrizTridimencional {

    private static char[][][] c = {
        {
            {'a','b','c'},
            {'d','e','f'}

        },
        {
            {'h','i','q'},
            {'j','k','l'}
        },
    };

    public static void main(String[] args ){
        for(char[][] bidimencional: c )
        {
            for(char[] matriz: bidimencional)
            {
                for(char character : matriz)
                {
                    System.out.print(character);
                }
            }
        }
    }
}