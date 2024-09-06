import java.util.*;
public class OddIndexSum {
    static int printOddPosSum(int[] arr,int s){
        int sum = 0;
        for(int i=1;i<s;i+=2)
            sum+=arr[i];
        return sum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        System.out.println("sum of the elements in odd indices of the array is: "+printOddPosSum(arr,size));
    }
}
