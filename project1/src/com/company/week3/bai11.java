package com.company.week3;

import java.util.Collections;
import java.util.HashMap;

public class bai11 {


    public static void main(String[] args) {
        System.out.println("Pham Duc Dat - 20183704");
        int arr[] = {32, 5, 4, 64, 2,56,64,24,3, 4, 4, 23, 544, 436};
        int counter = 1;
        int start = arr[0];
        int end = arr[arr.length - 1];

        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                counter++;
                start = arr[i];
            }
        }

        System.out.println("Day co so phan tu la: " + counter);
        System.out.println("Bat dau cua day: " + start);
    }
}
