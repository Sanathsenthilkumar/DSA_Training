import java.util.Scanner;

public class LastOccurrence_BinarySearch {
    public static int binarySearch(int[] arr,int target, int s, int e, int ans){
        if(s>e)
            return ans;
        int mid = (s+e)/2;
        if(target == arr[mid]){
            ans = mid;
            return binarySearch(arr,target,mid+1,e,ans);
        }
        if(target > arr[mid])
            return binarySearch(arr,target,mid+1,e,ans);
        else
            return binarySearch(arr,target,s,mid-1,ans);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] mat = new int[size];
        for(int i=0;i<size;i++){
            mat[i]= scn.nextInt();
        }
        int t = scn.nextInt();
        System.out.println(binarySearch(mat,t,0,mat.length-1,0));
    }
}
