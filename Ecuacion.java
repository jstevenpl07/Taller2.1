import java.util.Scanner;

public class Ecuacion {
     public static void main(String[] args){

        Scanner entrada = new Scanner(System.in); 
        double x = 0 ;
        double z = 0 ; 
       

        int opcion;
        System.out.println("Seleccione una ecuacion: ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.print("Opcion: ");
      


        System.out.println("Ingrese un valor para x: ");
        while (!entrada.hasNextDouble()) { // Para verificar que se ingreso un dato numerico para x, 
        System.out.println ("Ingrese un valor numerico");
           
            entrada.next ();
            System.out.println("Ingrese un valor valido para x: ");
            }
            x = entrada.nextDouble(); // Se acepto y almaceno la variable x

        System.out.println("Ingrese un valor para z: ");
        while (!entrada.hasNextDouble()) { // Para verificar que se ingreso un dato numerico para z
        System.out.println ("Ingrese un valor numerico") ;

            entrada.next ();
            System.out.println("Ingrese un valor valido para z: ");
            }
            z = entrada.nextDouble(); // Se acepto y almaceno la vaiable z


            double a = (3*x)/((1)+((3*x)/(3*(z*(z))+2)))/(1/((1/(1+z))+3*(x*(x))+2*z+3)) ;

            


        System.out.println("El resultado es: " + a);
            }

            

    









        

}

