
package primeros_pasos;

import java.util.Scanner;

public class ejempl_2 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una secuencia de caracteres terminada en punto: ");
        String texto = scanner.nextLine();
        String codificado = codificar(texto);
        System.out.println("Texto codificado: " + codificado);
    }

    public static String codificar(String texto) {
        StringBuilder codificado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            switch (Character.toLowerCase(caracter)) {
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


