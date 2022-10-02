package Recursion;

public class PrintName5Times {
    public static void main(String[] args) {
        int n=5;
        print5times(1,n);
    }

    private static void print5times(int i, int n) {
        if(i>n)
            return;
        System.out.println("Harshit Bajpai"+"n="+n+" i="+i);
        print5times(i+1,n);
    }
}
