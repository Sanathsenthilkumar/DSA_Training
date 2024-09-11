import java.util.Scanner;
//Program to check if 2 arrays are equal using recursion
public class RecursiveArraysCheck {
    public static boolean checkArrays(int[] a1, int[] a2,int i){
        if(a1.length != a2.length){
            System.out.println("Different sizes");
            return false;
        }
        if(i >= a1.length)
            return true;
        if(a1[i] != a2[i])
            return false;
        return checkArrays(a1,a2,i+1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size and array elements of first array: ");
        int size1= scn.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0;i<size1;i++)
            arr1[i] = scn.nextInt();
        System.out.print("Enter size and array elements of second array: ");
        int size2= scn.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0;i<size2;i++)
            arr2[i] = scn.nextInt();
        boolean res = checkArrays(arr1,arr2,0);
        System.out.println(res);
    }
}
