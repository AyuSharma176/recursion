package Divide_and_Conqueer;
import java.util.*;
public class Quick_sort {
    public static void main(String[] args) {
        int[] arr= {5,7,2,3,8,1,4};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int si, int ei) {
        if(si>=ei){
            return;
        }
        int idx= partition(arr,si,ei);
        sort(arr,si,idx-1);
        sort(arr,idx+1,ei);
    }
    public static int partition(int[] arr, int si, int ei) {
        int item = arr[ei];
        int pi = si;

        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                int ii = arr[i];
                arr[i] = arr[pi];
                arr[pi] = ii;
                pi++;

            }
        }

        int ii = arr[ei];
        arr[ei] = arr[pi];
        arr[pi] = ii;
        return pi;

    }
}
