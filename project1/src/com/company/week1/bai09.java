package com.company.week1;

import java.util.ArrayList;
import java.util.List;

public class bai09 {

    public static void main(String[] args) {
        int n = 124;
        List<Integer> listNumbers = analysis(n);
        System.out.printf("Result: %d = ", n);
        int size = listNumbers.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(listNumbers.get(i) + " x ");
        }
        System.out.print(listNumbers.get(size - 1));
    }


    public static List<Integer> analysis(int n) {
        int i = 2;
        List<Integer> listNumbers = new ArrayList<Integer>();

        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                listNumbers.add(i);
            } else {
                i++;
            }
        }
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }


}
