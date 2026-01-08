package ej_matrices;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        String[] palabras = pedirPalabras(); 

        ordenAlfabetico(palabras);

        
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
        int resultado; 
        int contador = 0;
        for (int i = 0; i < a.length - 1; i++) {
            resultado = a[i].compareToIgnoreCase(a[i+ 1]); 
            if (resultado < 0 ) {
                contador++; 
            } else{
                contador = 0; 
                break; 
            }
        }
        if (contador > 0 ) {
            System.out.println("Las palabras siguen el orden aflabetico");
        } else{
            System.out.println("Las palabras NO estan en orden alfabetico");
        }
            
    }
} 
