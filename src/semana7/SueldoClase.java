package semana7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class SueldoClase {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("$ ####.00");
        int horas;
        String nombre;
        final double claseA = 7;
        final double claseB = 8.50;
        final double claseC = 10;
        final double claseD = 12.50;
        double salario = 0;
        System.out.println(".: Aplicación que calcula el salario en base a categoría y horas :.");
        System.out.println("Ingrese el nombre del empleado:");
        nombre = leer.next();
        System.out.println("Ingrese la cantidad de horas semanales:");
        horas = leer.nextInt();
        System.out.println("Ingrese la clase del empleado:");
        switch (leer.next().toUpperCase().charAt(0)) {
            case 'A':
                salario = horas * claseA;
                break;
            case 'B':
                salario = horas * claseB;
                break;
            case 'C':
                salario = horas * claseC;
                break;
            case 'D':
                salario = horas * claseD;
                break;
            default:
                System.out.println("¡Categoría incorrecta!");
                break;
        }
        if (salario > 0){
            System.out.println("El salario semanal de " + nombre + " es de " + formato.format(salario));
        }
    }
}
