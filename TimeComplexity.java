//Code for various Time Complexities

public class TimeComplexity {

    //Constant time -> O(1)
    public static void timeComplexity(int n){
        int sum = 100;      //sum is not changed!
        System.out.println("N = "+n);
        while(sum > 0){
            System.out.println("hello");
           sum /=10;
        }
    }

    //logarithmic time -> O(logn)
    public static void timeComplexity2(int m){
        System.out.println("M = "+m);
        while(m > 0){
            System.out.println("hi");
            m /=10;
        }
    }


    public static void main(String[] args){
        timeComplexity(10);
        //there won't be any changes in the number of hello(s) printed even if the value of 'n' is increased or decreased so the time complexity here is "Constant".

        timeComplexity2(10000); //change values of m here
        //with every increase in zero's in m (passed to the method timeComplexity2) the count to 'hi' in output will increase so if we consider the value of m as squares then we get a logarithmic time so the time complexity here is "Logarithmic".
    }
}
