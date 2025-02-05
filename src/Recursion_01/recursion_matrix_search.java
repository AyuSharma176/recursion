package Recursion_01;
import java.util.*;
public class recursion_matrix_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(pathprint(0,0,n-1,m-1,""));
    }
    public static int  pathprint(int cc,int cr,int er,int ec,String ans) {
        if(cr==er && cc==ec) {
            System.out.println(ans);
            return 1;
        }
        if(cr>er || cc>ec) {
            return 0;
        }
        int a1= pathprint(cc+1,cr,er,ec,ans+"H");
        int a2= pathprint(cc,cr+1,er,ec,ans+"V");
        return a1+a2;
    }
}
