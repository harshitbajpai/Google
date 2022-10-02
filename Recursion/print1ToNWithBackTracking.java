package Recursion;

public class print1ToNWithBackTracking {
    public static void main(String[] args) {
        int n=5;
        print1ToNWithBackTrackingMethod(n);
    }

    private static void print1ToNWithBackTrackingMethod(int n) {
        if(n<1)
            return;
        print1ToNWithBackTrackingMethod(n-1);
        System.out.println(n);
    }
}
