import java.util.Scanner;
//Program to print all the subsequences of a string.
public class StringSubsequences {
    public static void strSubsequence(String s, int i, String out){
        if(i>=s.length()){
            System.out.println(out);
            return;
        }
        strSubsequence(s,i+1,out+(s.charAt(i)));
        strSubsequence(s,i+1,out);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        strSubsequence(s,0,"");
    }
}
