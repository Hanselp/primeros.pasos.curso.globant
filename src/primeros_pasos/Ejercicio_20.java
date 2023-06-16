
package primeros_pasos;

import java.util.Scanner;
import javax.xml.bind.Validator;


public class Ejercicio_20 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
      
        
        llenarMatriz(matriz);
        System.out.println("  ");
        mostrarMatriz(matriz);
        System.out.println(" ");
      
    }
 public static void llenarMatriz(int matriz[][]){
          int filas,columnas;
        
        Scanner leer =  new Scanner(System.in);
        System.out.println("Ingrese los valores de 1 a 9 para llenar la matriz:");
        
        boolean valoresInvalidos;
        
        do {
        valoresInvalidos = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = leer.nextInt();
                if (valor < 1 || valor > 9) {
                    System.out.println("Ingrese un valor válido (entre 1 y 9).");
                    valoresInvalidos = true;
                    break;
                }
                matriz[i][j] = valor;
            }
            if (valoresInvalidos) {
                break;
            }
        }

        if (valoresInvalidos) {
            System.out.println("Alguno de los valores ingresados está fuera del rango. Vuelva a intentarlo.");
        }
    } while (valoresInvalidos);
}
  public static void mostrarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                //System.out.println(Arrays.deepToString(matriz));
            }
            System.out.println();
        }
    }

        }
   


