
package primeros_pasos;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio_16 {
    public static void main(String[] args) {
        int vector[];
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea encontrar dentro del vector del 1 al 10.");
        num = leer.nextInt();
        System.out.println("_________________________________________________________");
        vector = new int[10];
        
        llenarVector(vector);
        mostrarVector(vector);
        encontrarNum(vector, num);
    }
    
 // Llena el vector con valores aleatorios del 1 al 10.
 public static void llenarVector(int vector[]){
     
     for (int i = 0; i < vector.length; i++) {
         vector[i] = (int) (Math.random() * 10) + 1;
     }
 
 }
    //Muestra el contenido del vector.
    public static void mostrarVector(int vector[]){
        
        System.out.println(Arrays.toString(vector));
        
    }
        //Encuentra el numero en el vector, dice su posicion y cuanta las veces que esta repetido.
        public static void encontrarNum(int vector[], int num){
            
            int contador, contador2;
            
            contador = 0;
            contador2 = 0;
            boolean n = false;
            
            for (int i = 0; i < vector.length; i++) {
                contador++;
                if (num>10 || num==0) {
                    System.out.println("Ingrese un numero valido.");
                    return;
                }
                    if (num == vector[i]) {
                    contador2++;
                    n = true;
                    System.out.println("__________________________________________________________");
                    System.out.println("Encontrado en la posicion " + contador + " del vector"); 
                    System.out.println("__________________________________________________________");
                
                 
            }
                }if (contador2 == 1) {
                    System.out.println("y se encuentra repetido " + contador2 + " vez.");
                    }if (contador2>=2) {
                        System.out.println("y se encuentra repetido " + contador2 + " veces.");
            }
                    if(n==false){
                            System.out.println("__________________________________________________________");
                            System.out.println("No se encontro el numero ingresado");
                            System.out.println("__________________________________________________________");
            }
            
        }
}
