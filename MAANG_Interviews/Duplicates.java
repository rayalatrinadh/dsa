package com.MAANG_Interviews;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {

   public static void main(String args[]){
       int arr[] = {1,2,2,3};


       Set<Integer> set = new HashSet<>();

       int n = arr.length;

       for(int i = 0; i <n ;i++){
           if(set.add(arr[i])){
               System.out.println(set);
           }else{
              System.out.println("set not added");
           }
       }
   }

}
