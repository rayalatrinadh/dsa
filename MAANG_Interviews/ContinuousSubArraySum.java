package com.MAANG_Interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContinuousSubArraySum {

    public static void main(String[] args) {
        int[] arr = {23,2,6,4,7};

        System.out.println(checkSubarraySum(arr,6));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {


        Map<Integer, Integer> map = new HashMap<>();

        System.out.println("nums : "  + Arrays.toString(nums));
        System.out.println("map 1 :: " + map);
        map.put(0, -1); // Initialize the map with a sum of 0 at index -1
        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];

            if (k != 0) {
                runningSum %= k; // Take modulus if k is not zero
            }
            System.out.println("map 2 : : " + map);
            if (map.containsKey(runningSum)) {
                // If the same running sum is encountered again, check if the subarray length is greater than 1
                if (i - map.get(runningSum) > 1) {
                    System.out.println("map before return true: " + map);
                    return true;
                }
            } else {
                map.put(runningSum, i);
                System.out.println("after map put  : " + map);
            }
        }
        System.out.println("map before return false : " + map);
        return false;
    }
}
