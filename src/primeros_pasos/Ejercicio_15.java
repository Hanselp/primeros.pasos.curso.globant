
package primeros_pasos;


public class Ejercicio_15 {
    public static void main(String[] args) {
        int[] vector = new int[100];
        
        llenarVector(vector);
        mostrarVector(vector);
    }
    public static void llenarVector(int vector[]){
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]= 100 - i;
        }
    }
    public static void mostrarVector(int vector[]){
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
