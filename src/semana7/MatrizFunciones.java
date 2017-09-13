package semana7;

import java.util.Scanner;

/**
 *
 * @author memux
 */
public class MatrizFunciones {
    public static void main(String[] args){
        int[][] matriz = new int[2][2];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println("Ingrese el valor en la posición " + i + j);
                matriz[i][j] = leer.nextInt();
            }
        }
        imprimirDiagonal(matriz);
    }
    
    public static void imprimirDiagonal(int matriz[][]){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                if (i == j){
                    System.out.println("Valores de la diagonal " + matriz[i][j]);
                }
            }
        }
    }
}
