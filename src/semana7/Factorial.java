package semana7;

import java.util.Scanner;

/**
 *
 * @author memux
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int factorial = 1;
        System.out.println(".: Aplicación que el factorial de un número entero :.");
        System.out.println("Ingrese el número:");
        numero = leer.nextInt();
        for (int i = numero; i >= 1; i--){
            factorial *= i;
        }
        System.out.println(numero + "! = " + factorial);
    }
}
