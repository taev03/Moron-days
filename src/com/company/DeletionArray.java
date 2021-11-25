package com.company;

import java.util.Arrays;

public class DeletionArray {
    public static void main(String[] args) {
        int test_array[] = {0, 1, 2, 3, 4, 0, 4, 2};
        System.out.println(Arrays.toString(removeElement(test_array, 3)));
    }

    public static int[] removeElement(int[] num, int val) {
        int offset = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == val) {
                offset++;
            } else {
                num[i - offset] = num[i];
            }
        }
        return  Arrays.copyOf(num, num.length - offset);
    }
}
