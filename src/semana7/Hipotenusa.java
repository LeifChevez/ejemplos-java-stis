package semana7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class Hipotenusa {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("####.00");
        double catetoA, catetoB, hipotenusa;
        System.out.println(".: Aplicación que calcula la hipotenusa de un triángulo :.");
        System.out.println("Ingrese el valor del primer cateto:");
        catetoA = leer.nextDouble();
        System.out.println("Ingrese el valor del segundo cateto:");
        catetoB = leer.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        System.out.println("El valor de la hipotenusa es " + formato.format(hipotenusa));
    }
}
