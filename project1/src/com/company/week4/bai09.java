package com.company.week4;

import java.util.Objects;

public class bai09 {

    static char[] swap(String str, int i, int j)
    {
        if (i > str.length() || j > str.length()) return null;
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

    public static void main(String args[])
    {
        String s = "phamducdat20183704";

        int i = 6;
        int j = 4;
        System.out.println(Objects.requireNonNull(swap(s, i, j)));

    }
}
