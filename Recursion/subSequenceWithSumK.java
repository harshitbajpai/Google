package Recursion;

import java.util.Stack;

public class subSequenceWithSumK {
    public static void main(String[] args) {
        int a[]={1,3,1,2,1,1};
        getSubSequenceWithSumK(0,4,a, new Stack<Integer>(),0);
    }
    private static void getSubSequenceWithSumK(int n, int k, int[] arr, Stack<Integer> res,int sum) {
        if(arr.length==n){
            if(sum==k){
                System.out.println(res);
            }
            return;
        }
        //adding
        res.push(arr[n]);
        sum+=arr[n];
        getSubSequenceWithSumK(n+1,k,arr,res,sum);
        //removing
        res.pop();
        sum-=arr[n];
        getSubSequenceWithSumK(n+1,k,arr,res,sum);
    }
}
