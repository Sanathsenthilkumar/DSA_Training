import java.util.*;
//Time complexity - O(n^2)
public class ProdOfArrayExceptSelf {
    static long[] arrProductThanSelf(int[] arr, int len){
        long[] res = new long[len];
        for(int i=0;i<len;i++){
            int product = 1;
            for(int j=0;j<len;j++){
                if(i != j)
                    product *=arr[j];
            }
            res[i] = product;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size and array elements: ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = scn.nextInt();
        System.out.println(Arrays.toString(arrProductThanSelf(arr,size)));
    }
}
