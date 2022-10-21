package Recursion;

import java.util.ArrayList;
import java.util.Stack;

public class subSequence {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        Stack<Integer> res=new Stack<>();
        getAllSubSequence(0,arr,res);
    }
    private static void getAllSubSequence(int i, int[] arr, Stack<Integer> res) {
        if(i==arr.length){
            System.out.println(res);
            return;
        }
        //adding
        res.push(arr[i]);
        getAllSubSequence(i+1,arr,res);
        //removing
        res.pop();
        getAllSubSequence(i+1,arr,res);
    }
}
