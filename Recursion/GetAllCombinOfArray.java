package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GetAllCombinOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean []loop=new boolean[arr.length];
        getComb(arr,res,ds,loop);

        System.out.println(res);
    }

    private static void getComb(int[] arr, List<List<Integer>> res, List<Integer> ds,boolean[] loop) {
        if(ds.size()==arr.length){
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i< arr.length;i++) {
            if (!loop[i]) {
                loop[i]=true;
                ds.add(arr[i]);
                getComb(arr, res, ds, loop);
                ds.remove(ds.size() - 1);
                loop[i]=false;
            }
        }
    }
}
