import java.util.*;
//time complexity -> O(n)
//space complexity -> O(1)
public class ProdOfArrayExceptSelfWithZero {
    static long[] arrProductThanSelf(int[] arr, int len){
        long[] res = new long[len];
        long product = 1;
        int count = 0;
        boolean flag = false;
        for(int i=0;i<len;i++){
            if(arr[i] != 0)
                product*=arr[i];
            else {
                flag = true;
                count++;
            }
        }
        if(count > 1){
            return res;
        }
        for(int i=0;i<len;i++){
            if(flag == true){
                if(arr[i] != 0)
                    res[i] = 0;
                else
                    res[i] = product;
            }
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

