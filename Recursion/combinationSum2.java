package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(arr);
        getCombination(0,target,res,ds,arr);
        System.out.println(res);
    }

    private static void getCombination(int n, int target, List<List<Integer>> res, List<Integer> ds,int[] arr) {
        if(target==0){
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=n;i<arr.length;i++){
            if(i>n && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;

            ds.add(arr[i]);
            getCombination(i+1,target-arr[i],res,ds,arr);
            ds.remove(ds.size()-1);
        }

    }
}
