//max element in an array

public class maxElement {
    public static int MaxElement(int[] arr){
        int ele = arr[0];
        for(int i=1;i< arr.length;i++){
            if(ele < arr[i]){
                ele = arr[i];
            }
        }
        return ele;
    }
    public static void main(String[] args){
        int[] arr = {1,3,7,2,12,9};
        System.out.println(MaxElement(arr));
    }
}
