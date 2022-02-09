public class GenerarContraseñas {

    public static void main(String[] args) {
        System.out.println(generarContrasena());
        
    }

    static String generarContrasena(){

        String[] mayus = {"A","L","P","K","W","Q","M","S","Z","Y","O"};
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        String[] minus = {"f","g","k","t","d","j","i","r","h","v","b"};

        StringBuilder contraseña = new StringBuilder();

        while(contraseña.toString().length() <= 11){
            int random1 = (int)(Math.random()*4);
            if(random1 == 1) contraseña.append(mayus[(int)(Math.random()*11)]);
            if(random1 == 2) contraseña.append(nums[(int)(Math.random()*11)]);
            if(random1 == 3) contraseña.append(minus[(int)(Math.random()*11)]);
        }

        return contraseña.toString();
    }
    
}
