import java.io.Console;

public class Ejercicio2 {

    public static void main(String[] args){


           Console console=System.console();

            if(console==null){

                System.out.println("No hay una consola dispnible");

            }  
            
            
            int age,byear,ayear;
            String b,r;


            b=console.readline("Ingrese su año de nacimiento: ");

            byear=Integer.parseint(b);

            r=console.readline("Ingrese el año actual: ");

            ryear=Integer.parseint(r);

            
            if(byear>ryear){

                System.out.println("El año de nacimiento no puede ser mayor al año actual");
            }

            if(byear <0 || ryear<o){

                System.out
            }
    }


}