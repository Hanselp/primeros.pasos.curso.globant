
package primeros_pasos;

import java.util.Scanner;


public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centigrados para convertirlos a en grados Fahrenheit:");
        int centigrados =  leer.nextInt();
        
        int conversion = convertir(centigrados);
        System.out.println("Los " + centigrados + " grados centigrados convertidos a Fahrenheit son: " + conversion  + " F.");
    }
        public static int convertir(int ctg){
            
            int f  = 32 + (9 * ctg / 5);
            
            
        return f;
            
        }
}
