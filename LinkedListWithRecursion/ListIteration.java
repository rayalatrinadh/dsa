package com.LinkedListWithRecursion;

import java.util.Scanner;

/**
 * @author r_3na
 *
 */
class ListNode{
    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    int val;
    ListNode next;

}

public class ListIteration {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the list size to be create");
        int size = input.nextInt();
        int i = 0;

        ListNode head = null;
        while(i < size){
            if(i == 0) {
                System.out.println(" please enter   " + (i + 1)+"st element into the list : ");
                int val = input.nextInt();
                head = new ListNode(val);
            }else if(i == 1){

                System.out.println(" please enter  " + (i+ 1)+"nd element into the list : ");
                int val = input.nextInt();
                ListNode temp = head;
                while(temp.next != null){
                    temp  = temp.next;
                }
                temp.next = new ListNode(val);
            }else if(i == 2){
                System.out.println(" please enter  " + i+ 1+"rd element into the list : ");
                int val = input.nextInt();
                 System.out.println(" entered val : " + val);
                ListNode temp = head;
                while(temp.next != null){
                    temp  = temp.next;
                }
                temp.next = new ListNode(val);
            }else{
                System.out.println(" please enter  " + (i + 1) +"th element into the list : ");
                int val = input.nextInt();
                ListNode temp = head;
                while(temp.next != null){
                    temp  = temp.next;
                }
                temp.next = new ListNode(val);
            }


            i++;
        }
        System.out.println(" list is : "  );
        printListWithoutRecursion(head);
        System.out.println("list print with recursion : ");
        printListWithRecursion(head);


    }

    public static void printListWithoutRecursion(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode printListWithRecursion(ListNode head){
      if(head == null ) return head;
            System.out.println(head.val);
            head.next = printListWithRecursion(head.next);
            return head;
    }
}
