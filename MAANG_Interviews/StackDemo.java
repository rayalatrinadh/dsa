package com.MAANG_Interviews;

import java.util.Stack;

public class StackDemo {
    public static int ptr = 8;
    public static int arr[] = new int[10];

    public static void main(String[] args)  {
//        Stack<Integer> stack = new Stack<Integer>();
//
//        stack.push(1);
//        stack.add(1);
//
//        System.out.println(stack.push(2));
//        System.out.println(stack.add(3));
//        System.out.println(stack);


        //System.out.println(isEmpty());
        System.out.println(push(7));
    }

//    public static boolean isEmpty(){
//        if(ptr == 2)
//            return false;
//        return true;
//    }

    public static int push(int data)  {

        int ada = (arr[++ptr] = data);
        return ada;
    }



}
