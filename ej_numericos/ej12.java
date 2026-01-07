import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50}; 
        
        Scanner lector = new Scanner(System.in); 

        System.out.println("Dime cuantos numeros a la derecha quieres mover: ");
        int desplazamientos = lector.nextInt(); 

        for (int i = 0; i < desplazamientos; i++) {
            System.out.println();
            desplazarDerecha(numeros);
        }
        
    }
    static void desplazarDerecha(int[] a){
        int ultimo = a[a.length - 1]; 
        
        for (int i = a.length-1; i > 0; i--) {
            a[i] = a[i -1]; 
        }

        a[0] = ultimo; 

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
