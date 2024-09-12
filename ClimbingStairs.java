import java.util.Scanner;
/*
 You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
//TL - O(2^n) - exponential complexity.
public class ClimbingStairs {
    public static int climbingStairs(int n){
        if(n==0 || n==1)
            return 1;
        //base condition for obstacle;
        /*if(n%3 == 0)
            return 0;*/

        return climbingStairs(n-1)+climbingStairs(n-2);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int res = climbingStairs(num);
        System.out.println(res);
    }
}
