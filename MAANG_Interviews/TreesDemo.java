package com.MAANG_Interviews;


import java.util.Scanner;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){

    }
    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val,TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
        }
public class TreesDemo {

    public static void main(String[] args) {
        TreeNode root = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the tree ");
        int n = input.nextInt();
        for(int i = 0;  i < n; i++) {
            System.out.println("Enter " + (i+1) +"th element into the tree");
            int userVal = input.nextInt();
           if(root == null){
               root = new TreeNode(userVal);
           }else if(userVal < root.val){
               if(root.left == null){
                   root.left = new TreeNode(userVal);
               }
               else{
                        TreeNode temp = root;

                        while(temp != null){

                            if( userVal < temp.val && temp.left != null){
                                temp = temp.left;
                            }else if(userVal > temp.val && temp.right != null){
                                temp = temp.right;
                            }else{
                                break;
                            }
                        }
                   if( userVal < temp.val && temp.left == null){
                       temp.left = new TreeNode(userVal);
                   }else{
                       temp.right = new TreeNode(userVal);
                   }
               }
           }else{

               if(root.right == null){
                   root.right = new TreeNode(userVal);
               }
               else{
                   TreeNode temp = root;

                   while(temp != null){

                       if( userVal < temp.val && temp.left != null){
                           temp = temp.left;
                       }else if(userVal > temp.val && temp.right != null){
                           temp = temp.right;
                       }else{
                           break;
                       }
                   }
                   if( userVal < temp.val && temp.left == null){
                       temp.left = new TreeNode(userVal);
                   }else{
                       temp.right = new TreeNode(userVal);
                   }

               }
           }
        }

        System.out.println("node  : " + root.val);
    }
}
