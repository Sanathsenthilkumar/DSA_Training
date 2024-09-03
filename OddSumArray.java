//sum of odd numbers in array

import java.util.*;
public class OddSumArray {
    public static int printOddsum(int[] arr,int arrSize){
        int sum = 0;
        for(int i=0;i<arrSize;i++){
            if(arr[i] % 2 != 0)
                sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arrSize = scn.nextInt();
        int[] arr = new int[arrSize];
        for(int i=0;i<arrSize;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(printOddsum(arr,arrSize));
    }
}