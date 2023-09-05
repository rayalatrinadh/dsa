package com.java.Collections_IMP.linkedListRelated;

import com.LinkedListWithRecursion.GCDLinkedList;

import java.util.Scanner;

public class MaximumTwinSum {
   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.println("enter the list size to be create");
       int size = input.nextInt();
       int i = 0;

       Node1 head = null;
       while(i < size){
           if(i == 0) {
               System.out.println(" please enter   " + (i + 1)+"st element into the list : ");
               int val = input.nextInt();
               head = new Node1(val);
           }else if(i == 1){

               System.out.println(" please enter  " + (i+ 1)+"nd element into the list : ");
               int val = input.nextInt();
               Node1 temp = head;
               while(temp.next != null){
                   temp  = temp.next;
               }
               temp.next = new Node1(val);
           }else if(i == 2){
               System.out.println(" please enter  " + (i+ 1)+"rd element into the list : ");
               int val = input.nextInt();
               System.out.println(" entered val : " + val);
               Node1 temp = head;
               while(temp.next != null){
                   temp  = temp.next;
               }
               temp.next = new Node1(val);
           }else{
               System.out.println(" please enter  " + (i + 1) +"th element into the list : ");
               int val = input.nextInt();
               Node1 temp = head;
               while(temp.next != null){
                   temp  = temp.next;
               }
               temp.next = new Node1(val);
           }
           i++;
       }
  int ans = pairSum(head);
          System.out.println("ans : " + ans);


   }

    public static int pairSum(Node1 head) {
        Node1 slow = head,fast = head;
        Node1 prev = null;
        Node1 temp = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        int res = 0;
        while(slow != null){
            res = Math.max(res,prev.val + slow.val);
            prev = prev.next;
            slow = slow.next;

        }

        return res;

    }
}
