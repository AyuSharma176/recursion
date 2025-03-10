package Backtracking_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queen_combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tq = scanner.nextInt();
        boolean[] board = new boolean[n];
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        printans(board, tq, 0, list, ll, 0);
        System.out.println(list);
    }

    public static void printans(boolean[] board, int tq, int qpsf, List<List<Integer>> list, List<Integer> ll, int idx) {
        if (tq == qpsf) {
            list.add(new ArrayList<>(ll)); // Add a copy of the list
            return;
        }

        for (int i = idx; i < board.length; i++) {
            if (!board[i]) {
                board[i] = true;
                ll.add(i+1);  // Add queen's position only
                printans(board, tq, qpsf + 1, list, ll, i + 1);
                board[i] = false; // Backtrack for the board
                ll.remove(ll.size() - 1); // Backtrack for the list
            }
        }
    }
}
