package com.tictactoe;
import java.util.Scanner;


public class App {


private static int turnCount = 0;

public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_RED = "\u001B[31m";


    public static void main(String[] args){
        Welcome.printWelcomeMessage();
        System.out.println(ANSI_GREEN + "Para empezar elije una casilla, escribe el número de la fila y de la columna." + ANSI_RESET);
        Board.createBoard();
        Board.printBoard();
            Scanner scanner = new Scanner(System.in);
            boolean gameWon = false;
                while (turnCount < 9) { 
                System.out.println( "Player " + ANSI_CYAN + (Game.currentPlayer) + ANSI_RESET +": Ingresa tu movimiento (fila, tabulador, columna)");
                String turnInput = scanner.nextLine();
                boolean validMove = Game.takeTurn(Game.currentPlayer, turnInput);

                    if (validMove) {
                    turnCount++;
                        if (Game.checkRound(turnCount) == true) {
                            if (Game.checkWinner(Board.board, Game.currentPlayer)) {
                            gameWon = true;
                            break;
                            }
                        }
                    Game.changePlayer(); 
                    }
            }
                if(gameWon == false){
                System.out.println(ANSI_CYAN + "No queda espacio: ¡empate!" +  ANSI_RESET);
                }
            scanner.close();
            }
    }