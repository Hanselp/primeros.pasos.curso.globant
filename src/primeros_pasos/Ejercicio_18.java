
package primeros_pasos;

import java.util.Arrays;

public class Ejercicio_18 {
    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
                
        llenarMatriz(matrizA);
        mostrarMatriz(matrizA);
        
        System.out.println();
        
        mostrarMatriz(matriz_Transpuesta(matrizA));
    }
 //Llenar matriz de numeros aleatorios
public static void llenarMatriz(int matriz[][]){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random()*10);
                
            }
        }
    
    }
public static void mostrarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
                //System.out.println(Arrays.deepToString(matriz));
            }
            System.out.println();
        }
    }
public static int[][] matriz_Transpuesta(int matriz[][]){
        
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
}


