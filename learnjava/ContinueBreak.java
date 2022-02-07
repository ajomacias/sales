public class ContinueBreak{

    public static void main(String[] args ){

        for(int i = 0; i<20; ++i){
            if(i == 5){
                System.out.println("Llego a " +i);
                break;
            }
            System.out.println("..");
        }

        for(int i = 1; i<10; ++i){
            if(i == 5){
                System.out.println("Llego a " +i);
                continue;
            }
            System.out.println(".."+i);
        }
    }
}