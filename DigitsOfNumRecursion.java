import java.util.Scanner;
//Program to print the digits of a number in reverse using recursion
public class DigitsOfNumRecursion {
    public static void digitRecursion(int n){
        if(n == 0)
            return;
        System.out.print(n%10+" ");
        digitRecursion(n/10);

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        digitRecursion(num);
    }
}
