package com.tictactoe;
public class Board {

    public static char[][] board = new char [3][3];

    public static void createBoard(){
        for (int row = 0; row < 3; row++){
            for (int column = 0; column < 3; column++){
                board[row][column] = '_';
            }
        }
    }
    
    public static void printBoard(){
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