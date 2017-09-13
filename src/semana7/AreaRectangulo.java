package semana7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class AreaRectangulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("####.00");
        double base, altura, area;
        System.out.println(".: Aplicación que calcula el área de un rectángulo :.");
        System.out.println("Ingrese el valor de la base:");
        base = leer.nextDouble();
        while (base <= 0) {
            System.out.println("Datos invalidos\nIngrese el valor de la base:");
            base = leer.nextDouble();
        }
        System.out.println("Ingrese el valor de la altura:");
        altura = leer.nextDouble();
        while (altura <= 0) {
            System.out.println("Datos invalidos\nIngrese el valor de la altura:");
            altura = leer.nextDouble();
        }
        area = base * altura;
        System.out.println("El area del rectángulo es " + formato.format(area));
    }
}
