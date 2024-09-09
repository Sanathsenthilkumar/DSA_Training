import java.util.Scanner;
//Program to print the sum of all the diagonal elements
public class SumOfDiagonals {
    public static void findDiagonalSum(int[][] arr,int s){
        int dSum = 0;
        for(int i=0;i<s;i++){
            dSum+=arr[i][i];
            if(i!= (s-1-i))
                dSum+=arr[i][s-1-i];
        }
        System.out.println(dSum);

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
        findDiagonalSum(arr,size);
    }
}
