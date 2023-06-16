
package primeros_pasos;

import java.util.Scanner;


public class Primeros_Pasos {

  
    public static void main(String[] args) {
        
    int num1, num2;
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese dos numeros, por favor:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
      
        if (num1 > 25 && num2 > 25 ) {
            System.out.println("Ambos numeros son mayores a 25");
        } else if (num1 < 25 && num2 < 25 ) {
            System.out.println("Ambos numeros son menores a 25");
                 
        }else if (num1 > 25 || num2 < 25 ) {
            System.out.println("El primer numero es mayor");
        }else if (num1 < 25 || num2 > 25) {
            System.out.println("El segundo numero es mayor");
        }else
            System.out.println("Ingrese un numero valido");
      
    }
    
}
