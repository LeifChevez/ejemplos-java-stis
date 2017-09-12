package semana6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class CalificacionLogica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("##.00");
        double parcial1, parcial2, parcial3, examenF, trabajo, promedio, calificacionFinal;
        System.out.println(".: Aplicación que calcula calificación final de Lógica Computacional :.");
        System.out.println("Ingrese la nota del parcial #1");
        parcial1 = leer.nextDouble();
        System.out.println("Ingrese la nota del parcial #2");
        parcial2 = leer.nextDouble();
        System.out.println("Ingrese la nota del parcial #3");
        parcial3 = leer.nextDouble();
        System.out.println("Ingrese la nota del examen final");
        examenF = leer.nextDouble();
        System.out.println("Ingrese la nota del trabajo ex-aula");
        trabajo = leer.nextDouble();
        promedio = (parcial1 + parcial2 + parcial3) / 3;
        calificacionFinal = (promedio * 0.55) + (examenF * 0.3) + (trabajo * 0.15);
        System.out.println("La calificación final de Lógica Computacional es " + formato.format(calificacionFinal));
    }
}
