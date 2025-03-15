public class Game {
    
    public static char currentPlayer = 'X';


    public static void changePlayer(){
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public static boolean checkRound(int turnCount){
        if(turnCount >= 5){
        return true;
        }
        else{
        return false;
        }
    }

    public static boolean takeTurn(char currentPlayer, String turnInput) {
        if (!turnInput.matches("^[0-2]\t[0-2]$")) {
            System.out.println(TicTacToe.ANSI_RED + "Por favor ingresa dos números (0-2) separados por tabulador" + TicTacToe.ANSI_RESET);
            return false;
        }

        String[] turnsInput = turnInput.split("\t");
        int row = Integer.parseInt(turnsInput[0]); 
        int column = Integer.parseInt(turnsInput[1]); 
        return validMovement(row, column, currentPlayer);
    }
    

    public static boolean validMovement (int row, int column, char currentPlayer){
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            System.out.println(TicTacToe.ANSI_RED + "Movimiento inválido. Elige números de 0 a 2" +  TicTacToe.ANSI_RESET);
            return false;
        } else {
        if (Board.board[row][column] == '_' ) {
            Board.board[row][column] = currentPlayer;
            Board.printBoard();
            return true;
        } else {
            System.out.println(TicTacToe.ANSI_RED+ "Espacio ocupado"+ TicTacToe.ANSI_RESET);
            return false;
        }
     }
    } 
    
    public static boolean checkWinner(char[][] board, char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                System.out.println(TicTacToe.ANSI_PURPLE +"¡Gana player " + currentPlayer + "! ¡Felicidades!"+ TicTacToe.ANSI_RESET);
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                System.out.println(TicTacToe.ANSI_PURPLE +"¡Gana player " + currentPlayer + "! ¡Felicidades!"+ TicTacToe.ANSI_RESET);
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            System.out.println(TicTacToe.ANSI_PURPLE +"¡Gana player " + currentPlayer + "! ¡Felicidades!"+ TicTacToe.ANSI_RESET);
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            System.out.println(TicTacToe.ANSI_PURPLE +"¡Gana player " + currentPlayer + "! ¡Felicidades!"+ TicTacToe.ANSI_RESET);
            return true;
        }
        System.out.println("Nadie ha ganado aún.");
        return false;
    }
}
