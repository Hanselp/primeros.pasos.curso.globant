
package primeros_pasos;

import java.util.Scanner;


public class Ejercicio_2 {
    public static void main(String[] args) {
        dimeNombre();
    }
        public static void dimeNombre(){
        
            System.out.println("Por favor, ingresa tu nombre a continuacion:");
            Scanner leer = new Scanner(System.in);
            String nombre = leer.nextLine();
            System.out.println("Tu nombre es: " + nombre);
        }
}
