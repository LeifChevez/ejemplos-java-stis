package semana7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class ValorCompra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("$ ####.00");
        String nombre;
        double valor, descuento;
        System.out.println(".: Aplicación que determina monto real a pagar en función de valor de compra :.");
        System.out.println("Ingrese nombre del cliente:");
        nombre = leer.next();
        System.out.println("Ingrese el valor de la compra:");
        valor = leer.nextDouble();
        if (valor <= 75){
            descuento = 0;
        } else if (valor > 75 && valor <= 150){
            descuento = valor * 0.05;
        } else {
            descuento = valor * 0.1;
        }
        System.out.println("El cliente " + nombre + " a realizado una compra con un valor de " + formato.format(valor)
                + " y el monto a pagar es de " + formato.format(valor - descuento));
    }
}
