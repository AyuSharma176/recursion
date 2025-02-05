package Recursion_01;

import java.util.Scanner;

public class Cointoss_subseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("\n"+toss(n,""));
    }
    public static int  toss(int n, String ans) {
        if(n==0){
            System.out.println(ans);
            return 1;
        }
        int a1=toss(n-1, ans+"H");
        int a2=toss(n-1, ans +"T");
        return a1+a2;
    }
}
