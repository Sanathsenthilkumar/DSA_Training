import java.util.*;
//program to print all the possible sub-arrays for the given array
public class AllSubArrays{
    public static int allSubArrays(int[] arr, int len) {
        System.out.println("All sub-arrays of the given array are:");
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        allSubArrays(arr,size);
        scn.close();
    }
}
