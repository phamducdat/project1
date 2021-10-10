package com.company.week3;

import java.util.*;

public class bai06 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList =
                new ArrayList<>(Arrays.asList(
                        1,2,4,6,7,8,9,433,5,76,74,4
                ));
        Set<Integer> result = new HashSet<>();

        arrayList.forEach(flag -> {
            arrayList.forEach(integer -> {
                if (integer % flag == 0 && !integer.equals(flag)) result.add(flag);
            });
        });
        result.forEach(System.out::println);
    }
}
