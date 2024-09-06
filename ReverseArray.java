import java.util.*;

public class ReverseArray {
    static int[] reverseArray(int[] a, int len){
        int[] newArr = new int[len];
        int k = 0;
        for(int i=len-1;i>=0;i--){
            newArr[k] = a[i];
            k++;
        }
        return newArr;
    }

    //2 Pointer approach
    static int[] pointerReverseArray(int[] a,int len){
        int start = 0, end = len-1;
        while(start<end){
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }

        return a;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size,target and then array elements: ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        int [] revArr = pointerReverseArray(arr,size);
            System.out.print(Arrays.toString(revArr));

    }
}
