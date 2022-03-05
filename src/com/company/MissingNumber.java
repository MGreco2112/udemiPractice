package com.company;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] array = new int[]{};

        System.out.println(solution(array));
    }

    public static int solution(int[] a) {
        //my attempt: works but not as well as his

//        int total = (a.length + 1) * (a.length - 1);
//        int length = a.length;
//
//
//        return length % total;

        long actualSum = 0;

        for (int num : a) {
            actualSum += num;
        }

        long maxNumber = a.length + 1;

        long expectedSum = (maxNumber * (maxNumber + 1) / 2);

        return (int) (expectedSum - actualSum);
    }
}
