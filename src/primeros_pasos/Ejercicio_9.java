
package primeros_pasos;

import java.util.Scanner;


public class Ejercicio_9 {
    public static void main(String[] args) {
        System.out.println("Ingresa una frase:");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        
        fraseCaract(frase);
    }

    public static void fraseCaract(String f){
                  
        if (f.substring(0,1).equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        }else
            System.out.println("INCORRECTO");
    }

}
