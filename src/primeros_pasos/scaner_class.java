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
public class scaner_class {
    public static void main(String[] args) {
        
        int tipoMotor;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 4 para obtener el motor:");
        tipoMotor = entrada.nextInt();
        
        switch(tipoMotor){
            case 1:
                System.out.println("“La bomba es una bomba de agua”.");
                break;
            case 2:
                System.out.println("“La bomba es una bomba de\n" +
                                    "gasolina”.");
                break;
            case 3:
                System.out.println("“La bomba es una bomba de\n" +
                                    "hormigón”.");
                break;
            case 4:
                System.out.println("“La bomba es una bomba de pasta\n" +
                                    "alimenticia”.");
                break;
            default:
                System.out.println("“No existe un valor\n" +
                                    "válido para tipo de bomba”");
        
        }
                
    }
}
