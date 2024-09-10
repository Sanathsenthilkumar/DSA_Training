import java.util.Scanner;
//program to find the sum of odd elements in an array using recursion
public class RecursiveOddSumArray {
    public static int oddSumArrayPrint(int[] a,int i){
        if(i>=a.length)
            return 0;
        int sum = 0;
        if(a[i]%2!=0)
            sum +=  a[i];
        return sum+oddSumArrayPrint(a,i+1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        int res = oddSumArrayPrint(arr,0);
        System.out.print(res);
        scn.close();
    }
}
