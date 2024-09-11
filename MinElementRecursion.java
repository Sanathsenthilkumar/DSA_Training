import java.util.Scanner;

public class MinElementRecursion {
//program to print the smallest element in an array using recursion
    public static int minElementRecursion(int[] nums,int len){
        if(len>0)
            return Math.min(nums[len-1],minElementRecursion(nums,len-1));
        return nums[0];
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        int res = minElementRecursion(arr,size);
        System.out.println(res);
    }
}
