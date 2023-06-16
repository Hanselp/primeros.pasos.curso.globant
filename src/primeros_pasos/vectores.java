
package primeros_pasos;

import java.util.Scanner;


public class vectores {
    public static void main(String[] args) {
        String [] team = new String[5];
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los nombre del equipo:");
        for (int i = 0; i < team.length; i++) {
             team[i]=leer.nextLine();
            }
            System.out.println("Estos son los miembros del equipo");
            for (int i = 0; i < team.length; i++) { 
                System.out.println(team[i]);
                
            }                     
        }
    }

