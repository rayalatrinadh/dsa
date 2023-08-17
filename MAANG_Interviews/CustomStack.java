package com.MAANG_Interviews;

public class CustomStack {
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;

    CustomStack(){
        this(DEFAULT_SIZE);
    }


    CustomStack(int size){
        this.arr = new int[size];
    }

    int ptr = -1;

    public int push(int data) throws CustomException {
        if(isFull()){
             throw new CustomException("stack is full");
        }
        return (arr[++ptr] = data);
    }
    public boolean add(int data)throws CustomException {
        if(isFull()){
            throw new CustomException("stack is full");
        }
        arr[++ptr] = data;
        return true;
    }

    public int pop() throws CustomException {
        if(isEmpty()){
            throw new CustomException("stack is empty");
        }
         int popElement = arr[ptr];
        arr[ptr--] = 0;
        return popElement;
    }


    public int peek(){
        return arr[ptr];
    }

    public boolean isFull(){
            if(ptr == arr.length-1)
                return true;
            return false;
    }

    public boolean isEmpty(){
        if(ptr == -1){
            return true;
        }
        return false;
    }

}
