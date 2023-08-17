package com.MAANG_Interviews;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {
    public static void main(String args[]){

        List<Integer> list = new ArrayList<Integer>();


        list.add(1);
        list.add(2);

        list.remove(2);
        System.out.println(list);

        Iterator<Integer> itr = list.iterator();

//        while(itr.hasNext())


    }
}
