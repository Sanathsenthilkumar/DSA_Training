import java.util.Scanner;
//Program to find the median of an array
public class MedianInSortedArray {
    public static double findMedian(int[] nums){
        int n = nums.length;
        if(nums.length % 2 != 0)
            return nums[n/2];
        else
            return (nums[(n - 1) / 2] + nums[n / 2]) / 2.0;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        System.out.println(findMedian(arr));
    }
}
