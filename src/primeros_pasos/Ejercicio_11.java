
package primeros_pasos;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;


public class Ejercicio_11 {
    public static void main(String[] args) {
        menu();
        
    }
    public static void menu(){
       
        
        System.out.println("Ingresa dos numeros:");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        while (true){            
            
            System.out.println("---------------------");
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion:");
            System.out.println("---------------------");
            int opcion = leer.nextInt();
            
             

        switch(opcion){
            case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de los dos numeros es: " + suma);
                    break;
            case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de los dos numeros es: " + resta);
                    break;
            case 3:
                    int multip = num1 * num2;
                    System.out.println("La multiplicacion de los dos numeros es: " + multip);
                    break;
            case 4:
                    int divis = num1 / num2;
                    System.out.println("La division de los dos numeros es: " + divis);
                    break;
            case 5:
                    System.out.println("Has salido del menu");
                    return;
            default :
                    System.out.println("Ingrese una opcion valida");
                        continue;
                }         
       
            }   
        }
   }
