
package primeros_pasos;

import java.util.Scanner;


public class funciones {
    public static void main(String[] args) {
        
        String frase, codificado;
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase, por favor:");
        frase = entrada.nextLine();
        
        codificado = codificacion(frase);
        System.out.println(codificado);
    }
    
    public static String codificacion (String frase){
        StringBuilder codificado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            
            
          switch(Character.toLowerCase(caracter)){
                case 'a':
                         codificado.append('@');
                         break;
                case 'e':
                        codificado.append('#');
                        break;
                case 'i':
                        codificado.append('$');
                        break;
                case 'o':
                        codificado.append('%');
                        break;
                case 'u':
                        codificado.append('*');
                        break;
                default:
                        codificado.append(caracter);
                        break;
             }                 
        }
        return codificado.toString();
        
      
    }
}
