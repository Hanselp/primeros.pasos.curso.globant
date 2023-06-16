
package primeros_pasos;

import java.util.Scanner;


public class Ejercicio_3 {
    public static void main(String[] args) {
        dimeFrase();
    }
    public static void dimeFrase(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase para convertirla en mayuscula y luego en minusculas");
        String frase = leer.nextLine();
        String minFrase = frase.toLowerCase();
        String mayFrase = frase.toUpperCase();
        
        System.out.println("Frase ingresada en mayuscula: " + mayFrase);
        System.out.println("Frase ingresada en minuscula: " + minFrase);
    }
}
