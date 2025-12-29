package Reto_3_Juegos;

public class Tres_En_Raya {
    static char[][] tablero = new char[3][3]; 
    public static void main(String[] args) {
        ejecutarTresEnRaya();


    }

    // metodos de pantalla / teclado

    static void ejecutarTresEnRaya(){// metodo que se usará como un main, pero sin serlo, de esta manera el main quedara más limpio
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        // Mostrar el tablero vacío
        mostrarTablero(tablero);

    } 
    static void mostrarTablero(char[][] tablero){// metodo que printa el tablero
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    } 
    /*
    static int pedirFila(){ // pide una fila al usuario 

    }
    static int pedirColumna(){ // pide una columna al usuario

    }
    static void mostrarMensaje(String msg){// muestra mensaje  ¿?

    } 

    // metodos de logica

    static void inicializarTablero(char[][] tablero){// inicia el tablero todo vacío 

    } 
    static boolean esJugadaValida(char[][] tablero, int fila, int col){// comprueba que la jugada sea valida, es decir que esté vacío y que este en el 3x3

    } 
    static void colocarFicha(char[][] tablero, int fila, int col, char jugador){// Si la jugada es válida coloca la ficha en el lugar que se ha indicado

    } 
    static boolean hayGanador(char[][] tablero, char jugador){// Comprueba que haya ganador

    } 
    static boolean tableroLleno(char[][] tablero){// Comprueba y avisa si el tablero esta lleno

    } 
    static char cambiarTurno(char jugador){// cambia el turno de X a O 

    } 

    // metodos auxiliares

    static boolean ganaPorFilas(char[][] tablero, char jugador){ // comprueba si se gana por filas 

    }
    static boolean ganaPorColumnas(char[][] tablero, char jugador){// Comprueba si se gana por columnas 

    } 
    static boolean ganaPorDiagonales(char[][] tablero, char jugador){ // comprueba si se gana por diagonales

    }*/

    
}
