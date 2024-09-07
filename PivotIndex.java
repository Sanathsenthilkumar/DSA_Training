import java.util.Scanner;

//similar to equilibrium index - returns the pivot index
public class PivotIndex {
    public static int findPivotIndex(int[] a){
        int sum1=0,sum2=0;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
        }
        for(int j=0;j<a.length;j++){
            if(sum2 == sum1-sum2-a[j]){
                return j;
            }
            sum2+=a[j];
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        System.out.println(findPivotIndex(arr));
        scn.close();
    }
}
