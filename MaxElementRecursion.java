import java.util.Scanner;
//Program to print the greatest element in  an array using recursion.
public class MaxElementRecursion {
    public static int maxElementRecursion(int[] nums,int len){
        if(len>0)
            return Math.max(nums[len-1],maxElementRecursion(nums,len-1));
        return nums[0];
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        int res = maxElementRecursion(arr,size);
        System.out.println(res);
    }
}
