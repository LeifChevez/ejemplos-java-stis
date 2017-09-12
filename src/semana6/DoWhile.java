package semana6;

import java.util.Scanner;

/**
 *
 * @author memux
 */
public class DoWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tabla;
        System.out.println(".: Aplicación que calcula la tabla de multiplicar utilizando el do while :.");
        System.out.println("Ingrese un número para calcular su tabla de multiplicar");
        tabla = leer.nextInt();
        System.out.println("Se mostrará la tabla de multiplicar del número " + tabla);
        int i = 1;
        do {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
            i++;
        } while (i <= 10);
    }
}
