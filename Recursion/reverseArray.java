package Recursion;

public class reverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        for (int i=0;i<n;i++)
          System.out.print(arr[i]);
        reverseArrayFunc(0,n,arr);
        System.out.println("");

        for(int i=0;i<n;i++)
           System.out.print(arr[i]);
    }

    private static void reverseArrayFunc(int i, int n, int[] arr) {

        if(i>=n-i-1)
            return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverseArrayFunc(i+1,n,arr);
    }
}
