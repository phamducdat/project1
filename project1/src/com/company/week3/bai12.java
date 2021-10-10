package com.company.week3;

import java.util.ArrayList;
import java.util.Arrays;

public class bai12 {

    private static String result(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (b.size() < a.size()) {
            return "a khong phai con cua b";
        }
        for (Integer integer : a) {
            if (!b.contains(integer)) return "a khong phai con cua b";
        }
        return "a la con cua b";
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(
                1, 3, 4, 5, 6, 7, 4
        ));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(
                1, 3, 4, 5, 6, 7, 6, 78, 5, 23, 56, 6
        ));
        System.out.println(result(a, b));

    }

}
