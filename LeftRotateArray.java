import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
    static int[] leftRotateArray(int[] arr,int len,int n){

        for(int k=0;k<n;k++) {
            int temp = arr[0];
            for (int i = 1; i < len; i++) {

                arr[i - 1] = arr[i];
            }
            arr[len - 1] = temp;
        }

        return arr;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size and array elements: ");
        int size = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = scn.nextInt();
        System.out.println("Left rotation => "+Arrays.toString(leftRotateArray(arr,size,n)));
        //System.out.println("Right rotation => "+Arrays.toString(rightRotateArray(arr,size,n)));
    }
}
