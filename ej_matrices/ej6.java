package ej_matrices;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {

        String[] palabras = { "java","codigo","clase","examen","java","string","metodo","clase","array","java"}; 

        palabrasRepetidas(palabras);
        
    }
    static String[] pedirPalabras () {
        Scanner lector = new Scanner(System.in);

        String[] palabras = new String[10];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Dime el nombre n" + (i + 1) + ": ");
            palabras[i] = lector.nextLine(); 
        }
        return palabras; 
    }

    static void palabrasRepetidas ( String[] a){
        String[] repetidas = new String[a.length]; //aqui se guardan las que ya estan repetidas
        int contador = 0;  //posicion en la que guardar la siguiente palabra repetida

        for (int i = 0; i < a.length; i++) { //a[i] es la palabra que estamos analizando ahora
            boolean repetida = false;  // variable para saber si ya la tenemos guardada
            for (int j = 0; j < contador; j++) { // recorre solo las palabras repetidas que ya hemos guardado
                if (a[i].equals(repetidas[j])) { // si la palabra actual ya esta en repetidos la marcamos como true y rompemos el bucle
                    repetida = true; 
                    break; 
                }
            }
            if (repetida) { // si ya esta guardada no la volemos a buscar
                continue; 
            }

            for (int j = i + 1; j < a.length; j++) { //segundo bucle, comparamos la palabra actual con las que vienen detras
                if (a[i].equals(a[j])) { // si encontramos otra igual es que está repetida
                repetidas[contador] = a[i]; // guardamos la palabra repetida en el array
                contador++;
                break; // salimos del bucle j por que ya tenemos la palabra repetida
            }
            }
        }
        if (contador > 0) { // si tenemos almenos una palabra repetida
        System.out.println("Sí hay palabras repetidas."); // printamos que si que hay repetidas 
        System.out.print("Palabras repetidas: ");
        for (int i = 0; i < contador; i++) { // y aqui printamos las repetidas, y usamos el contador para que no printe mas de las que ya tenemos 
            System.out.print(repetidas[i]);
            if (i < contador - 1) { // si hay mas de uno printamos una coma, para que se separen visualmente
                System.out.print(", ");
            }
        }
        System.out.println();
    } else {
        System.out.println("No hay palabras repetidas."); // si no hay ninguna repetida, printamos que no hay repetidas. 
    }
        
    }
}
