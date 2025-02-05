package Recursion_01;

import java.util.Scanner;

public class Cointoss_two_conse_head {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printans(n,"");
    }
    public static void printans(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        if(ans.isEmpty() || ans.charAt(ans.length()-1)!='H'){
            printans(n-1, ans+"H");
        }
        printans(n-1, ans+"T");
    }

}
