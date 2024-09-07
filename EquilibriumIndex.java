//Program to find the equilibrium index
import java.util.Scanner;

public class EquilibriumIndex {
    public static boolean findEquilibriumIndex(int[] a){
        int sum1=0,sum2=0;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
        }
        for(int j=0;j<a.length;j++){
            if(sum2 == sum1-sum2-a[j]){
                return true;
            }
            sum2+=a[j];
        }
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