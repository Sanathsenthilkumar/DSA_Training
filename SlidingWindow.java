import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindow {
    public static void windowSum(int[] arr,int size,int slide){
        int i=0,j=slide-1;
        int c=0;
        while(i<size && j<size){
            int sum = 0;
            for(int p=i;p<=j;p++){
                sum+=arr[p];

            }
            c++;
            System.out.println(sum+" ");

            i++;
            j++;
        }
        System.out.print(c+" ");
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        Arrays.sort(arr);
        int slide = scn.nextInt();
        windowSum(arr, size,slide);

        scn.close();
    }
}
