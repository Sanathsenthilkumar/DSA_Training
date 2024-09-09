import java.util.*;
//Program to find Maximum Contiguous Sub-array Sum
public class MaxSubArraySum {
    public static int subArraySum(int[] arr, int s){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<s;i++){
            for(int j=i;j<s;j++){
                int SubArraysum = 0;
                for(int k=i;k<=j;k++)
                    SubArraysum+=arr[k];
                maxSum = Math.max(maxSum,SubArraysum);
                System.out.println(SubArraysum+" ");
            }
            System.out.print("");
        }
        System.out.println("The max contiguous sum is: "+maxSum);
        return 0;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        subArraySum(arr,size);
        scn.close();
    }
}
