//this is a program to implement Linear search with a time complexity of O(n) - Linear time complexity

import java.util.*;
public class LinearSearch {
    public static boolean linearSearch(int[] a,int s, int t){
        for(int i=0;i<s;i++){
            if(a[i] == t)
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        int target = scn.nextInt();
        System.out.println(linearSearch(arr, size, target));
        scn.close();
    }
}
