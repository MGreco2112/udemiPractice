package com.company;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 5, 1};

        System.out.println(solution(array));
    }

    public static int solution(int[] a) {
        int total = (a.length + 1) * (a.length - 1);
        int length = a.length;


        return length % total;
    }
}
