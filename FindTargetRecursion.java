import java.util.Arrays;
import java.util.Scanner;
//Program to find the target element using recursion
public class FindTargetRecursion {
    public static boolean targetSearch(int[] a, int t,int i,int count){
        if(i>=a.length)
            return false;
        if(a[i] == t)
            return true;
        System.out.println("Count is: "+count);
        return targetSearch(a,t,i+1,count+1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        Arrays.sort(arr);
        int target = scn.nextInt();
        System.out.print(targetSearch(arr, target,0,1));

        scn.close();
    }
}
