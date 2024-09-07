import java.util.Scanner;
//program to check if two arrays are equal or not
public class EqualArrays {
    public static boolean equalArrays(int[] a1, int[] a2){
        if(a1.length !=a2.length)
            return false;
        for(int i=0;i<a1.length;i++){
            if(a1[i] != a2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size1 = scn.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0;i<size1;i++)
            arr1[i] = scn.nextInt();
        int size2 = scn.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0;i<size2;i++)
            arr2[i] = scn.nextInt();
        System.out.println(equalArrays(arr1,arr2));
        scn.close();
    }
}
