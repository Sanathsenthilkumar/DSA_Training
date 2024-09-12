import java.util.Scanner;
/*
 You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
public class ClimbingStairs_Optimised {
    public static int climbingStairs(int n){
        int a = 0,b=1;
        for(int i=0;i<n;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int res = climbingStairs(num);
        System.out.println(res);
    }
}
