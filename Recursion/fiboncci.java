package Recursion;

public class fiboncci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static int fib(int n) {
        if(n<=1)
            return n;
        int secLast=fib(n-2);
        int last=fib(n-1);

        return secLast+last;
    }
}
