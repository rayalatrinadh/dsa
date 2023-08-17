package com.java.Collections_IMP;

import java.util.Iterator;
import java.util.LinkedList;

public class MergeLinkedLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList<>();
        LinkedList list2 = new LinkedList<>();
        LinkedList nlist = new LinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(6);



        int i = 0;
        int j = 0;
        int k = 0;
            while(j < list2.size()  && i < list1.size()) {
                System.out.println((int) list1.get(i) + " " + (int) list2.get(j));
                if ((int) list1.get(i) <= (int) list2.get(j)) {
                    nlist.add(k++, list1.get(i));
                    //System.out.println(nlist);
                    i++;
                } else {
                    nlist.add(k++, list2.get(j));
                    //System.out.println(nlist);
                    j++;
                }
            }

     if((int) list2.size() > (int)list1.size()) {
         for (int l = j; l < list2.size(); l++) {
             nlist.add(k++, list2.get(l));
         }
     }else{
         for (int l = i; l < list1.size(); l++) {
             nlist.add(k++, list1.get(l));
         }
     }
        System.out.println(nlist);











    }
}
