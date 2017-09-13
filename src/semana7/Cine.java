package semana7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class Cine {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("$ ##.00");
        int edad;
        double precio, total;
        System.out.println(".: Aplicación que determina precio a pagar en el cine en función de la edad :.");
        System.out.println("Ingrese la edad de la persona:");
        edad = leer.nextInt();
        System.out.println("Ingrese el valor de la entrada:");
        precio = leer.nextDouble();
        if (edad < 18 || edad > 60) {
            total = precio / 2;
        } else {
            total = precio;
        }
        System.out.println("El precio del boleto para el cine es de " + formato.format(total));
    }
}
