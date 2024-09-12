import java.util.Scanner;
//Program to find the longest continuous subsequence in an array
public class LongestContinuousIncreasingSubsequence {
    public static boolean isSorted(int[] nums,int a,int b){
        for(int x=a;x<b;x++){
            if(nums[x] > nums[x+1])
                return false;
        }
        return true;
    }
    public static int maxIncreasingSubArray(int[] arr){
        int n = arr.length;
        int maxLen = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isSorted(arr,i,j)){
                    int len = j-i+1;
                    maxLen=Math.max(maxLen,len);
                }
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
        int res = maxIncreasingSubArray(arr);
        System.out.println(res);
    }
}
