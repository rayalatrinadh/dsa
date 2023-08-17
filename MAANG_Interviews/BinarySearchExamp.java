package com.MAANG_Interviews;

public class BinarySearchExamp {
    public static void main(String args[]){
        int[] nums = {-7,-6,-5,-4,-3};
        int[] positiveNums = {5,6,7,8,9,11};
       //int neg =  bisect_left(nums,0);
       //System.out.println("negative Nums Count : "+ neg);
       int pos = positiveNums.length-bisect_left(positiveNums,1);
       System.out.println("Positive Nums Count : "+ pos);
       // System.out.println(Math.max(neg,pos));
    }


    private static int bisect_left(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if (nums[mid] < target)
                lo = mid+1;
            else
                hi = mid;
        }
        return lo;
    }
}


