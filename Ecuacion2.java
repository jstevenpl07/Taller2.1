
 import java.util.Scanner;
public class Ecuacion2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {   // 🔁 CICLO INFINITO

            
            System.out.print("Ingrese el valor de x: ");
            double x = sc.nextDouble();

            System.out.print("Ingrese el valor de z: ");
            double z = sc.nextDouble();

            // ✅ CONDICION 1
            if (z == 0) {
                System.out.println("Error: z no puede ser 0");
                continue;
            }

            // ✅ CONDICION 2
            if (1 + 3*x == 0) {
                System.out.println("Error en 1 + 3x");
                continue;
            }

            // ✅ CONDICION 3
            if (1 + 2*z == 0) {
                System.out.println("Error en 1 + 2z");
                continue;
            }

            // ✅ CONDICION 4
            if (1 + (5.0/z) == 0) {
                System.out.println("Error en 1 + (5/z)");
                continue;
            }

            double parteA = ((x*x)+3*z+2)/(2+(1.0/(1+2*z)));

            // ✅ CONDICION 5
            if (parteA == 0) {
                System.out.println("Parte A es 0");
                continue;
            }

            double parteB = (1+3*(x*x*x)+3*z+2);

            // ✅ CONDICION 6
            if (parteB == 0) {
                System.out.println("Parte B es 0");
                continue;
            }

            double parteC =
            (1.0/
            ((1.0/(1+3*x))
            +
            ((3*x+1)/(2*3+(3.0/(1+(5.0/z)))))));

            // ✅ CONDICION 7
            if (parteC == 0) {
                System.out.println("Parte C es 0");
                continue;
            }

            double resultado = parteA + (2.0 / (parteB / parteC));

            // ✅ CONDICION 8
            if (resultado < 0) {
                System.out.println("Resultado negativo");
            }

            System.out.println("El resultado es: " + resultado);

            System.out.println("El programa se repite (ciclo infinito)...");
        }
    }
}

