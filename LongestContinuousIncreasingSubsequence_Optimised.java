import java.util.Scanner;
//Optimised program to find the longest continuous subsequence in an array
public class LongestContinuousIncreasingSubsequence_Optimised {
    public static int maxIncreasingSubsequence(int[] nums){
        int len = 1;
        int maxLen = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                len++;
                maxLen = Math.max(maxLen,len);
            }
            else{
                len = 1;
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        int res = maxIncreasingSubsequence(arr);
        System.out.println(res);
    }
}
