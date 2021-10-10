package com.company.week3;

import java.util.ArrayList;
import java.util.Arrays;

public class bai02 {



    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2
                , 34, 5, 3, 234, 56, 232, 43));
        arrayList.forEach(System.out::println);
    }
}
