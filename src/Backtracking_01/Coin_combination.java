package Backtracking_01;

import java.util.*;

public class Coin_combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfCoin = sc.nextInt();
        int[] coins = new int[noOfCoin];
        for (int i = 0; i < noOfCoin; i++) {
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        printans(coins,amount,ll,list,0);
        System.out.println(list);
    }
    public static void printans(int[] coins, int amount, List<Integer> list,List<List<Integer>> ans,int idx) {
        if (amount == 0) {
            ans.add(new ArrayList<>(list));
            System.out.println(list);
            return;
        }
        for (int i = idx; i < coins.length; i++) {
            if (coins[i] <= amount) {
                list.add(coins[i]);
                printans(coins, amount - coins[i], list,ans,i);
                list.remove(list.size()-1);
            }
        }
    }
}
