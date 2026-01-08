package ej_matrices;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);        

        String[] nombres = pedirNombres(); 

        System.out.println("Nombre mas corto: " + nombreCorto(nombres));
        System.out.println("Nombre mas largo: " + nombreLargo(nombres));

    }

    static String[] pedirNombres () {
        Scanner lector = new Scanner(System.in);

        String[] nombres = new String[6];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Dime el nombre n" + (i + 1) + ": ");
            nombres[i] = lector.nextLine(); 
        }
        return nombres; 
    }

    static String nombreCorto(String[] a){
        String corta = a[0]; 
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() < corta.length()) {
                corta = a[i]; 
            }
        }
        return corta; 
    }

    static String nombreLargo(String[] a){
        String larga = a[0]; 
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > larga.length()) {
                larga = a[i]; 
            }
        }
        return larga; 
    }
}
