package Backtracking_01;

import java.util.Scanner;

public class N_Queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int tq=n;
        boolean[][] board= new boolean[n][n];
        queen(board,tq,0);
    }
    public static void queen(boolean[][] board, int tq, int row) {
        if(tq==0){
            display(board);
            return;
        }
        for(int c=0;c<board[0].length;c++){
            if(isItSafeToPlaceTheQueen(board,row,c)){
                board[row][c]=true;
                queen(board,tq-1,row+1);
                board[row][c]=false;
            }
        }
    }
    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {
        int r, c;

        // Check vertical column
        r = row;
        while (r >= 0) {
            if (board[r][col]) {
                return false;
            }
            r--;
        }

        // Check upper-left diagonal
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        // Check upper-right diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }

    public static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*************************************************************");
    }
}
