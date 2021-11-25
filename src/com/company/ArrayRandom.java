package com.company;

import java.util.Arrays;

public class ArrayRandom {
    public static void main (String[] args) {
        int [] num = new int[15];
        for (int i = 0; i < 15; i++) {
            num[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(num));
        System.out.println("Max число " + Math.random() );
    }
}
