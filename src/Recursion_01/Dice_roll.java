package Recursion_01;
import java.util.*;
public class Dice_roll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        rollDice(n,0,"");
    }
    public static void rollDice(int n, int curr, String str) {
        if(curr==n){
            System.out.println(str);
            return;
        }
        if(curr>n){
            return;
        }
        for(int dice=1;dice<=6;dice++){
            rollDice(n,curr+dice,str+dice);
        }
    }
}
