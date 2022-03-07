package com.company;

import java.util.Arrays;

public class Equilibrium {

    public static void main(String[] args) {
        int[] test = new int[]{3, 1, 2, 4, 3};

        System.out.println(solution(test));
    }

    public static int solution(int[] a) {
        int[][] results = new int[a.length - 1][2];
        int pointer = 1;
        int currentDifference = Integer.MAX_VALUE;

        System.out.println(Arrays.toString(a));

        while (pointer < a.length) {

            if (pointer == 1) {
                for (int i = 0; i < a.length; i++) {
                    if (i < pointer) {
                        results[pointer - 1][0] += a[i];
                    } else {
                        results[pointer - 1][1] += a[i];
                    }
                }
            } else {
                results[pointer - 1][0] = results[pointer - 2][0] + a[pointer - 1];
                results[pointer - 1][1] = results[pointer - 2][1] - a[pointer - 1];
            }

            if (Math.abs(results[pointer - 1][0] - results[pointer - 1][1]) < currentDifference) {
                currentDifference = Math.abs(results[pointer - 1][0] - results[pointer - 1][1]);
            }

            pointer++;

        }

        System.out.println(Arrays.deepToString(results));

        return currentDifference;
    }

//    public static int solution(int[] a) {
//        int[] absValues = new int[a.length - 1];
//        int pointer = 1;
//
//        while (pointer < a.length) {
//            int[] sums = new int[2];
//
//            for (int i = 0; i < a.length; i++) {
//                if (i < pointer) {
//                    sums[0] += a[i];
//                } else {
//                    sums[1] += a[i];
//                }
//            }
//
//            int value = sums[0] - sums[1];
//
//            absValues[pointer - 1] = Math.abs(value);
//
//            pointer++;
//        }
//
//
//        int rtnVal = Integer.MAX_VALUE;
//
//        for (int absVal : absValues) {
//            if (absVal < rtnVal) {
//                rtnVal = absVal;
//            }
//        }
//
//        return rtnVal;
//    }
}
