import java.util.Scanner;

public class TicTacToe{

private static char[][] board = new char [3][3];
private static char currentPlayer = 'X';

    public static void main(String[] args){
        System.out.println("Bienvenide al juego Tic Tac Toe. Para empezar a jugar, elije una casilla, escribe el número de la fila y de la columna. Dale a enter para empezar");
        createBoard();
        printBoard();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Haz tu primer movimiento: Elije la posición de fila, teclea el tabulador, y luego, elije la posición de columna");
        String turn1 = scanner.nextLine();
    
        String[] turns1 = turn1.split("\t");
        int row = Integer.parseInt(turns1[0]);    
        int column = Integer.parseInt(turns1[1]); 
   
        System.out.println("Tu respuesta es " + row + " y " + column);
        board[row][column] = currentPlayer;
        printBoard();
        scanner.close();
    }

    private static void createBoard(){
        for (int row = 0; row < 3; row++){
            for (int column = 0; column < 3; column++){
                board[row][column] = '_';
            }
        }
    }

    private static void printBoard(){
        System.out.println("\n");
        for (int row = 0; row < 3; row++) {
            System.out.print(" ");
            for (int column = 0; column < 3; column++) {
                System.out.print(board[row][column]  + " ");
            }
            System.out.println();
            System.out.println("\n");
        }
    }
}

//Declarar la matriz (tablero) OK

// Creamos el tablero y imprimimos OK

// Crear guion bajo tablero OK

// Crear un mensaje de normas. Imprimir este mensaje al iniciar el juego. Ok

// Crear la función de ganar. 

// Crear función de empate despues de 9 turnos

// Crear el scanner para recopilar el turno de x OK

// Comprobar si lo que pide x está correcto. Mensaje de error. Ejemplo: Poner x fuera del juego y verificar si el espacio ya está ocupado. 

// Imprimir X en el lugar que tiene que estar en el tablero

// Comprobar con el condicional si el jugador ha ganado

// Si no, rotar turno a O 

// Comprobar si lo que pide 0 está correcto. Mensaje de error: Poner 0 fuera del juego y verificar si el espacio ya está ocupado.

 // Imprimir 0 en el lugar que tiene que estar en el tablero

// Comprobar con el condicional si el jugador ha ganado

// Despues de 9 turnos, llamar la función de empate. 