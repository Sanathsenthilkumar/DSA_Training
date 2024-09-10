import java.util.Scanner;
//Program to find sum of array using recursion
public class RecursiveSumOfArray {
    public static int sumArrayPrint(int[] a,int i){
        if(i>=a.length)
            return 0;
        return a[i]+sumArrayPrint(a,i+1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        int res = sumArrayPrint(arr,0);
        System.out.print(res+ " ");
        scn.close();
    }
}
