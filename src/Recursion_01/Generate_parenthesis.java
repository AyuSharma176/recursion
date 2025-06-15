package Recursion_01;
import java.util.*;
public class Generate_parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<String> res = new ArrayList<>();
        System.out.println(generateParenthesis(n,0,0,"",res));
    }
    public static List<String> generateParenthesis(int n,int open,int close, String ans, List<String> res) {

        if(open==n && close==n){
            res.add(ans);
        }
        if(open<n){
            generateParenthesis(n,open+1,close,ans+"(",res);
        }
        if(close<open){
            generateParenthesis(n,open,close+1,ans+")",res);
        }
        return res;
    }
}
