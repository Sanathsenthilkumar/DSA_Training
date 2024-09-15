import java.util.*;
//Program to print the count of each element of an array using Hashmap
//Time Complexity - O(n^2)
public class RepetitionOfArrayElements_Hashmap {
    public static void findRepetition(int[] nums, int len){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<len;j++){
                if(nums[j] == nums[i])
                    count++;
            }
            h.put(nums[i],count);
        }
        for(Map.Entry<Integer,Integer> i: h.entrySet())
            System.out.println(i.getKey()+" -> "+i.getValue());
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        findRepetition(arr,size);
    }
}
