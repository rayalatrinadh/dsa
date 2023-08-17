package com.MAANG_Interviews;

import java.util.Arrays;

public class StackCustomImp {
    public static void main(String args[]) throws CustomException {
        CustomStack stack = new CustomStack(3);
        System.out.println(stack.arr.length);
        System.out.println(Arrays.toString(stack.arr));

        System.out.println(stack.push(2));
        System.out.println(stack.add(3));


        System.out.println(stack.push(2));
       // System.out.println(stack.push(1));
        System.out.println("peek Element : "+stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.arr));

    }
}
