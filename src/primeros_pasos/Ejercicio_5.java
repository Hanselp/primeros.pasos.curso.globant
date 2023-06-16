
package primeros_pasos;

import java.util.Scanner;


public class Ejercicio_5 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero, por favor:");
        Scanner leer = new Scanner(System.in);
            int num =  leer.nextInt();
        
            numeroMulti(num);
    }
        public static void numeroMulti(int num){
            
            int doble = num * 2;
            int triple = num * 3;
            double raiz = Math.round(Math.sqrt(num));
            
            System.out.println("El doble de " + num + " es: " + doble + ", el triple es: " + triple + " y la raiz es: " + raiz);
                        
        }
}
