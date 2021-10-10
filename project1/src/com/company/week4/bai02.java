package com.company.week4;

import com.sun.deploy.util.StringUtils;

public class bai02 {

    public static void main(String[] args) {
        String str = "phamducdat20183704abcabd";
        String findStr = "abc";
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        System.out.println(count);
    }
}
