package semana7;

import java.util.Scanner;

/**
 *
 * @author memux
 */
public class Coordenadas {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int coordenadaX, coordenadaY;
        System.out.println(".: Aplicación que determina cuadrante y ejes en función de coordenadas :.");
        System.out.println("Ingrese la coordenada X:");
        coordenadaX = leer.nextInt();
        System.out.println("Ingrese la coordenada Y:");
        coordenadaY = leer.nextInt();
        if (coordenadaX > 0 && coordenadaY > 0){
            System.out.println("Las coordenadas corresponden al primer cuadrante");
        } else if (coordenadaX < 0 && coordenadaY > 0){
            System.out.println("Las coordenadas corresponden al segundo cuadrante");
        } else if (coordenadaX < 0 && coordenadaY < 0){
            System.out.println("Las coordenadas corresponden al tercer cuadrante");
        } else if (coordenadaX > 0 && coordenadaY < 0){
            System.out.println("Las coordenadas corresponden al cuarto cuadrante");
        } else if (coordenadaX == 0 && (coordenadaY > 0 || coordenadaY < 0)){
            System.out.println("Se encuentra en el eje de las Y");
        } else if (coordenadaY == 0 && (coordenadaX > 0 || coordenadaX < 0)){
            System.out.println("Se encuentra en el eje de las X");
        } else if (coordenadaX == 0 && coordenadaY == 0){
            System.out.println("Se encuentra en el origen");
        }
    }
}
