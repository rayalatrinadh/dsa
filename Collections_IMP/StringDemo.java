package com.java.Collections_IMP;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {
    public static void main(String[] args) {
        String s = "@trinadh How @thea are you @rakhi am fine @friends";
        ArrayList<String> alList = printSpecialName(s);
        System.out.println(alList);
    }

    public static ArrayList<String> printSpecialName(String s){
        ArrayList<String> aList = new ArrayList<>();
       String[] aa = s.split(" ");
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        for(String an : aa) {
            Matcher matcher = pattern.matcher(an);
            boolean isStringContainsSpecialCharacter = matcher.find();
            if (isStringContainsSpecialCharacter)
                aList.add(an.substring(1));
        }
        return aList;
    }
}
