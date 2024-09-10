import java.util.Scanner;
//Program to print reverse of N natural numbers using recursion
public class nNaturalReverseRecursion {
    public static void recursivePrint(int n){
        if(n == 0)
            return;
        System.out.print(n+" ");
        recursivePrint(n-1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        recursivePrint(num);
    }
}
