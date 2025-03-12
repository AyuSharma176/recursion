package Backtracking_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pallindrome_partitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ques=sc.next();
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        partitioning(ques,list,res);
        System.out.println(res);
    }
    public static void partitioning(String ques, List<String> list, List<List<String>> res){

        if(ques.isEmpty()){
            res.add(new ArrayList<>(list));
        }
        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            if(ispalindrome(s)) {
                list.add(s);
                partitioning(ques.substring(i), list, res);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean ispalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
