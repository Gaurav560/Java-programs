package com.company;

import java.util.Scanner;

public class CWH_22_Arrays_1st_part {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    //there are three main ways to create an array in java .
        //1st way
//        int [] marks;//array declaration
//        marks=new int[5];//memory allocation
//        marks[0]=22;
//        marks[1]=25;
//        marks[2]=21;
//        marks[3]=26;
//        marks[4]=24;
//        System.out.println(marks[4]);

//        //2nd way
//        int [] marks =new int[5];
//        marks[0]=22;
//        marks[1]=25;
//        marks[2]=21;
//        marks[3]=26;
//        marks[4]=24;
//        System.out.println(marks[3]);
//
        //3rd way(in my opinion this method is best.)
        int[]marks={44,55,33,66,22};
        System.out.println(marks[3]);
    }
}
