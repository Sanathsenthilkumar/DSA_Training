import java.util.*;
//using Kadanes algorithm to find Maximum sum of Sub-array
public class KadanesAlgorithmSubArraySum {

    public static int kadanesAlgorithm(int[] a, int s){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<s;i++){
            currSum += a[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum < 0)
                currSum = 0;
        }
        System.out.println(maxSum);
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        kadanesAlgorithm(arr,size);
        scn.close();
    }
}
