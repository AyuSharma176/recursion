package Backtracking_01;

import java.util.Scanner;

public class Coin_combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfCoin = sc.nextInt();
        int[] coins = new int[noOfCoin];
        for (int i = 0; i < noOfCoin; i++) {
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        printans(coins,amount,"",0);
    }
    public static void printans(int[] coins, int amount, String ans,int idx) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < coins.length; i++) {
            if (coins[i] <= amount) {
                printans(coins, amount - coins[i], ans + coins[i],i);
            }
        }
    }
}
