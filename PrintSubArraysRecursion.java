import java.util.Scanner;

public class PrintSubArraysRecursion {
    public static void allSubArrays(int[] a , int len,int i, int j) {
        if (i >= len && j >= len) {
            return;
        }
        for (int k = i; k <= j; k++) {
            System.out.print(a[k]+" ");
        }
        System.out.println("");
        if (j < len - 1) {
            allSubArrays(a, len, i, j + 1);
        } else {
            allSubArrays(a, len, i + 1, i + 1);
        }

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        allSubArrays(arr,size,0,0);
        scn.close();
    }
}
