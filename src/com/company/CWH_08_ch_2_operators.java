package com.company;

import java.util.Scanner;

public class CWH_08_ch_2_operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //arithmetic operators
        int k=4+6;
        System.out.println(k);
        double g=4.8%1.2;
        System.out.println(g);
        //assignment operators
//        int a =4;
//         int b=a-6;
//         b *=3;
//        System.out.println(b);
        //logical operators
        System.out.println(64>5 && 65>70);
        //bitwise operators
        System.out.println(2&3);//bitwise operators  operates in 1 and 0 like 2 is written in 10
    }
}
