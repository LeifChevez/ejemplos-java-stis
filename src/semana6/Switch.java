package semana6;

import java.util.Scanner;

/**
 *
 * @author memux
 */
public class Switch {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println(".: Aplicación que emite un mensaje en base a un número :.");
        System.out.println("Ingrese un número entre 1 y 5");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("1 - Hola mundo");
                break;
            case 2:
                System.out.println("2 - Bienvenido/a a la aplicación");
                break;
            case 3:
                System.out.println("3 - Que tenga un buen día");
                break;
            case 4:
                System.out.println("4 - Ojala le guste el lenguaje JAVA");
                break;
            case 5:
                System.out.println("5 - Practique constantemente y será un gran programador");
                break;
            default:
                System.out.println("Seleccionó una opción inválida");
                break;
        }
    }
}
