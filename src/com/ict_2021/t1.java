package com.ict_2021;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt(), K = scn.nextInt(), res = 0;

        if (K / N == 1) {
            System.out.print(res);
            return;
        }
        System.out.print(((N / K) - 1) * (N / K) * 2);
    }
}
