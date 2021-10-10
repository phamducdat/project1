package com.company.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class bai09 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(
                100,200,4,56,677,34,4,55,3,4,65,67,64,3
        ));

        int number = 7;
        AtomicInteger bigger = new AtomicInteger();
        AtomicInteger lesser = new AtomicInteger();
        AtomicInteger equal = new AtomicInteger();
        arrayList.forEach(integer -> {
            if (integer > number) bigger.getAndIncrement();
            if (integer < number) lesser.getAndIncrement();
            else equal.getAndIncrement();
        });
        System.out.println("So cac so > c = "+ bigger.getAndIncrement());
        System.out.println("So cac so < c = "+ lesser.getAndIncrement());
        System.out.println("So cac so = c = "+ equal.getAndIncrement());
    }
}
