package com.java.Collections_IMP;

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> lllist = new LinkedList<>();
        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("trinadh");
        arrList.add("rakhi");
        arrList.add("chandu");

        lllist.addAll(arrList);
        System.out.println(lllist);

        arrList.add("String_01");
        arrList.add("String_02");
        arrList.add("String_03");

        System.out.println(arrList);

        lllist.addAll(arrList);
        System.out.println(lllist);

    }
}
