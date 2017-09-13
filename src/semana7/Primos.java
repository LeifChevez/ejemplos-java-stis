package semana7;

/**
 *
 * @author memux
 */
public class Primos {

    public static void main(String[] args) {
        int cantidadPrimos = 0;
        System.out.println(".: Aplicación que muestra los primeros 100 números primos :.");
        for (int i = 2; cantidadPrimos < 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " ");
                cantidadPrimos++;
            }
        }
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
