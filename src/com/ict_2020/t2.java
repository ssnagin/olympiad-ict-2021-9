package com.ict_2020;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt(), B = scn.nextInt(), n = 0;

        if ((A + B) % 3 != 0) {System.out.print(-1); return;}

        n = (A + B) / 3;
        if (A > n && B > n) System.out.print((A - n) + " " + (B - n));
        else System.out.print(-1);

        // Круасаны - А
        // Эклеры - B
    }
}
