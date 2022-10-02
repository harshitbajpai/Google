package Recursion;

public class print1ToN {
    public static void main(String[] args) {
        int N=5;
        print1ToNWithoutBackTracking(1,N);
    }

    private static void print1ToNWithoutBackTracking(int i, int n) {
        if(i>n)
            return;
        System.out.println(" i= "+i);
        print1ToNWithoutBackTracking(i+1,n);
    }
}
