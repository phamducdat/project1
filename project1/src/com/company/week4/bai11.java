package com.company.week4;

import java.util.ArrayList;

public class bai11 {

    public static boolean check(String name) {
        String[] parts = name.split(" ");
        for (int i = 0; i < parts.length; i++) {
            if ("An".equals(parts[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Pham An");
        list.add("Nguyễn Thành");
        list.add("Phạm Đạt");
        int count = 0;
        for(String name : list) {
            if (check(name)) count++;
        }
        System.out.println(count);
    }


}
