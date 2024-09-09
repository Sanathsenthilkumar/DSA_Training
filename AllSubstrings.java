import java.util.Scanner;
//Program to print all possible substrings of a string
public class AllSubstrings {
    public static void allSubStrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k)+" ");

                }
                System.out.println("");
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        allSubStrings(str);
        scn.close();
    }
}
