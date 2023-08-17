package com.MAANG_Interviews;

public class LargestNumTwice3 {
    public static void main(String args[]){
        int[] nums = {3,6,1,0};
      System.out.println(dominantIndex(nums));

    }

    public static int dominantIndex(int[] nums){
        int index = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            boolean isLargeNum = false;

            for(int j = 0;  j < n; j++){
                if(j!= i && nums[i] >= 2*(nums[j])){
                    isLargeNum = true;
                }else{
                    if(j!= i){
                        isLargeNum = false;
                        index = -1;
                        j = n;
                    }
                }
            }

            if(isLargeNum){
                index = i;
                return index;

            }
        }

        return index;
    }
}
