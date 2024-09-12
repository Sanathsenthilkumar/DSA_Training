import java.util.*;
//Program to find duplicates in an array
public class DuplicateArray {
    public static void findDuplicates(int[] nums, int len){
        boolean present = false;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i] == nums[j]){
                    if(al.contains(nums[i]))
                        break;
                    else{
                        al.add(nums[i]);
                        present = true;
                    }

                }
            }
        }
        if(present == true)
            System.out.print(al+" ");
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scn.nextInt();
        findDuplicates(arr,size);
    }
}
