package Recursion;

public class printNTo1 {
    public static void main(String[] args) {
        int n=5;
        printNto1WithoutBackTrackin(0,n);
    }

    private static void printNto1WithoutBackTrackin(int i, int n) {
        if(i==n)
            return;
        System.out.println("i= "+n);
        printNto1WithoutBackTrackin(i,n-1);
    }
}
