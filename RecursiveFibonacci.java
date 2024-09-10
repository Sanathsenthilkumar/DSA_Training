import java.util.Scanner;
//Fibonacci series using recursion
public class RecursiveFibonacci {
    public static int findFibo(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return findFibo(n-1)+findFibo(n-2);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.print(findFibo(num));

        scn.close();
    }
}
