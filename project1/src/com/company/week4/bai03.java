package com.company.week4;

public class bai03 {

    public static void main(String[] args) {
        String name = "Pham Duc Dat";
        String[] parts = name.split(" ");
        for (int i =0; i< parts.length; ++i) {
            System.out.println(parts[i]);
        }
    }
}
