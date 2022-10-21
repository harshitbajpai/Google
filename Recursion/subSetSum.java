package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subSetSum {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<Integer> res=new ArrayList<>();

        int sum=0;
        getSubSetSum(0,arr,res,sum);
        System.out.println(res);

    }

    private static void getSubSetSum(int ind, int[] arr, List<Integer> res,int sum) {
        if(ind==arr.length){
            res.add(sum);
            return;}

        getSubSetSum(ind+1,arr,res,sum+arr[ind]);
        getSubSetSum(ind+1,arr,res,sum);
    }
}
