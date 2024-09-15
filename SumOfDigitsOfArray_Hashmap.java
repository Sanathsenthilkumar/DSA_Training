import java.util.*;
//Program to store and print the array elements as key and sum of digits as values using hashmap
public class SumOfDigitsOfArray_Hashmap {
    public static void createHashMap(int[] arr,int len){
        HashMap<Integer,Integer> h = new HashMap<>();
        int temp;
        for(int i=0;i<len;i++){
            temp = arr[i];
            int sum=0;
            while(arr[i]>0){
                sum+=arr[i]%10;
                arr[i] = arr[i]/10;
            }
            h.put(temp,sum);
        }
        for(Map.Entry<Integer,Integer> j: h.entrySet())
            System.out.println(j.getKey()+" "+j.getValue());
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        createHashMap(arr,size);
    }
}
