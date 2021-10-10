package com.company.week3;

import java.util.Collections;
import java.util.HashMap;

public class bai11 {


    public static int LICS(int[] arr)
    {
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        for (int j : arr) {
            if (hash.containsKey(j - 1)) {
                System.out.println("j = " + j);
                hash.put(j, hash.get(j - 1) + 1);
                hash.remove(j - 1);
            } else
                hash.put(j, 1);
        }
        System.out.println(hash);
        return Collections.max(hash.values());
    }
    public static void main(String args[])
    {
        int[] arr ={3, 10, 3, 11, 4, 5, 6, 7, 8, 12};
        System.out.println(LICS(arr));
    }
}
