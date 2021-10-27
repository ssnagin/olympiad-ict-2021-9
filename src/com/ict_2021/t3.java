package com.ict_2021;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt(),
                e = scn.nextInt(),
                N = scn.nextInt(),
                sec = Math.abs(e - s),
                olimp_max = 100000000,
                andrey_max = 100000000,
                res = 0;
        int[] xi = new int[N];
        for (int i = 0; i < N; i++) {
            xi[i] = scn.nextInt();
        }

        for (int i = 0; i < xi.length; i++) {
            if (Math.abs(xi[i] - e) < olimp_max) olimp_max = Math.abs(xi[i] - e);
            if (Math.abs(xi[i] - s) < andrey_max) andrey_max = Math.abs(xi[i] - s);
        }

        if (sec >= 1 + olimp_max + andrey_max) res = 1 + olimp_max + andrey_max;
        else res = sec;

        System.out.print(res);
    }
}


//
//        for (int i = 0; i < xi.length; i++) {
//            if (s < xi[i])
//        }