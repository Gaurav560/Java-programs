package com.company;

import java.util.Scanner;

public class CWH_20_Continue_And_Break_Statements {
    public static void main(String[] args) {
        //break and continue using loops
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the value of n:");
//        int n=sc.nextInt();
//        //break in for loop
//        for (int i=1;i<=n;i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==4){
//                System.out.println("ending the loop");
//                break;//break statement is used to end the loop whether the condition is true or falsec.

              //break in while loop
//        int i=1;
//        while (i<5){
//            System.out.println("Java is great");
//            if (i==2){
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//            }
//        System.out.println("are ");

//        break in do while loop
//        System.out.println("enter the number upto which u want to print:");
//        int number=sc.nextInt();
//        int i=0;
//        do {
//            System.out.println("java is great");
//            if (i==3){
//                System.out.print("loop ends here");
//                break;
//
//            }
//            i++;
//        }while (i<=number);

        //continue in loop
//        System.out.println("enter the value of n:");
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("ending the loop");
//                continue;//continue matlab iske neeche wale saare statements
//                //ignore karo aur next iteration mein aa jaao .
//
//        }
//            System.out.println(i);
//
//    }
//
//     continue in do while loop
      System.out.println("enter the number upto which u want to print:");
        int number=sc.nextInt();
        int i=0;
        do {
           i++;
            if (i==3){
                System.out.println("loop ends here");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }while (i<=number);
    }}

