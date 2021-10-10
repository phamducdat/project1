package com.company.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class bai08 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(
                Arrays.asList(1,2,0,8,0,34,6,78,0)
        );

        arrayList.removeAll(Collections.singleton(0));
        System.out.println(arrayList);
    }
}
