package Recursion_01;
import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        permutation(s,"");
    }
    public static void permutation(String s,String ans) {
        if(s.isEmpty()) {
            System.out.println(ans);
            return;
        }
       for (int i = 0; i < s.length(); i++) {
           char ch=s.charAt(i);
           String s1 = s.substring(0, i);
           String s2 = s.substring(i+1);
           permutation(s1+s2,ans+ch);
       }
    }
}
