package Recursion_01;
import java.util.*;
public class First_and_last_occ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        int i=0;
        System.out.println("First index is : "+firstindex(arr,i,item));
        int j=arr.length-1;
        System.out.println("Last index is : "+lastindex(arr,j,item));
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
    public static int lastindex(int[] arr, int i, int item) {
        if(i==0){
            return -1;
        }
        if(arr[i]==item){
            return i;
        }

        return lastindex(arr,i-1,item);
    }
}

