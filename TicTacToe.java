import java.util.Scanner;

public class TicTacToe {

private static char[][] board = new char [3][3];
private static char currentPlayer = 'X';
private static int turnCount = 0;

    public static void main(String[] args){
        System.out.println("Bienvenide al juego Tic Tac Toe. Para empezar a jugar, elije una casilla, escribe el número de la fila y de la columna. Dale a enter para empezar");
        createBoard();
        printBoard();
        
     
        Scanner scanner = new Scanner(System.in);
            while (turnCount < 9) { 
                System.out.println("Player " + (currentPlayer) + ": Ingresa tu movimiento (fila, tabulador, columna)");
                String turnInput = scanner.nextLine();
                takeTurn(currentPlayer, turnInput);
                
                turnCount++;
                if (checkRound (turnCount) == true) {
                    System.out.println("Han pasado " + turnCount + " movimientos");
                    checkWinner(board, currentPlayer);  
                } 
                changePlayer();
                // if (isBoardFull()) {
                //     System.out.println("¡Empate! No quedan espacios disponibles.");
                //     break;
               

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
            System.out.println("Movimiento inválido. Ingresar número de 0 a 2");
            return false;
    } else {
        if (board[row][column] == '_' ) {
            board[row][column] = currentPlayer;
            printBoard();
            //changePlayer();
            return true;
        } else {
            System.out.println("Espacio ocupado");
            return false;
        }
    }
    }

    private static boolean checkRound(int turnCount){
        if(turnCount >= 5){
        System.out.println("Valoramos");
        return true;
        }
        else{
        return false;
        }
        //luego: línea de 3
    }

    private static boolean checkWinner(char[][] board, char currentPlayer ){
      for (int i = 0; i < 3; i++){
        if(board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer){
        System.out.println("Fila ganada " +  currentPlayer);
        return true; 
        } else {
        System.out.println("Nadie gana");
        }
    }
        return false;
    }
   //checkWinner
    //fila 0
    //si: hay un _ en la fila, 
    //no hace falta pasar al próximo paso (break)
    //si no hay, pasa a comprobar si hay 3x currentPlayer en la fila
    //si no hay ganador, pasa a la fila 1
    
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


    public static void takeTurn(char currentPlayer, String turnInput){
            String[] turnsInput = turnInput.split("\t");
            int row = Integer.parseInt(turnsInput[0]);    
            int column = Integer.parseInt(turnsInput[1]); 
        System.out.println("Tu respuesta es " + row + " y " + column);
            validMovement(row, column, currentPlayer);
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