//sum of all array elements

import java.util.*;
public class sumArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int arrSize = scn.nextInt();
        int[] arr = new int[arrSize];
        for(int i=0;i<arrSize;i++){
            arr[i] = scn.nextInt();
        }
        for(int i=0;i<arrSize;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
