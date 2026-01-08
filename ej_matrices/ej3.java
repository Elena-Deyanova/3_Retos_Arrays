package ej_matrices;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String[] nombres = pedirNombres(); 

        System.out.println("Dime una letra y te mostrare los que empiezan por la misma: ");
        String letra = lector.nextLine(); 

        System.out.println("Hay " + cuantosEmpiezan(nombres, letra) + " nombres que empiezan por la letra " + (letra.toUpperCase()));
    }
    static String[] pedirNombres () {
        Scanner lector = new Scanner(System.in);

        String[] nombres = new String[8];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Dime el nombre n" + (i + 1) + ": ");
            nombres[i] = lector.nextLine(); 
        }
        return nombres; 
    }

    static int cuantosEmpiezan (String[]a , String letra){
        int contador = 0; 
        for (int i = 0; i < a.length; i++) {
            if (a[i].toLowerCase().startsWith(letra.toLowerCase())) {
                contador++; 
            }
        }
        return contador; 
    }
}
