package com.ict_2021;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt(), D = scn.nextInt(), res = 0, curr_lian = 0;
        int[] len = new int[N];

        for (int i = 0; i < N; i++) {
            len[i] = scn.nextInt();
        }

        res = len[0] / D + 1;

        for (int i = 0; i < N; i++) {
            if (res < i + 1) break;

            curr_lian = len[i] / D + i + 1;
            if (res < curr_lian) res = curr_lian;
        }

        if (res > N) res = N;

        System.out.print(res);
    }
}
