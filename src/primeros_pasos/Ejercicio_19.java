
package primeros_pasos;


public class Ejercicio_19 {
    public static void main(String[] args) {
        int[][] matriz = {
            {0, 1, -2},
            {-1, 0, 3},
            {2, -3, 0}
        };

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matriz);

        System.out.println("Matriz transpuesta:");
        mostrarMatriz(matrizTranspuesta);

        boolean esAntisimetrica = esMatrizAntisimetrica(matriz);

        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }

    public static boolean esMatrizAntisimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false; // No puede ser antisimétrica si no es cuadrada
        }

        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matriz);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matrizTranspuesta[i][j]) {
                    return false; // No cumple la condición de antisimetría
                }
            }
        }

        return true; // Cumple la condición de antisimetría
    }

    public static int[][] obtenerMatrizTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTranspuesta;
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
