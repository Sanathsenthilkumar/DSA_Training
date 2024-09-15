import java.util.*;
//Program to store the squares of n natural numbers
public class AddNSquaresToHashmap {
    public static void main(String[] args){
        HashMap<Integer,Integer> h = new HashMap();
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int i=1;i<=num;i++)
            h.put(i,i*i);
        System.out.println(h);
    }
}
