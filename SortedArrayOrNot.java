import java.util.Scanner;
//program to check if an array is sorted or not
public class SortedArrayOrNot {
    public static boolean sortedArray(int[] a, int s){
        for(int i=0;i<s-1;i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arrSize = scn.nextInt();
        int[] arr = new int[arrSize];
        for(int i=0;i<arrSize;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(sortedArray(arr,arrSize));
    }
}
