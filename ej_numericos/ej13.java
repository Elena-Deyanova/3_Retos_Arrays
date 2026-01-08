import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        int[] numeros = new int[10]; 
        int[] numeros2 = new int[10]; 
        Scanner lector = new Scanner(System.in); 

        System.out.println("Array 1: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime un numero: ");
            numeros[i] = lector.nextInt(); 
        }
        System.out.println("Array 2: ");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print("Dime un numero: ");
            numeros2[i] = lector.nextInt(); 
        }

        System.out.println("Los numeros son iguales en las posiciones: ");
        sonIguales(numeros, numeros2);

    }

    static void sonIguales (int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
