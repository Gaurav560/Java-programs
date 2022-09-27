package com.company;

import java.util.Scanner;

public class CWH_19_for_loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //for loops
//
//        System.out.print("program to print first n odd numbers:");
//        int n=sc.nextInt();
//        int odd=0;
//        for(int i=0;i<n;i++){
//            odd=2*i+1;
//            System.out.println(odd);
            //program to print first n natural numbers in reverse order
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
        for (int i=n;i>0;i--){
            System.out.println(i);
        }
        }
    }

