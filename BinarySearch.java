import java.util.Arrays;
import java.util.Scanner;

/*This is a program to implement binary search

Algorithm:
STEP 1: int s = 0, e = n-1
STEP 2: while s <= e
    STEP 2.1: find the midIndex = (s+e)/2
    STEP 2.2: check middle (arr[midIndex]) is equal to TARGET
    STEP 2.1: YES -> return true
    STEP 2.1: if target < midElement => e = midIndex - 1
    STEP 2.1: if target > midElement => s = midIndex + 1
STEP 3: return false
*/


public class BinarySearch {


        //Without recursion
        public static boolean binarySearch(int[] a, int s, int e, int t){
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == t)
                return true;
            if (a[mid] < t)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return false;
        }
    /*
    public static boolean binarySearch(int[] a, int s, int e, int t){
        if(s > e)
            return false;
        int mid = s + (e - s)/2;
        if(a[mid] == t)
            return true;
        if(a[mid] < t)
            binarySearch(a,s,mid-1,t);
        return binarySearch(a,mid+1,e,t);
    }*/
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        Arrays.sort(arr);
        int target = scn.nextInt();
        int start = 0;
        int end = size-1;
        System.out.println(binarySearch(arr, start, end, target));
        scn.close();
    }
}
