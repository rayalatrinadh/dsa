package com.java.Collections_IMP;

//public class LinkedListD {
//}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public LinkedList  oddEvenList() {

        if (head == null) {
            return null;
        }
        /*Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;*/


        Node temp = head;
        Node temp1 = temp;
        while(temp1 != null && temp1.next != null){
            System.out.println(temp.next.data);
            System.out.println(temp1.next.data);
            //System.out.println(temp1.);
            while(temp1.next != null && temp1.data % 2 == 0 && temp1.next.data % 2 == 0 ){
                temp1 = temp1.next;
            }
            temp.next = temp1.next;
            temp1 = temp1.next;
            temp = temp.next;

        }
        return null;


        /*if (head == null) {
            return null;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return null;*/


    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListD {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        //list.addNode(5);
        //list.addNode(4);
        list.addNode(1);
        list.addNode(4);
        list.addNode(4);
        //list.printList();
        list.oddEvenList();


    }
}
