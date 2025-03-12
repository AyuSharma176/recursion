package Backtracking_01;

import java.util.Scanner;

public class Rat_Chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] res = new int[n][m];
        ratinmaze(maze,0,0,res);
        if(!f){
            System.out.println("NO PATH FOUND");
        }
    }
    static Boolean f=false;
    public static void ratinmaze(char[][] maze,int cr,int cc,int[][] ans) {
        if(cr == maze.length-1 && cc == maze[0].length-1 && maze[cr][cc] != 'X') {
            ans[cr][cc] = 1;
            f=true;
            display(ans);
            return;
        }
        if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc]=='X') {
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        int[] r= {0,0,-1,1};
        int[] c= {-1,1,0,0};       // ye issliye kiya h jisse humme bar bar call n lgani pade
        for(int i=0; i<r.length; i++){
            ratinmaze(maze,cr+r[i],cc+c[i],ans);    // aur agr dhyan se dekhe toh humnen cr aur cc ki value likhi
        }                                                  // h jese pehle call me cr=0 cc=-1
//        ratinmaze(maze,cr,cc-1,ans);//left
//        ratinmaze(maze,cr,cc+1,ans);//right
//        ratinmaze(maze,cr-1,cc,ans);//up
//        ratinmaze(maze,cr+1,cc,ans);//down
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }
    public static void display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");

            }
            System.out.println();
        }
    }
}
