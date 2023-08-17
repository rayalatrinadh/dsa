package com.java.Collections_IMP;


//creating a node
class Node011 {
    int value;
    Node011 next;

    Node011(){};
    Node011(int val){
        this.value = val;
    }
    Node011(int value, Node011 next){
        this.value = value;
        this.next = next;
    }


}
public class ArrayListImpDemo {

    public static void main(String[] args) {


        Node011 list_01 = null;
        Node011 tail_01 = null;
        for(int i = 1; i < 4; i++){
            if(list_01 == null){
                list_01 = new Node011(i);
                tail_01 = list_01;
            }else{
                tail_01.next = new Node011(i);
                tail_01 = tail_01.next;
            }
        }


        while(list_01 != null){
            System.out.println(list_01.value);
            list_01 = list_01.next;
        }
    }


}
