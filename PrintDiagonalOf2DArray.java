import java.util.Scanner;
//Program to print the diagonal elements of 2D arrays
public class PrintDiagonalOf2DArray {
    public static void printDiagonal1(int[][] arr,int s1){
        System.out.print("First diagonal: ");
        for(int i=0;i<s1;i++)
                System.out.print(arr[i][i]+" ");
    }
    public static void printDiagonal2(int[][] arr,int s1, int s2){
        System.out.print("Second diagonal: ");
        for(int i=0;i<s1;i++)
            System.out.print(arr[i][s2-i-1]);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size and array elements: ");
        int size1 = scn.nextInt();
        int size2 = scn.nextInt();
        int[][] arr = new int[size1][size2];
        for (int i = 0; i < size1; i++){
            for(int j=0;j<size2;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        printDiagonal1(arr,size1);
        printDiagonal2(arr,size1,size2);
    }
}
