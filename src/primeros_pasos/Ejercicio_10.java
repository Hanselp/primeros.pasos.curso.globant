
package primeros_pasos;

import java.util.Scanner;


public class Ejercicio_10 {
    public static void main(String[] args) {
        
            numEntrada();
    }
    public static void numEntrada(){
        int contador;
        System.out.println("Ingrese el limite:");
        Scanner leer = new Scanner(System.in);
            int limite = leer.nextInt();
        System.out.println("Ingrese un numero:");
            int num = leer.nextInt();
            contador = limite;
        while (num <=  limite) { 
            
            contador = limite - num;
            System.out.println("Queda el valor de  " + contador + ", ingresa un numero nuevamente:" );
            int num1 = leer.nextInt();
            num += num1;
        }
            System.out.println("Has sobrepasodo el limite");
    }

}
