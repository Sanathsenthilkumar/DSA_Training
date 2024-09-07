//Program to print first row of a 2D array.
import java.util.*;

public class BoundaryElements2D {
    public static int printRow(int[][] a,int s1, int s2){
        int[] res= new int [s2];
        int i,j;
        for(j=0;j<s2;j++)
            System.out.println(a[0][j]);
        j = s2-1;
        for(i=1;i<s1;i++)
            System.out.println(a[i][j]);
        i = s1-1;
        for(j=s2-2;j>=0;j--)
            System.out.println(a[i][j]);
        j = 0;
        for(i=s1-2;i>0;i--)
            System.out.println(a[i][j]);
        return 1;
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
        int res =  printRow(arr,size1,size2);
    }
}
