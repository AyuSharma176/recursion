package Recursion_01;
import java.util.*;
public class subseq_using_list {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<Integer> num=new ArrayList<>();
            for(int i: nums){
                num.add(i);
            }
            List<List<Integer>> ans= new ArrayList<>();
            print(num,new ArrayList<>(),ans);
            return ans;

        }
        public void print(List<Integer> num, List<Integer> s, List<List<Integer>> ans) {
            if (num.isEmpty()) {
                ans.add(new ArrayList<>(s));
                return;
            }

            int num1 = num.get(0);
            List<Integer> remaining = new ArrayList<>(num.subList(1, num.size()));
            print(remaining, new ArrayList<>(s), ans);
            List<Integer> sWithNum = new ArrayList<>(s);
            sWithNum.add(num1);
            print(remaining, sWithNum, ans);
        }

    }
}
