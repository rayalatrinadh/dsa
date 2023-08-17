package com.MAANG_Interviews;


import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node next;

    Node(){};

    Node(int data){
        this.data = data;
    }
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

public class LinkedListDemoRevise {
    public static Node newHead = null;
    public static void main(String args[]){

        Node head = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = input.nextInt();

        System.out.println("Enter "+ n +  " items : ");

        for(int i = 0; i < n; i++){
            System.out.println("Enter "+ (i+1) + " th Element into LinkedList : ");
            int element = input.nextInt();

            if(head == null){
                head = new Node(element);
            }else{

                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new Node(element);
            }
        }

        System.out.println("Insertion completed SuccessfullY ! ");
        printNode(head);
        //task pending to reverse list may 3rd 2023 wednesday
        reverseLinkedList(head);

        System.out.println("\n print Linked List In reverse :");
        printNode(newHead);
    }
    public static void reverseLinkedList(Node head){



        while(head != null){
            Node temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }



        /* Stack<Node> stack = new Stack<>();



        while(head != null) {
            Node newHead  = head.next;
            head.next = null;
            stack.push(head);
            head = newHead;
        }
        //System.out.println(head);



        while(!stack.isEmpty()){
            if(newHead == null){
                newHead = new Node(stack.pop().data);
            }else{
                Node temp = newHead;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = (Node)stack.pop();
            }
        }*/

    }

    public static void printNode(Node head){
        while(head!= null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
