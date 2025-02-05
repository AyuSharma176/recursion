package Recursion_01;
import java.util.*;
public class Arrays_usingrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        int i=0;
        System.out.println(firstindex(arr,i,item));
    }
    public static int firstindex(int[] arr, int i, int item) {
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==item){
            return i;
        }

        return firstindex(arr,i+1,item);
    }

}
