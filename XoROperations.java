import java.util.Scanner;

public class XoROperations {
    public static int xOrOperations(int num1, int num2,int num3){
        return num1^num2^num3;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        //while performing multiple Xor operation with many numbers the same numbers gets cancelled out
        System.out.println(xOrOperations(a,b,c));

    }
}
