import java.util.Scanner;
//Program to check if an array is sorted using recursion
public class SortedArrayRecursion {
    public static boolean checkArrays(int[] a , int len,int i){
        if(i>=len-1)
            return false;
        if(a[i] > a[i+1])
            return false;
        checkArrays(a,len,i+1);
        return true;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size and array elements of first array: ");
        int size= scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        boolean res = checkArrays(arr,size,0);
        System.out.println(res);
    }
}
