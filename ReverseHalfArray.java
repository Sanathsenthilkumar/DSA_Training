import java.util.Arrays;
import java.util.Scanner;

public class ReverseHalfArray {
    static int[] pointerReverseArray(int[] a, int start, int end){
        while(start < end){
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }

        return a;
    }
    static int[] reverseArrayByParts(int[] arr){
        int mid = arr.length/2;
        pointerReverseArray(arr,0,mid);
        //pointerReverseArray(arr,mid+1, arr.length-1);
        return arr;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size,target and then array elements: ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        int [] revArr = reverseArrayByParts(arr);
        System.out.print(Arrays.toString(revArr));

    }
}
