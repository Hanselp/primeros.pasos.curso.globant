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
public class whilee {
    public static void main(String[] args) {
        
        int nota;
        boolean condicion;
        
        condicion = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la nota:");
 
        nota = entrada.nextInt();
        
        while (nota < 0 || nota > 10){
            condicion=true;
            System.out.println("Ingresa una nota que este entre 0 y 10");
            nota = entrada.nextInt();
        }
        if (condicion) {
            System.out.println("Has ingresado una nota correcta, gracias");
        }
        
    }
}
