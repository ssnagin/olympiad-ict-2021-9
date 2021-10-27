package com.ict_2021;

import java.util.Scanner;

public class t5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // 1 2 5
        long x = scn.nextLong(), y = scn.nextLong(), res = 0, min = 0;
        if ((x + y) % 2 == 0 && x % 2 == 0 && y % 2 == 0) {
            res = -1;
        } else {

            if (x <= y) {
                min = 2 * x;
            } else {
                min = 2 * y;
            }
        }
        System.out.print(res);
    }
}
