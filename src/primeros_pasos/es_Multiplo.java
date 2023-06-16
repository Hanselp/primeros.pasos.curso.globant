
package primeros_pasos;

import java.util.Scanner;


public class es_Multiplo {
    public static void main(String[] args) {
        System.out.println("Por favor, ingrese dos numeros:");
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        int b = leer.nextInt();
        
        EsMultiplo(a, b);
    }
    
    public static void EsMultiplo(int a, int b){
        
        if(a % b ==  0){
            System.out.println("El numero " + a + ", es multiplo de " + b);
        
        }else{
            System.out.println("El primer numero no es multiplo del segundo");
        }
                        
    }
}
