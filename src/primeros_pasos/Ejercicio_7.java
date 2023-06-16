
package primeros_pasos;

import java.util.Scanner;


public class Ejercicio_7 {
    public static void main(String[] args) {
        
        leerMensaje();
    }

public static void leerMensaje(){
    System.out.println("Ingresa una frase:");
    Scanner leer = new Scanner(System.in);
    String frase = leer.nextLine();
    
    
    if(frase.equalsIgnoreCase("Eureka")){
        System.out.println("Correcto");
    }else
        System.out.println("Incorrecto");
    
    }
}
