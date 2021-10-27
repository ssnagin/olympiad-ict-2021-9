package com.ict_2020;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] ARR = new int[N];
        int[][] res = new int[N][2];

        for (int i = 0; i < N; i++) {
//            ARR[i] = scn.nextInt();
            res[i][0] = scn.nextInt();
        }
        for (int i = 0; i < N; i++) {

            int visota = i + 1, dlina = res[i][0], dlina_minus = N - dlina, visote_minus = N - visota;


        }
    }
}

/*

5
4
2
3
5
1

 */