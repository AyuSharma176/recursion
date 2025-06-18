import java.util.*;
public class Recursion_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s=sc.next();
//        System.out.println("\n"+subsequence(s,""));
//        int n=sc.nextInt();
//        System.out.println(toss(n,""));
//        int n = sc.nextInt();
//        dice_roll(n, 0, "");
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        gen_para(n,0,0,"",list);
        System.out.println(list);
    }
//    public static int subsequence(String s , String ans){
//        if(s.isEmpty()){
//            System.out.print(ans+" ");
//            return 1;
//        }
//        char ch=s.charAt(0);
//        int d1=subsequence(s.substring(1),ans);
//        int d2=subsequence(s.substring(1),ans+ch);
//        return d1+d2;
//    }
//    public static int toss(int n,String ans){
//        if(n==0){
//            System.out.print(ans+" ");
//            return 1;
//        }
//        int d1= toss(n-1,ans+"H");
//        int d2= toss(n-1,ans+"T");
//        return d1+d2;
//}
//    public static void dice_roll(int n,int curr,String ans){
//        if(curr==n){
//            System.out.println(ans);
//            return;
//        }
//        if(curr>n){
//            return;
//        }
//        for(int i=1;i<=6;i++){
//            dice_roll(n,curr+i,ans+i);
//        }
//    }
    public static void gen_para(int n,int op,int cl,String ans,List<String> list){
        if(op==n && cl==n){
            list.add(ans);
            return;
        }
        if(op<n){
            gen_para(n,op+1,cl,ans+"(",list);
        }
        if(cl<op){
            gen_para(n,op,cl+1,ans+")",list);
        }
    }


}
