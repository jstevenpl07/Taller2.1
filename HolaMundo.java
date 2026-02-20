import java.time.LocalDate;
import java.util.Scanner;

class HolaMundo {
    public static void main(String[] args){
        int edad = 23;


        double promedio = 4.0;


        float estatura = 1.80f; // Leer datos de hasta 32 bits
        long  poblacionMundial = 80000000L; // Leer dato de hasta 64 bits 

        char incial = 'J'; 

        boolean esEstudiante = true;

        byte nivel = 10;
        short peso = 57;
        String nombre = "Julian";

        Integer numeroEntero = 400;
        String [] ciudades = {"Medellin","Cali"};
        int [] numerosDeGrupo = {1, 2, 3, 4};
        LocalDate today = LocalDate.now();
        int [] arr;
        arr = new int[4];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;

        int x = 65;
        double y = 4.1;
        byte z = 80;
        float t = 1.70f;
        String j = nombre;






        Scanner scanner = new Scanner(System.in);
        System.out.println("int [] (numerosDeGrupo): " + numerosDeGrupo);
        System.out.println("int (edad): " + edad );
        System.out.println("double (promedio): " + promedio);
        System.out.println("float (estatura): " + estatura);
        System.out.println("long (poblacionMundial): " + poblacionMundial);
        System.out.println("char(inicial): " + incial);
        System.out.println("boolean(esEstudiante): " + esEstudiante);
        System.out.println("byte(nivel): " + nivel);
        System.out.println("short(peso): " + peso);
        System.out.println("String(nombre): " + nombre);
        System.out.println("Integer(numeroEntero): " + numeroEntero);
        System.out.println("String [] (cidudades): " + ciudades);
        System.out.println("LocalDate(today): " + today);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
        System.out.println(j);





        
    }
}