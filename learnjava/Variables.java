public class Variables {

    public static void main(String[] args ){

        String nombre;
        int a,b,c,d;
        int edad = 19;
        nombre = "Anderson Jhoan";
        a = 12;
        b = 29;
        c = 19;
        d = 34;

        edad=20;

        System.out.println(nombre);
        System.out.println(edad);

        System.out.println(a+b+c+d);

        //Nueva forma de definir variables

        var primerNombre = "Anderson ";
        var segundoNombre = "Jhoan"; //Debemos asignarle el valor cuando es creada
        var misNombres = primerNombre + segundoNombre;
        System.out.println("Mi nombre es: "+ misNombres);

    }
    
}
