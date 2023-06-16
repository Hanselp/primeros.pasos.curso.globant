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
public class doo_whilee {
    public static void main(String[] args) {
        
        int num = 0, num1, aux;
        boolean condic;
        
        condic = false;
        aux = 0;
        num1 = 0;
        
        System.out.println("Ingresa 20 numeros, pero si ingresas cero el programa se detendra.");
        Scanner entrada = new Scanner(System.in);
        
        
                 do {
                      if (num < 0) {
                              System.out.println("hola");
                          }
                      if (aux <= 19 ) {
                         
                        aux ++;
                        System.out.println("Ingresa un numero numero:");
                        num = entrada.nextInt();
                        num1 += num;
                        }
                   }while (num > 0  );
                  
                   System.out.println("Ingresaste el numero 0, el programa se ha deteniado, la suma de los numeros ingresasdos es: " + num1);
              
             }
           
            }
                    
         

