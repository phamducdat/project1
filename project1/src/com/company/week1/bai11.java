package com.company.week1;

import javax.naming.ldap.PagedResultsResponseControl;
import java.util.ArrayList;
import java.util.Random;

public class bai11 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);

        arrayList.add(7);

        Random random = new Random();
        int i = random.nextInt(arrayList.size());
        int j = random.nextInt(arrayList.size());
        while (j == i) {
            j = random.nextInt(arrayList.size());
        }
        int temp = arrayList.get(i);
        arrayList.set(i, arrayList.get(j));
        arrayList.set(j, temp);
        System.out.println(arrayList);


    }
}
