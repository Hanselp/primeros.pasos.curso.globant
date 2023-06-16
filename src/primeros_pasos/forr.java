
package primeros_pasos;

import java.util.Scanner;


public class forr {



    public static void main(String[] args) {
        
         int numero;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
           
            while (true) {
                System.out.print("Ingrese un número entre 1 y 20: ");
                numero = scanner.nextInt();
                if (numero >= 1 && numero <= 20) {
                    break;
                } else {
                    System.out.println("El número ingresado está fuera del rango permitido.");
                }
            }

            System.out.print(numero + " ");
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
