package com.company;

import java.util.Arrays;

public class Equilibrium {

    public static void main(String[] args) {
        int[] test = new int[]{3, 1, 2, 4, 3};

        System.out.println(solution(test));
    }

    public static int solution(int[] a) {
        int[] absValues = new int[a.length - 1];
        int pointer = 1;

        while (pointer < a.length) {
            int[] sums = new int[2];

            for (int i = 0; i < a.length; i++) {
                if (i < pointer) {
                    sums[0] += a[i];
                } else {
                    sums[1] += a[i];
                }
            }

            int value = sums[0] - sums[1];

            absValues[pointer - 1] = Math.abs(value);

            pointer++;
        }


        int rtnVal = Integer.MAX_VALUE;

        for (int absVal : absValues) {
            if (absVal < rtnVal) {
                rtnVal = absVal;
            }
        }

        return rtnVal;
    }
}
