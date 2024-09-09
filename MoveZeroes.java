import java.util.*;
//program to move zeroes to end of array
public class MoveZeroes {
    public static int[] moveZeroesToEnd(int[] a , int len){
        int temp = 0;
        int m = 0;
        for(int i=0;i<len;i++){
            if(a[i] != 0){
                temp = a[i];
                a[i] = a[m];
                a[m] = temp;
                m++;
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        System.out.println(Arrays.toString(moveZeroesToEnd(arr,size)));
        scn.close();
    }
}
