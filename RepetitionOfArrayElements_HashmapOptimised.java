import java.util.*;
//Program to print the count of each element of an array using Hashmap - Optimised
///Time Complexity - O(n)
public class RepetitionOfArrayElements_HashmapOptimised {
    public static void findRepetition(int[] nums, int len){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<len;i++){
            if(h.containsKey(nums[i])){
                int frequency = h.get(nums[i]);
                h.put(nums[i],frequency+1);
            }
            else
                h.put(nums[i],1);
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
