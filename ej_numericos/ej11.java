import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        int[] numeros = new int[10]; 
        Scanner lector = new Scanner(System.in); 

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime un numero: ");
            numeros[i] = lector.nextInt(); 
        }

        reemplazarNegativosPorCero(numeros);
    }
    static void reemplazarNegativosPorCero (int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 ) {
                a[i] = 0; 
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
