package semana7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class PromedioGrupo {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("##.00");
        int cantidad;
        double notas = 0;
        System.out.println(".: Aplicación que calcula promedio de notas de un grupo de alumnos :.");
        System.out.println("Ingrese la cantidad de alumnos:");
        cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingrese la nota del alumno #" + (i + 1));
            notas += leer.nextDouble();
        }
        System.out.println("La nota promedio del grupo es de " + formato.format(notas / cantidad));
    }
}
