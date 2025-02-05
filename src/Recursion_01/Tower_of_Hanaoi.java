package Recursion_01;
import java.util.*;
public class Tower_of_Hanaoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        toh(n,"A","B","C");
    }
    public static void toh(int n, String src, String hlp, String des) {
        if(n==0){
            return;
        }
        toh(n-1, src, des, hlp);
        System.out.println("Move " + n +" from " +src +" to "+des);
        toh(n-1,hlp,src,des);
    }
}
