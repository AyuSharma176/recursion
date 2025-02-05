package Recursion_01;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
//        int ans =1;
//        System.out.println(fact(n));
//        int x= sc.nextInt();
        System.out.println(power(x,n));
//        PI(n);
//        pi(n);

    }
//    public static int fact(int n) {
//        if(n==0) {
//            return 1;
//        }
//            int fn=fact(n-1);
//            return n*fn;
//    }
    public static double power(double x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
//    public static void PI(int n){
//        if(n == 0){
//            return;
//        }
//        PI(n-1);
//        System.out.println(n);
//    }
//public static int fact(int n,int ans) {
//        if(n==0) {
//            return ans;
//        }
//            return fact(n-1,ans*n);
//}
//    public static void pi(int n) {
//        if (n == 0) {
//            return;
//        }
//        pi(n - 1);
//        System.out.println(n);

//    }
}
