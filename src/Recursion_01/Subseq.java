package Recursion_01;

import java.util.*;

public class Subseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcdef";
        System.out.println("\n"+printsubseq(str,""));
    }
    public static int  printsubseq(String str, String ans){
        if(str.isEmpty()){
            System.out.print(ans+" ");
            return 1;
        }
        char ch= str.charAt(0);
        int a1 = printsubseq(str.substring(1),ans);
        int a2=printsubseq(str.substring(1),ans+ch);
        return a1+a2;
    }
}
