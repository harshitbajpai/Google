package Recursion;

public class printNto1WithBackTracing {
    public static void main(String[] args) {
        int n=5;
        printNto1WithBackTracingMethod(1,n);
    }

    private static void printNto1WithBackTracingMethod(int i,int n) {

        if(i>n)
            return ;
        printNto1WithBackTracingMethod(i+1,n);
        System.out.println(i);
    }
}
