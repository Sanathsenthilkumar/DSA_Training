import java.util.*;
//program to find the running sum in an array
public class RunningSum {
    public static int[] runningSum(int[] a){
        int sum = 0;
        int[] res = new int[a.length];
        for(int i=0;i<a.length;i++)
            res[i] = sum+=a[i];
        return res;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        System.out.println(Arrays.toString(runningSum(arr)));
        scn.close();
    }
}
