public class ej10 {
    public static void main(String[] args) {
        int[] numeros = new int [10]; 
        int[] copia = new int[10]; 

        

        for (int i = 0; i < numeros.length; i++) {
            int random = (int) ((Math.random()* 50) + 1); 
            numeros[i] = random; 
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print( numeros[i] + " ");
        }

        for (int i = 0; i < copia.length; i++) {
            int j = i; 
            copia[i] = numeros[j]; 
        }

        System.out.println();
        for (int i = 0; i < copia.length; i++) {
            System.out.print( copia[i] + " ");
        }
        
    }
}
