import java.util.Arrays;
import java.util.Scanner;

public class LastOccurrence {
    public static int lastOccurrence(int[] arr,int len,int target){
        for(int i=0;i<len;i++){
            if(arr[len-1-i] == target){
                return len-i-1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] mat = new int[size];
        for(int i=0;i<size;i++){
                mat[i]= scn.nextInt();
        }
        int t = scn.nextInt();
        System.out.println(lastOccurrence(mat,size,t));
    }
}
