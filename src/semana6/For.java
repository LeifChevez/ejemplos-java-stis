package semana6;

import java.util.Scanner;

/**
 *
 * @author memux
 */
public class For {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int tabla;
        System.out.println(".: Aplicación que calcula la tabla de multiplicar utilizando el for :.");
        System.out.println("Ingrese un número para calcular su tabla de multiplicar");
        tabla = leer.nextInt();
        System.out.println("Se mostrará la tabla de multiplicar del número " + tabla);
        for (int i = 1; i <= 10; i++){
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
    }
}
