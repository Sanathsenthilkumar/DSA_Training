import java.util.Scanner;
//program to find if a number is even or odd using Bitwise operator - (&)
public class OddOrEvenBitwiseOp {
    public static boolean evenOrOdd(int n){
        if((n&1) != 0)
            return false;
        return true;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean res = evenOrOdd(num);
        System.out.println(res);
    }
}
