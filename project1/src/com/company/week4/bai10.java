package com.company.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class bai10 {

    public static void main(String[] args) {
       ArrayList<String> str = new ArrayList<>();
       str.add("phamducdat");
       str.add("20183704");
       str.add("ktmt03");
       str.add("project1");

       String max = Collections.max(str, Comparator.comparing(String::length));
        System.out.println(max);
    }

}
