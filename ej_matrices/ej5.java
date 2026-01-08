package ej_matrices;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        String[] palabras = pedirPalabras(); 

        
    }
    static String[] pedirPalabras () {
        Scanner lector = new Scanner(System.in);

        String[] palabras = new String[7];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Dime el nombre n" + (i + 1) + ": ");
            palabras[i] = lector.nextLine(); 
        }
        return palabras; 
    }

    static void ordenAlfabetico (String[] a){
        
    }
} 
