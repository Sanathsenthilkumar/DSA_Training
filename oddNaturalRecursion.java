import java.util.Scanner;
//program to pint n natural odd elements using recursion
public class oddNaturalRecursion {
    public static void oddRecursivePrint(int n){
        if(n == 0)
            return;
        oddRecursivePrint(n-1);
        if(n%2!=0)
            System.out.print(n+" ");


    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        oddRecursivePrint(num);
    }
}
