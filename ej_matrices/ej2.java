package ej_matrices;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Dime el nombre n" + i + 1 + ": ");
            nombres[i] = lector.nextLine(); 
        }

        System.out.println("Dime el nombre que buscas: ");
        String buscado = lector.nextLine(); 

        System.out.println(buscarNombre(nombres, buscado));
    }
    static String buscarNombre (String[] a, String buscado){
        String mensaje = ""; 
        for (int i = 0; i < a.length; i++) {
            if (a[i].equalsIgnoreCase(buscado)) {
                mensaje = "El nombre SI esta en la lista.";
                break; 
            } else {
                mensaje = "El nombre NO esta en la lista";
            }
        }
        return mensaje; 
    }

}
