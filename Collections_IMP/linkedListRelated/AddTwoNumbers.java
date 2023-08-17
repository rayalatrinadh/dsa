package com.java.Collections_IMP.linkedListRelated;


import java.util.Scanner;

class Node1 {
    int val;
    Node1 next;

    Node1(){
    }
    Node1(int val){
        this.val = val;
    }
    Node1(int val, Node1 next){
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public Node1 addTwoNumbers(Node1 l1, Node1 l2) {
        Node1 ansNode = null;
        Node1 newNode = null;
        Node1 temp = null;
        int sum = 0;
        while(l1 != null & l2 != null){
            sum = sum + l1.val + l2.val;
            if(sum <= 9){
                newNode = new Node1(sum);
                sum = 0;
            }else{
                newNode = new Node1(sum%10);
                sum = sum / 10;
            }

            if(ansNode == null){
                ansNode = newNode;
            }else{
                temp = ansNode;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            sum = sum + l1.val;
            if(sum <= 9){
                newNode = new Node1(sum);
                sum = 0;
            }else{
                    newNode = new Node1(sum%10);
                    sum = sum/10;
            }
            temp = ansNode;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            l1 = l1.next;
        }



        while(l2 != null){
            //=====================

            sum = sum + l2.val;
            if(sum <= 9){
                newNode = new Node1(sum);
                sum = 0;
            }else{
                    newNode = new Node1(sum%10);
                    sum = sum/10;

            }
            temp = ansNode;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            l2 = l2.next;
            //==================

        }

        if(sum != 0){
            newNode = new Node1(sum);
            sum = 0;
            temp = ansNode;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return ansNode;
    }
}
class AddTwoNumbers {
    public static void main(String[] args) {
        Node1 l1 = null;
        Node1 l2 = null;
        Node1 newNode1 = null;
        Node1 newNode2 = null;

        System.out.println("Enter list1 size");
        Scanner input = new Scanner(System.in);
        int list1size = input.nextInt();
        System.out.println(" please enter the " + list1size + " elements into the list1");
        for (int i = 0; i < list1size; i++) {
            newNode1 = new Node1(input.nextInt());
            if (l1 == null) {
                l1 = newNode1;
            } else {
                newNode1.next = l1;
                l1 = newNode1;
            }
        }

        System.out.println("Enter list1 size");
        list1size = input.nextInt();
            System.out.println(" please enter the " + list1size + " elements into the list1");

            for (int i = 0; i < list1size; i++) {
                newNode2 = new Node1(input.nextInt());
                if (l2 == null) {
                    l2 = newNode2;
                } else {
                    newNode2.next = l2;
                    l2 = newNode2;
                }
            }

            Solution ans = new Solution();
            Node1 finalAnls = ans.addTwoNumbers(l1,l2);

            while(finalAnls != null){
                System.out.println(finalAnls.val);
                finalAnls = finalAnls.next;
            }


    }
}