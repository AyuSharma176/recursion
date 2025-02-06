package Backtracking_01;

import java.util.Scanner;

public class Queen_combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tq = scanner.nextInt();
        boolean[] board = new boolean[n];
        printans(board,tq,0,"",0);
    }
    public static void printans(boolean[] board, int tq, int qpsf, String ans,int idx) {
        if (tq == qpsf) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if (board[i]==false) {
                board[i]=true;
                printans(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
                board[i]=false;
            }
        }
    }
}
