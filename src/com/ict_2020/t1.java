package com.ict_2020;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int K = scn.nextInt(), N = scn.nextInt();
        if ((N - N % K) + K - N < N % K) System.out.print((N - N % K) + K - N);
        else System.out.println(N % K);
        // 0 600 1200 1800 2400
        //              2000
    }
}
