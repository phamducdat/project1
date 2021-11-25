package com.company.week4;

public class bai08 {

    public static void main(String[] args) {
        String s1 = "pham";
        String s2 = "pham duc dat";
        int count = 0;
        String[] part = s2.split(" ");
        for (int i = 0; i < s2.length(); i++) {
            for (int j = i; j < s2.length(); j++) {
                if(s1.equals(s2.substring(i, j))) count++;
            }
        }
        System.out.println(count);
    }
}
