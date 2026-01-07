package Reto_3_Juegos;

import java.util.*;


public class BuscaMinas {
    static char[][] tablero = new char[8][8]; 
    static Scanner lector = new Scanner(System.in); 
    static boolean[][] visible = new boolean[8][8]; 
    public static void main(String[] args) {
        //ejecutarBuscaminas();

        char[][] minas = colocarMinas(tablero, 3); 
        inicializarTablero(minas);
        
        
        

        /*
        cada vez que encuentre una mina sumar un uno a todas las posiciones de alrededor y de esta manera deberia salir bien. 
        */
    }

    static void ejecutarBuscaminas (){ // es como el main secundario
       inicializarTablero(tablero);
    }

    //====== metodos de UI =======

    static void visible (char[][] tablero){ //ejecuta el tablero 
         for (int i = 0; i < 8; i++) {
            System.out.print(" ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j]);
                if (j < 7) System.out.print(" | ");
            }
            System.out.println();
            if (i < 7) System.out.println("---+---+---+---+---+---+---+---");
        }
    }

    static int pedirMinas (){
        int minas = 0; 

        do{
            System.out.println("Cuantas minas quieres que tenga tu juego? ");
            minas = lector.nextInt(); 

            if (minas > 8) {
                System.out.println("No puede haber mas de 8 minas");
            } else if(minas < 3) {
                System.out.println("No puede haber menos de 3 minas");
            }
        } while (minas > 8 || minas < 3); 

        return minas; 
    }

    static int pedirFila(){ // pide una fila al usuario 
        int fila; 
        System.out.print("Dime la fila en la que quieres colocar tu movimiento: ");
        fila = lector.nextInt(); 
        
        return fila; 
    }
    
    static int pedirColumna(){ // pide una columna al usuario

        int columna; 
        System.out.print("Dime la columna en la que quieres colocar tu movimiento: ");
        columna = lector.nextInt(); 

        return columna; 
    }

    // ==== metodos de logica =======
    static void inicializarTablero(char[][] tablero){// ejecutamos el tablero visible, que esta todo vacío
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = ' ';
            }
        }

        // Mostrar el tablero vacío
        visible(tablero);
    }

    static void tableroOculto(char[][] tablero){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = ' ';
            }
        }

        // Mostrar el tablero vacío
        visible(tablero);
    }

    static boolean esJugadaValida(char[][] tablero, int fila, int col){// comprueba que la jugada sea valida, es decir que esté vacío y que este en el 3x3
        
        if (tablero[fila][col] == ' ' && (fila >= 0 && fila < 8) && (col >= 0 && col < 8)) {
            return true; 
        } else{
            System.out.println("La jugada no es valida, intentalo de nuevo.");
        }
        

        return false; 
    } 

    static char[][] colocarMinas (char[][] tableroOculto, int minas){
        
        
        for (int i = 0; i < minas; i++) {
            int random = (int) ((Math.random()*8)); 
            tableroOculto[random][random] = '*';     
        }
        return tableroOculto; 
    }

}