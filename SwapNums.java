import java.util.Scanner;

public class SwapNums {
    public static int swapNums(int num1,int num2,int t){
        t = num1;
        num1 = num2;
        num2 = t;
        System.out.println(num1+" "+num2);
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int temp = 0;
        swapNums(a,b,temp);
    }
}
