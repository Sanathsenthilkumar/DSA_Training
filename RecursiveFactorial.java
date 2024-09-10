//Program to print factorial through recursion
import java.util.Scanner;

public class RecursiveFactorial {
    public static int findFactorial(int num){
        int result;
        if(num == 0 || num == 1)
            return 1;
        result = num * findFactorial(num-1);

        return result;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.print(findFactorial(num));

        scn.close();
    }
}
