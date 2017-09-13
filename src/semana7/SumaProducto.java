package semana7;

import java.util.Scanner;

/**
 *
 * @author memux
 */
public class SumaProducto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroA, numeroB, resultado;
        System.out.println(".: Aplicación que suma o multiplica dos números :.");
        System.out.println("Ingrese el primer número:");
        numeroA = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        numeroB = leer.nextInt();
        if (numeroA == numeroB) {
            resultado = numeroA + numeroB;
        } else {
            resultado = numeroA * numeroB;
        }
        System.out.println("El resultado de la operación es " + resultado);
    }
}
