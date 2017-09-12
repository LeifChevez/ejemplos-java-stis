package semana6;

import java.util.Scanner;

/**
 *
 * @author memux
 */
public class IfElse {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        System.out.println(".: Aplicación que calcula su etapa de vida en base a su edad :.");
        System.out.println("Ingrese su edad:");
        edad = leer.nextInt();
        if (edad < 0) {
            System.out.println("Ha ingresado una edad inválida");
        } else if (edad >= 0 && edad <= 12) {
            System.out.println("Usted es un niño");
        } else if (edad > 12 && edad < 18) {
            System.out.println("Usted es un adolescente");
        } else if (edad >= 18 && edad < 50) {
            System.out.println("Usted es un adulto");
        } else {
            System.out.println("Usted es una persona bastante mayor!!!");
        }
    }
}
