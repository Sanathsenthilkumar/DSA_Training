import java.util.*;
//recursive binary search
public class BinarySearch_Recursion {
    public static int binarySearch(int[] a, int s, int e, int t){
        if(s > e)
            return -1;
        int mid = s + (e - s)/2;
        if(a[mid] == t)
            return mid;
        if(a[mid] < t)
            binarySearch(a,s,mid-1,t);
        return binarySearch(a,mid+1,e,t);
    }
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
