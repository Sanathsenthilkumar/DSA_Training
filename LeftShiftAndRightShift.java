import java.util.Scanner;
//Programs to print the left shift and right shit or an input
public class LeftShiftAndRightShift {
    public static int rightShift(int a, int b){
        return a>>b;
    }
    public static int leftShift(int a, int b){
        return a<<b;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int lShift = leftShift(num1,num2);
        System.out.println(lShift);
        int rShift = rightShift(num1,num2);
        System.out.println(rShift);
    }
}
