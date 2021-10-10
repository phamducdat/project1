package com.company.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class bai04 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(
                100,200,4,56,677,34,4,55,3
        ));
        System.out.println("Value of max element = " +
                Collections.max(arrayList));

        System.out.println("Index of max element = " +
                arrayList.indexOf(Collections.max(arrayList)));
    }


}
