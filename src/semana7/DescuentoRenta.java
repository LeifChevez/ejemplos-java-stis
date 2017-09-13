package semana7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class DescuentoRenta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("$ ####.00");
        double sueldo, descuento;
        String respuesta;
        System.out.println(".: Aplicación que calcula el descuento de la renta :.");
        System.out.println("Ingrese el sueldo del empleado:");
        sueldo = leer.nextDouble();
        System.out.println("¿Aplica descuento de la renta?(Si - No)");
        respuesta = leer.next().toUpperCase();
        switch (respuesta) {
            case "SI":
            case "S":
                if (sueldo < 700) {
                    descuento = sueldo * 0.1;
                } else {
                    descuento = sueldo * 0.04;
                }
                System.out.println("El sueldo total que recibirá el empleado es " + formato.format(sueldo - descuento));
                break;
            case "NO":
            case "N":
                System.out.println("El sueldo total que recibirá el empleado es " + formato.format(sueldo));
                break;
            default:
                System.out.println("Respuesta inválida, lo sentimos");
                break;
        }
    }
}
