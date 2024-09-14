import java.util.*;
//Program to print the union of two arrays
public class UnionOfArrays {
    public static ArrayList<Integer> unionArrays(int[] nums1, int[] nums2){
        int len1 = nums1.length,len2 = nums2.length;
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0,j = 0;
        while(i<len1 && j<len2){
            if(nums1[i] == nums2[j]){
                a.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                a.add(nums1[i]);
                i++;
            }
            else {
                j++;
            }
        }
        while(j<len2){
            a.add(nums2[j]);
            j++;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size1 = scn.nextInt();
        int size2 = scn.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0;i<size1;i++)
            arr1[i] = scn.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0;i<size2;i++)
            arr2[i] = scn.nextInt();
        System.out.println(unionArrays(arr1,arr2));
    }
}
