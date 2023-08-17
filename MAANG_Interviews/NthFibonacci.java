package com.MAANG_Interviews;

public class NthFibonacci {

    public static void main(String args[]){

        int n = 5;
        System.out.println(fib(n));

    }  public static int fib(int n) {

        int a = 0, b = 1;
        int sum  = 0;
        if(n  <2)
            return n;
        while (n > 1) {
            // calculate next value as the sum of previous two values
            sum = a + b;

            // switch all values to the next value in the series
            a = b;
            b = sum;

            // decrement counter
            n -= 1;
        }

        return sum;
    }

}
