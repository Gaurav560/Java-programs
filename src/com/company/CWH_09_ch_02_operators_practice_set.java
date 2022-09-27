package com.company;

import java.util.Scanner;

public class CWH_09_ch_02_operators_practice_set {
    public static void main(String[] args) {
        //q1
//        float a=7/4.0f *9/2.0f;
//        System.out.println(a);

        //q2
        //encrypting a grade
//        char grade='A';
//        grade=(char)(grade+8);//typecasting-conversion of one data type into another data type
//        System.out.println(grade);
//        //decrypting the grade
//        grade=(char) (grade-8);
//        System.out.println(grade);

        //q3-comparison numbers
//        int a=54;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter the number which u want to compare: ");
//        int b=sc.nextInt();
//        boolean c=b>a;
//        System.out.println(c);
        //q4
        Scanner sc=new Scanner(System.in);
        System.out.println("enter v: ");
        double v=sc.nextDouble();
        System.out.println("enter s: ");
        double s=sc.nextDouble();
        System.out.println("enter a: ");
        double a=sc.nextDouble();
        System.out.println("enter u: ");
        double u=sc.nextDouble();
        double result=(v*v-u*u)/(2*a*s);
        System.out.println("the result is :"+result);
    }
}
