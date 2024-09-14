import java.util.*;
//Program to merge two sorted arrays using 2 pointer approach
public class Merge2SortedArrays {
    public static int[] mergeArrays(int[] nums1, int[] nums2){
        int len1 = nums1.length, len2 = nums2.length;
        int len= len1+len2;
        int i=0,j=0,k=0;
        int[] temp = new int[len];
        while(i<len1 && j<len2){
            if(nums1[i] < nums2[j]){
                temp[k] = nums1[i];
                k++;
                i++;
            }
            else{
                temp[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<len1){
            temp[k] = nums1[i];
            k++;
            i++;

        }
        while(j<len2){
            temp[k] = nums2[j];
            k++;
            j++;
        }
        for(int a=0;a<temp.length;a++)
            nums1[a] = temp[a];
        return nums1;
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
        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));
    }
}
