import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); 

        System.out.println("Dime un valor inicial: ");
        int v = lector.nextInt(); 

        System.out.println("Dime ahora por cuanto quieres que se vaya sumando ese numero: ");
        int i = lector.nextInt();

        System.out.println("Dime ahora cuanto de largo quieres que sea el array: ");
        int n = lector.nextInt(); 

        secienciaAritmetica(v, i, n); 
    }
    static int[] secienciaAritmetica (int v, int i, int n){
        int[] numeros = new int[n]; 

        System.out.print(v + " ");
        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = i + v; 
            v = numeros[j]; 
        }

        for (int j = 0; j < numeros.length; j++) {
            System.out.print(numeros[j] + " ");
        }
        return numeros; 
    }

}
