import java.util.ArrayList;

/**
 * Contiene los métodos generarPrimos, esPrimo, generarFibonacci, todos métodos estaticos
*/
public class Algoritmos {

    public Algoritmos() {}
 
    /**
     * Este método calcula la cantidad de números primos
     * @param limite es la cantidad de primos para calcular
     * @return ArrayList<Integer> que contiene todos los números primos generados
     * <pre>
     * {@code
     * // Ejemplo de uso:
     * var primos = Algoritmos.generarPrimos(5);
     * for(int primo : primos) System.out.printf("%d, ", primo);
     * // Salida: 2, 3, 5, 7, 11, 
     * }
     * </pre>
    */
    public static ArrayList<Integer> generarPrimos(int limite) {
        var primos = new ArrayList<Integer>();
            
        // Comenzamos desde el primer número primo
        for(int numero = 2; primos.size() < limite; numero++)
            if(esPrimo(numero)) primos.add(numero);
            
        return primos;
    }
    
    /**
     * Este método evalua si un numero es primo o no
     * @param numero es el numero a evaluar
     * @return True si es primo, False si no; 
    */
    private static boolean esPrimo(int numero) {
        if(numero < 2) return false;

        for(int i = 2; i <= Math.sqrt(numero); i++)
            if(numero % i == 0) return false;

        return true;
    }

        /**
     * Este método calcula la secuencia de Fibonacci
     * @param limite es la cantidad de la secuencia para calcular
     * @return ArrayList<Long> que contiene todos la secuencia generada
     * <pre>
     * {@code
     * // Ejemplo de uso:
     * var fibonacci = Algoritmos.generarFibonacci(5);
     * for(int numero : fibonacci) System.out.printf("%d, ", numero);
     * // Salida: 1, 1, 2, 3, 5,
     * }
     * </pre>
    */
    public static ArrayList<Long> generarFibonacci(int limite) {
        var fibonacciArray = new ArrayList<Long>();
        
        fibonacciArray.add(0L);
        if(limite > 1) fibonacciArray.add(1L);
        
        for(int i = 2; i < limite+1; i++)
            fibonacciArray.add(fibonacciArray.get(i-1) + fibonacciArray.get(i-2));
        
        fibonacciArray.remove(0);

        return fibonacciArray;
    }
}
