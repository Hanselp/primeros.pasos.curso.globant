
package primeros_pasos;

import java.util.Scanner;


public class Ejericio_1 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos numero para sumarlos por medio de una "
                + "funcion sumar:");
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        int b = leer.nextInt();
        
        int resultado = sumar(a, b);
        
        System.out.println("La suma de los dos numeros ingresados es: " + resultado );
    
    }
public static int sumar(int a, int b){
    
    int resultado = a + b;
    
    return resultado;
}
}


