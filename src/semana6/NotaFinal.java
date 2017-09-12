package semana6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class NotaFinal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("##.00");
        double parcial1, parcial2, parcial3, tarea, notaFinal;
        System.out.println(".: Aplicación que calcula la nota final del ciclo :.");
        System.out.println("Ingrese la nota del parcial #1");
        parcial1 = leer.nextDouble();
        System.out.println("Ingrese la nota del parcial #2");
        parcial2 = leer.nextDouble();
        System.out.println("Ingrese la nota del parcial #3");
        parcial3 = leer.nextDouble();
        System.out.println("Ingrese la nota de la tarea");
        tarea = leer.nextDouble();
        notaFinal = (parcial1 * 0.2) + (parcial2 * 0.25) + (parcial3 * 0.4) + (tarea * 0.15);
        System.out.println("La nota final del ciclo es " + formato.format(notaFinal));
    }
}
