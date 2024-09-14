import java.util.Scanner;
//Program to print the common elements in 2 arrays
public class CommonElementsIn2Arrays {

    //brute force
    /*public static void commonElements(int[] nums1,int[] nums2){
        int len1 = nums1.length;
        int len2 = nums2.length;
        for(int i=0;i<len1;i++){
            for(int j = 0;j<len2;j++){
                if(nums1[i] != nums2[j]){
                    continue;
                }
                else{
                    int ele = nums2[j];
                    System.out.println(ele+ "is Common");
                }

            }
        }
    }*/

    //2 pointer
    public static void twoPointer(int[] nums1,int[] nums2){
        int len1 = nums1.length, len2 = nums2.length;
        int i=0,j=0;
        while(i<len1 && j<len2){
            if(nums1[i] == nums2[j]){
                System.out.println(nums1[i]+" - Common element");
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
                i++;
            else
                j++;
            }
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
        //commonElements(arr1,arr2);
        twoPointer(arr1,arr2);
    }
}
