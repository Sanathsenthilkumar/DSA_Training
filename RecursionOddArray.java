import java.util.Scanner;
//Program to print odd index elements of an array using recursion
public class RecursionOddArray {
    public static void arrayPrint(int[] a, int len,int i){
        if(i>len-1)
            return ;
        if(i%2==0)
            System.out.print(a[i]+" ");
        arrayPrint(a,len,i+1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        arrayPrint(arr, size,0);
        scn.close();
    }
}
