import java.util.Scanner;
//Program to reverse a 2D matrix (row wise)
public class Reverse2DMatrix {
    public static void reverseMatrix(int[][] a, int s){
        for(int i=0;i<s;i++){
            int start = 0,end = s-1,temp = 0;
            while(start<end){
                temp= a[i][start];
                a[i][start] = a[i][end];
                a[i][end] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < s; i++){
            for(int j=0;j<s;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size and array elements: ");
        int size = scn.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++){
            for(int j=0;j<size;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        reverseMatrix(arr,size);
    }
}
