
package primeros_pasos;

import java.util.Scanner;



public class Ejercicio_14 {
    public static void main(String[] args) {
        int euros;
        String moneda;
        System.out.println("Por favor, ingresa la cantidad de Euros que desea convertir:");
        Scanner leer = new Scanner(System.in);
        euros = leer.nextInt();
        
        conversion(euros);
    }
    public static void conversion(int euros){
        
        int opcion;
        
        while(true){
            
        System.out.println("");
        System.out.println("Ingresa la opcion de su conversion:");
        Scanner leer = new Scanner(System.in);
        
            System.out.println("----------------------");
            System.out.println("1.Cambio a Libras");
            System.out.println("2.Cambio a Dolares");
            System.out.println("3.Cambio a Yenes");
            System.out.println("4.Salir");
            System.out.println("----------------------");
            
            opcion = leer.nextInt();
            
        
        switch(opcion){
            case 1:
                double libras = euros * 0.86;
                System.out.println("Los " + euros + " Euros equivalen a " + libras + " libras.");
                break;
            case 2:
                double dolares = euros * 1.2811;
                System.out.println("Los " + euros + " Euros equivalen a " + dolares + " dolares.");
                break;
            case 3: 
                double yenes = euros * 129.852;
                System.out.println("Los " + euros + " Euros equivalen a " + yenes + " Yenes.");
                break;
            case 4:
                System.out.println("Has salido");
                return;
            default:
                System.out.println("Ingresa una opcion valida");
                continue;
                
            }
        }
    }
}
