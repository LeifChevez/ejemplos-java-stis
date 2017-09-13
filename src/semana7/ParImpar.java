package semana7;

import java.util.Scanner;

/**
 *
 * @author memux
 */
public class ParImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println(".: Aplicación que determina si un número es par o impar :.");
        System.out.println("Ingrese el número:");
        numero = leer.nextInt();
        if (numero % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
