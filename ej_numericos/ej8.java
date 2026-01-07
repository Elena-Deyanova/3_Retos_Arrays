import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5}; 

        imprimir(numeros);
        

    }
    static void imprimir(int[] a){
        Scanner lector = new Scanner(System.in); 


        System.out.println("Dime una posicion 0-4");
        int posicion = lector.nextInt(); 

        System.out.println("Ahora dime por cual numero quieres cambiarlo");
        int numero = lector.nextInt(); 

        for (int i = 0; i < a.length; i++) {
            if (i == posicion) {
                a[i] = numero; 
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "-");
        }
    }

}
