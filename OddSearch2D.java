import java.util.Scanner;
//searching odd elements in a 2D Array.
public class OddSearch2D {
    public static int oddSearch2D(int[][] arr, int s1, int s2){
        int c = 0;
        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
                if(arr[i][j] % 2 != 0)
                    c++;
            }
        }
        return c;
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
        int count = oddSearch2D(arr,size1,size2);
        System.out.println(count);
    }
}
