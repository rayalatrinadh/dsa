package com.MAANG_Interviews;

import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;

    ListNode(){};

    ListNode(int data){
        this.val = data;
    }

    ListNode(int data,ListNode next){
        this.val = data;
        this.next = next;
    }
}

public class PalindromeLinkedList {
    public static void main(String args[]){

        ListNode head = null;
        int userN = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("ENter size of the linked list :");
        int userInput  = input.nextInt();

        for(int i = 0; i < userInput; i++){
            System.out.println((i+1)+" th Element into the list : ");
            int userInput1 = input.nextInt();
            if(head == null){
                head = new ListNode(userInput1);
            }else{
                ListNode temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new ListNode(userInput1);
            }
        }

        System.out.println("enter userN int value for removeNthFromEnd : " +   userN );
        userN = input.nextInt();
        ListNode removalNthNodeFromEnd = removeNthFromEnd(head,userN);
        System.out.println("removalNthNodeFromEnd : " + removalNthNodeFromEnd);

        boolean ans = isPalindrome(head);
        System.out.println("ans  :  " + ans);
        /*System.out.println("traversing the list :");

        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }*/
    }

    public static boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow= slow.next;
        }


        //reversing the second half
        ListNode prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow= temp;
        }

        //compare both halfs

        ListNode right = prev;
        ListNode left = head;


        while(right != null){
            if(right.val != left.val)
                return false;
            right = right.next;
        }




        return true;

        /*System.out.println("traversing the list :");

        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }

        //System.out.println(head);*/


     /*   ListNode reverseList = null;
        ListNode temp = head;
        System.out.println("head 0 : "+head);
        while(temp != null){
            ListNode tempHead = temp.next;
            temp.next = reverseList;
            reverseList = temp;
            temp = tempHead;
        }
        System.out.println("head 1 " + head);
        System.out.println("reverseList 1 : " + reverseList);



        while(head != null && reverseList != null){

            System.out.println("head : " + head.val);
            System.out.println("reverseLst : " + reverseList.val);
            if(head.val != reverseList.val)
                return false;
            head = head.next;
            reverseList = reverseList.next;
            //return head.val != reverseList.val ? false: true;
        }*/





       // return true;
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }
}
