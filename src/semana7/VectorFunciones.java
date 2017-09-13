package semana7;

import java.util.Scanner;

/**
 *
 * @author memux
 */
public class VectorFunciones {
    public static void main(String[] args){
        int[] vector = new int[5];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++){
            System.out.println("Ingrese el número: " + (i + 1));
            vector[i] = leer.nextInt();
        }
        parImpar(vector);
    }
    
    public static void parImpar(int vector[]){
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < vector.length; i++){
            if (vector[i] % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("La cantidad de números pares es " + pares);
        System.out.println("La cantidad de números impares es " + impares);
    }
}
