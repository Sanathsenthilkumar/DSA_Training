import java.util.Scanner;
//program to multiply 2 numbers through recursion
public class MultiplyRecursively {
    public static int Multiply(int a,int b){
        if(b == 0)
            return 0;
        if(b==1)
            return a;
        return a+Multiply(a,b-1);
    }
    public static void multiplyRecursively(int a, int b){

        int res = Multiply(a,b);
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        multiplyRecursively(num1,num2);
    }
}
