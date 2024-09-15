import java.util.*;
//Displaying Keys and Values of a hashmap using Map.Entry
public class Iterating_Hashmap {
    public static void main(String[] args){
        HashMap<Integer,Integer> h = new HashMap();
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int i=1;i<=num;i++)
            h.put(i,i*i);
        for(Map.Entry<Integer,Integer> i: h.entrySet()){
            System.out.println(i.getKey()+" -> "+i.getValue());
        }
    }
}
