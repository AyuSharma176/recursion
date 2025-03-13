
package Divide_and_Conqueer;
import java.util.*;
public class Merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        arr=sort(arr, 0, N - 1);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] sort(int[] arr, int st, int ed) {
        if(st == ed){
            int[] bs = new int[1];
            bs[0] = arr[st];
            return bs;
        }
        int mid = (st + ed) / 2;
        int[] left = sort(arr,st,mid);
        int[] right = sort(arr,mid+1,ed);
        return MergeTwoArray(left,right);
    }
    public static int[] MergeTwoArray(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                ans[k] = arr2[j];
                j++;
                k++;
            } else {
                ans[k] = arr1[i];
                i++;
                k++;
            }
        }

        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;

    }

}
