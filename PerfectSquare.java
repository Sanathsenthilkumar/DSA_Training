import java.util.Scanner;
//program to find perfect square using binary search
public class PerfectSquare {
    public static int FindPerfectSq(int target){
        int start = 1,end = target/2;
        while(start <= end){
            int mid = (start + end)/2;
            if(mid*mid == target)
                return mid;
            if(mid*mid < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the element: ");
        int num = scn.nextInt();
        int ans = FindPerfectSq(num);
        System.out.println(ans);
    }
}
