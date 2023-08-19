package com.LinkedListWithRecursion;


import java.util.Scanner;

public class GCDLinkedList {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the list size to be create");
        int size = input.nextInt();
        int i = 0;

        GCDLinkedList.ListNode head = null;
        while(i < size){
            if(i == 0) {
                System.out.println(" please enter   " + (i + 1)+"st element into the list : ");
                int val = input.nextInt();
                head = new GCDLinkedList.ListNode(val);
            }else if(i == 1){

                System.out.println(" please enter  " + (i+ 1)+"nd element into the list : ");
                int val = input.nextInt();
                GCDLinkedList.ListNode temp = head;
                while(temp.next != null){
                    temp  = temp.next;
                }
                temp.next = new GCDLinkedList.ListNode(val);
            }else if(i == 2){
                System.out.println(" please enter  " + (i+ 1)+"rd element into the list : ");
                int val = input.nextInt();
                System.out.println(" entered val : " + val);
                GCDLinkedList.ListNode temp = head;
                while(temp.next != null){
                    temp  = temp.next;
                }
                temp.next = new GCDLinkedList.ListNode(val);
            }else{
                System.out.println(" please enter  " + (i + 1) +"th element into the list : ");
                int val = input.nextInt();
                GCDLinkedList.ListNode temp = head;
                while(temp.next != null){
                    temp  = temp.next;
                }
                temp.next = new GCDLinkedList.ListNode(val);
            }


            i++;
        }
           ListNode printHead = head;
        printList(printHead);
        ListNode gcdHead = head;
        ListNode ans = insertGreatestCommonDivisor(gcdHead);
        System.out.println(" answer is : ");
        printList(ans);




    }

    public static ListNode insertGreatestCommonDivisor(ListNode head){
        ListNode curNode = head;
        while(curNode.next != null) {
            int gcd = gcd(curNode.val, curNode.next.val);
            ListNode node = new ListNode(gcd);
            node.next = curNode.next;
            curNode.next = node;
            curNode = curNode.next.next;
        }
        return head;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void printList(ListNode head){

        while(head.next != null){
            System.out.print(head.val + " -> ");
            head= head.next;
        }
        System.out.println(head.val);
    }

    /**
     * @author r_3na
     *
     */
    static class ListNode{
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
}
