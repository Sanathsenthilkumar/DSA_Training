//printing only odd numbers

import java.util.*;
public class Oddnums {
    public static int printOdd(int n){
        for(int i=1;i<=n;i+=2)
            System.out.println(i);
        return -1;
    };

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
            printOdd(num);
    }
}