import java.util.Scanner;
//Program to convert
public class BinaryToDecimal {
    public static int convertToDecimal(int[] dec,int len){
        int ans = 0;
        for(int i=0;i<len;i++){
            if(dec[i] == 1)
                ans+=(Math.pow(2,i));
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        int res = convertToDecimal(arr,size);
        System.out.println(res);
    }
}
