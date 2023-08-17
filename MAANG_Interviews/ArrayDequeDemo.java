package com.MAANG_Interviews;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDequeDemo {
    public static void main(String args[]) {
        int[] arr = {8, 4, 6, 2, 3};
        System.out.println(Arrays.toString(finalPrices(arr)));
    }

    public static int[] finalPrices(int[] prices) {

        int n = prices.length;
        int[] arr = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(prices[n - 1]);
        arr[n - 1] = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            System.out.println("llllll");
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                arr[i] = prices[i];
            }
            else {
                arr[i] = prices[i] - stack.peek();
            }
            System.out.println("hello");
            stack.push(prices[i]);
        }
        return arr;

        //return prices;
    }
}