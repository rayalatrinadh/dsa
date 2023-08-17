package com.MAANG_Interviews;

import java.util.Arrays;

public class ArrayProductItself {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        productItself(arr);
    }
    public static void productItself(int[] arr){
        System.out.println("given array : "+Arrays.toString(arr));
        int n = arr.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i = 1; i < n; i++){
            result[i] = result[i-1] * arr[i-1];
        }
        System.out.println("array : "+Arrays.toString(result));
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= arr[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
