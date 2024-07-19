package ejercicio8;

import java.util.Map;

public class Division {

    public static int[] divisionEnteraRecursiva(int dividendo, int divisor) {
        // Creamos un array para almacenar el cociente y el resto
        int[] resultado = new int[2];

        if (divisor == 0) {
            throw new IllegalArgumentException("División por cero");
        }

        if (dividendo < divisor) {
            // Caso base: si el dividendo es menor que el divisor
            resultado[0] = 0; // Cociente es 0
            resultado[1] = dividendo; // Resto es el dividendo mismo
        } else {
            // Caso recursivo: restamos divisor del dividendo y llamamos recursivamente
            int[] temp = divisionEnteraRecursiva(dividendo - divisor, divisor);
            resultado[0] = temp[0] + 1; // Incrementamos el cociente
            resultado[1] = temp[1]; // El resto se mantiene igual
        }
        return resultado;
    }

    public static void mostrarResultado(int[] a){
        System.out.println(STR."Cociente: \{a[0]} - Resto: \{a[1]}");
    }

}
