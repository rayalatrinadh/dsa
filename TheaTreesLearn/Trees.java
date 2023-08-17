package com.TheaTreesLearn;

import java.util.Stack;

class Node{
    int val;
    Node left;
    Node right;

    Node(int data){
        this.val = data;
    }

    Node(int data, Node left, Node right){
        this.val = data;
        this.left = left;
        this.right = right;
    }
}


public class Trees {
    public static void main(String args[]){
        System.out.println("hello Trinadh Rayala");

        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(7);
        node.left.left = new Node(3);
        node.left.right  = new Node(4);
        node.left.right.left  = new Node(5);
        node.left.right.right  = new Node(6);
//        node.right.left = new Node(6);
//        node.right.right = new Node(7);
//        node.right.right.left = new Node(8);


        //PreOrderTraversalWithoutRecursion(node);
        //preOrderTraverseUsingRecursion(node);

        System.out.println(" preOrder using Stack : ");
        preOrderTraverseWithStack(node);
        System.out.println();
        System.out.println("InOrder Using Stack");
        inOrderTraverseWithStack(node);


    }

    private static void inOrderTraverseWithStack(Node node) {

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){

            Node temp = stack.peek();
//            if(temp.left!= null){
//                stack.push()
//            }
        }
    }

    private static void PreOrderTraversalWithoutRecursion(Node root) {

        if(root == null)
            System.out.println("Node is Empty");
        Stack<Node> stack = new Stack();
        stack.push(root);

        while(!stack.isEmpty() && stack.get(0) != null) {
            stack.get(0);
            //System.out.println("stack.get(0) : "+ stack.get(0));
            if (root.right != null && root.left != null) {
                Node popNode = stack.pop();
                System.out.println(popNode.val);
                //stack.pop();
                stack.push(popNode.right);
            }
        }




    }

    public static void preOrderTraverseUsingRecursion(Node node){

        //base condition for the recursion
        if(node == null)
            return;

        System.out.print(node.val + " ");
        preOrderTraverseUsingRecursion(node.left);
        preOrderTraverseUsingRecursion(node.right);
    }

    public static void preOrderTraverseWithStack(Node root){
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.print(temp.val + " ");

            //check if the tree has left and right childs.
            // if childs there put into the stack;

            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }

        }

    }
}
