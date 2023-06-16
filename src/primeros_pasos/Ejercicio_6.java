
package primeros_pasos;

import java.util.Scanner;


public class Ejercicio_6 {
    public static void main(String[] args) {
        
        numPar();
        
    }
        public static void numPar(){
            System.out.println("Ingresa un numero para ver si es par o impar:");
            Scanner leer = new Scanner(System.in);
            int num = leer.nextInt();
            
            
            if ( num % 2 == 0) {
                System.out.println("El numero " + num + " es un numero par.");
            }
            if (num == 0 || num<0){
                System.out.println("Ingresa un numero valido.");
            }else
                System.out.println("El " + num + " es un numero impar.");
            
        }
}
