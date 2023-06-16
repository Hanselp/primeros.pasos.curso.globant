/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeros_pasos;

import java.util.Scanner;

/**
 *
 * @author hanse
 */
public class ejemplo {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }

            if (numero > 0) {
                suma += numero;
            }

            contador++;
        } while (contador < 20);

        System.out.println("La suma de los números positivos es: " + suma);
    }
}


