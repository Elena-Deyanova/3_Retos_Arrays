import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        int[] numeros = new int[8]; 
        Scanner lector = new Scanner(System.in); 

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime un numero: ");
            numeros[i] = lector.nextInt(); 
        }

        System.out.println("Dime el numero que buscas y te dire en la posicon que se encuentra, si este no se encuentra en el array te devolvere -1");
        int posicion = lector.nextInt(); 
        System.out.println("el numero se encuentra en la posicion: " + indiceDe(numeros, posicion));
        
    }
    static int indiceDe(int[] a, int b){
        int posicion = -1; 
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                posicion = i + 1; 
                break; 
            }
        }
        return posicion; 
    }
}
