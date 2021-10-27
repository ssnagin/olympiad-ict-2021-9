package com.ict_2021;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long X = scn.nextLong(), Y = scn.nextLong(), N = scn.nextLong(), res = 0, ost = N % (X + Y);
        res = (N / (X + Y)) * 2;
        if (ost != 0) {
            res += ost > Y ? 2 : 1;
        }
        System.out.print(res);
    }
}
