import java.util.Scanner;
//program to check if the given pattern is a subsequence of the given string
public class PatternIsSubsequence {

    public static boolean checkIfPatternIsSubsequence(String str,String pattern,String out, int i){
        if(i>=str.length())
            return out.equals(pattern);
        if(checkIfPatternIsSubsequence(str,pattern,out+(str.charAt(i)),i+1))
            return true;
        return checkIfPatternIsSubsequence(str,pattern,out,i+1);
    }
    public static void main(String[] main){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String p = scn.nextLine();
        System.out.println(checkIfPatternIsSubsequence(s,p,"",0));

    }
}
