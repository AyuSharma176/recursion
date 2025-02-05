package Recursion_01;
import java.util.*;
public class Lexico_counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1000;
        printcounting(0,n);
    }
    public static void printcounting(int curr, int n) {
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            printcounting(curr*10+i,n);
        }
    }
}
