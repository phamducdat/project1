package com.company.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class bai03 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(
                100,200,4,56,677,34,4,55,3
        ));
        System.out.println("Value of min element = " +
                Collections.min(arrayList));

        System.out.println("Index of min element = " +
                arrayList.indexOf(Collections.min(arrayList)));
    }
}
