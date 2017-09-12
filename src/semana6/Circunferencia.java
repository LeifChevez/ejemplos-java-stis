package semana6;

import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author memux
 */
public class Circunferencia {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("####.00");
        double radio;
        System.out.println(".: Aplicación que calcula área y diámetro de una circunferencia :.");
        System.out.println("Ingrese el valor del radio:");
        radio = leer.nextDouble();
        double diametro = radio * 2;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área de la circunferencia es " + formato.format(area));
        System.out.println("El diámetro de la circunferencia es " + formato.format(diametro));
    }
}
