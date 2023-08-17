package com.MAANG_Interviews;

public class BinaryToInt {
    public static void main(String args[]){
        int arr[] = {1,1,0,0};
        int ans = intToBinary(arr);
        System.out.println("ans : " + ans);
    }

    public static int intToBinary(int[] arr){

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum *= 2;
            sum += arr[i];
        }

        return sum;
    }
}
