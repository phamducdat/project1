package com.company.week3;

import java.util.ArrayList;
import java.util.Arrays;

public class bai01 {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,34,4,5,53,5));
        arrayList.sort(((o1, o2) -> o2-o1));
        System.out.println(arrayList);

    }
}
