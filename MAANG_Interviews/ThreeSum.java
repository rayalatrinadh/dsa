package com.dynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if(n <= 1)
            return ans;
        for(int i = 0; i < n-2; i++){
            for(int j = 1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    if(i != j && i != k && j != k && (nums[i] + nums[j] + nums[k] == 0)){

                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if(!ans.contains(list))
                            ans.add(list);
                        list = new ArrayList<>();
                    }
                }
            }
        }
        return ans;
    }
}
