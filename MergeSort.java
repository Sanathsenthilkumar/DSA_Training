import java.util.*;
//Program to implement Merge Sort
public class MergeSort {
    public static void merge(int[] arr, int s, int m, int e){
        int i = s, j = m+1, k = 0;
        int[] ans = new int[e-s+1];
        while(i<=m && j<=e){
            if(arr[i] < arr[j]){
                ans[k] = arr[i];
                k++;
                i++;
            }else{
                ans[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i<=m){
            ans[k] = arr[i];
            k++;
            i++;
        }
        while(j<=e){
            ans[k] = arr[j];
            k++;
            j++;
        }
       for(int l=0;l<ans.length;l++)
           arr[s+l] = ans[l];
    }
    public static void mergeSort(int[] a,int s, int e){
        if(s>=e) return;
        int m = (s+e)/2;
        mergeSort(a,s,m);
        mergeSort(a,m+1,e);
        merge(a,s,m,e);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        mergeSort(arr,0,size-1);
        System.out.println(Arrays.toString(arr));
    }
}
