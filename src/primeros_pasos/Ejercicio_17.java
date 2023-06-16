
package primeros_pasos;

import java.util.Arrays;


public class Ejercicio_17 {
    public static void main(String[] args) {
    int vector[];
    vector = new int[100000];
        
        llenarVector(vector);
       
        recorrerVector(vector);
        
    
    }
public static void llenarVector(int vector[]){
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100000);
        
        }
    }
    public static void mostrarVector(int vector[]){
        System.out.println(Arrays.toString(vector));
    }
        public static void recorrerVector(int vector[]){
            int contador1, contador2, contador3, contador4, contador5;
            
            contador1 = 0;
            contador2 = 0;
            contador3 = 0;
            contador4 = 0;
            contador5 = 0;
            
            for (int i = 0; i < vector.length; i++) {
                
                if(vector[i] < 10){
                    contador1++;
                    }else if (vector[i] >= 10  && vector[i] <= 99) {
                         contador2++;
                         }else if(vector[i] >= 100 && vector[i] <= 999){
                            contador3++;
                            }else if (vector[i]>=1000 && vector[i]<=9999) {
                                contador4++;
                                }else if (vector[i]>=10000 && vector[i]<=100000) {
                                    contador5++;
                                    }
        
            }
            System.out.println("Los numeros de un dijito en el vector son: " + contador1);
            System.out.println("Los numeros de dos dijitos en el vector son: " + contador2);
            System.out.println("Los numeros de tres dijitos en el vector son: " + contador3);
            System.out.println("Los numeros de cuatro dijitos en el vector son: " + contador4);
            System.out.println("Los numeros de cinco dijitos en el vector son: " + contador5);
            System.out.println("Total de: " + (contador1 + contador2 + contador3 + contador4 + contador5));     
        }
}
