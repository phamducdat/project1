package com.company.week4;

import java.util.ArrayList;

public class bai13 {

    public static boolean check(String name) {
        char first = name.charAt(0);
        if (first == 'H') return true;
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hồng Thị An");
        list.add("Nguyễn Thị Thành");
        list.add("Phạm Đạt");
        int count = 0;
        for(String name : list) {
            if (check(name)) count++;
        }
        System.out.println(count);
    }
}
