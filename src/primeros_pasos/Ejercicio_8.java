
package primeros_pasos;

import java.util.Scanner;


public class Ejercicio_8 {
    public static void main(String[] args) {
        leerFrase();
    }

public static void leerFrase(){
    System.out.println("Ingrese una frase:");
    Scanner leer = new Scanner(System.in);
    String frase = leer.nextLine();
    
    if (frase.length()== 8) {
        System.out.println("CORRECTO");
    }else
        System.out.println("INCORRECTO");
    }   

}
