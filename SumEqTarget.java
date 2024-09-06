//Sum of 2 elements in equal to target

import java.util.Arrays;
import java.util.Scanner;

public class SumEqTarget {
    //Brute force approach - Time Complexity O(n^2)
  /*  public static boolean sum2EqTarget(int[] a, int s,int t){
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(a[i] + a[j] == t){
                    return true;
                }
            }
        }
        return false;
    }
*/
    //2 Pointer Approach - Time Complexity O(n)
    public static boolean sum2EqTargetOptimised(int[] a, int s,int t){
        int start = 0,end = s-1;
        Arrays.sort(a);
        for(int i=0;i<s;i++){
            int sum = a[start]+a[end];
            if(sum == t){
                return true;
            }
            if(sum < t)
                start++;
            else
                end--;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size,target and then array elements: ");
        int size = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
       // System.out.println(sum2EqTarget(arr,size,target));
        System.out.println(sum2EqTargetOptimised(arr,size,target));
    }
}
