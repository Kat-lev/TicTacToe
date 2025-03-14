import java.util.Scanner;


public class TicTacToe {

private static char[][] board = new char [3][3];
private static char currentPlayer = 'X';
private static int turnCount = 0;
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_CYAN = "\u001B[36m";



    public static void main(String[] args){
        TicTacToeWelcome.printWelcomeMessage();
        System.out.println(ANSI_PURPLE + "Para empezar a jugar, elige una casilla para tu movimiento. \nEscribe el número de la fila, presiona la tecla de tabulación y luego ingresa el número de la columna. \nLos números van del 0 al 2." + ANSI_RESET);
        createBoard();
        printBoard();
            Scanner scanner = new Scanner(System.in);
            boolean gameWon = false;
                while (turnCount < 9) { 
                System.out.println("¡Player " + ANSI_CYAN + (currentPlayer) + ANSI_RESET +", te toca! " + ANSI_CYAN + "Ingresa tu movimiento (fila, tabulador, columna)." + ANSI_RESET);
                String turnInput = scanner.nextLine();
                boolean validMove = takeTurn(currentPlayer, turnInput);

                    if (validMove) {
                    turnCount++;
                        if (checkRound(turnCount) == true) {
                        System.out.println("Han pasado " + turnCount + " movimientos");
                            if (checkWinner(board, currentPlayer)) {
                            gameWon = true;
                            break;
                            }
                        }
                    changePlayer(); 
                    }
            }
                if(gameWon == false){
                System.out.println(ANSI_CYAN + "No queda espacio en el tablero: ¡es un empate!" + ANSI_RESET);
                }
            scanner.close();
    }

    
    private static void createBoard(){
        for (int row = 0; row < 3; row++){
            for (int column = 0; column < 3; column++){
                board[row][column] = '_';
            }
        }
    }

    private static void changePlayer(){
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    private static boolean validMovement (int row, int column, char currentPlayer){
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            System.out.println(ANSI_RED + "Movimiento inválido. Elige números de 0 a 2" +  ANSI_RESET);
            return false;
    } else {
        if (board[row][column] == '_' ) {
            board[row][column] = currentPlayer;
            printBoard();
            return true;
        } else {
            System.out.println(ANSI_RED+ "Espacio ocupado"+ ANSI_RESET);
            return false;
        }
    }
    }

    private static boolean checkRound(int turnCount){
        if(turnCount >= 5){
        // System.out.println("Valoramos");
        return true;
        }
        else{
        return false;
        }
    }

    private static boolean checkWinner(char[][] board, char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                System.out.println(ANSI_PURPLE +"¡Gana player " + currentPlayer + "! ¡Felicidades!"+ ANSI_RESET);
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                System.out.println(ANSI_PURPLE +"¡Gana player " + currentPlayer + "! ¡Felicidades!"+ ANSI_RESET);
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            System.out.println(ANSI_PURPLE +"¡Gana player " + currentPlayer + "! ¡Felicidades!"+ ANSI_RESET);
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            System.out.println(ANSI_PURPLE +"¡Gana player " + currentPlayer + "! ¡Felicidades!"+ ANSI_RESET);
            return true;
        }
        System.out.println("Nadie ha ganado aún.");
        return false;
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

    public static boolean takeTurn(char currentPlayer, String turnInput) {
        String[] turnsInput = turnInput.split("\t");
            int row = Integer.parseInt(turnsInput[0]); 
            int column = Integer.parseInt(turnsInput[1]); 
        // System.out.println("Tu respuesta es " + row + " y " + column);
        return validMovement(row, column, currentPlayer);
        }
}



//Declarar la matriz (tablero) OK

// Creamos el tablero y imprimimos OK

// Crear guion bajo tablero OK

// Crear un mensaje de normas. Imprimir este mensaje al iniciar el juego. Ok

// Crear la función de ganar. 

// Crear función de empate despues de 9 turnos

// Crear el scanner para recopilar el turno de x OK

// Comprobar si lo que pide x está correcto. Mensaje de error. Ejemplo: Poner x fuera del juego y verificar si el espacio ya está ocupado. OK

// Imprimir X en el lugar que tiene que estar en el tablero

// Comprobar con el condicional si el jugador ha ganado

// Si no, rotar turno a O 

// Comprobar si lo que pide 0 está correcto. Mensaje de error: Poner 0 fuera del juego y verificar si el espacio ya está ocupado.

 // Imprimir 0 en el lugar que tiene que estar en el tablero

// Comprobar con el condicional si el jugador ha ganado

// Despues de 9 turnos, llamar la función de empate. 