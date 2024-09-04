import java.util.Arrays;
import java.util.Scanner;

public class EquillibriumIndex {
    public static boolean findEquilibriumIndex(int[] a){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
        }
        for(int j=a.length-1;j>=0;j--){
            sum2+=a[j];
        }
        if(sum1 == sum2)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        System.out.println(findEquilibriumIndex(arr));
        scn.close();
    }
}
