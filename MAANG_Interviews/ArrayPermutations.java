package com.MAANG_Interviews;

import java.util.Arrays;

public class ArrayPermutations {

    public static void main(String[] args) {
        int[] arr = {5,14,3,1,2,0};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] + n * (arr[arr[i]] % n);
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] / n;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("==========");

        int[] brr = {5,4,3,1,2,0};
        int[] crr = new int[brr.length];
        for(int j = 0; j < brr.length; j++){
            crr[j] = brr[brr[j]];
        }

        System.out.println(Arrays.toString(crr));
    }


}
