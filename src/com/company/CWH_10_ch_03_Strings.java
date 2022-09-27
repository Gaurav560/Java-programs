package com.company;

import java.util.Scanner;

public class CWH_10_ch_03_Strings {
    public static void main(String[] args) {
     //   String name=new String("Gaurav"); note-string is a class in java
       // String name="Gaurav";//but java has some special support for string so it can also be used as primitive data type
      //  System.out.println(name);
        //strings are immutable and cannot be changed but string ki copy bana ke usko change kiya jaa skata
//        // hai
        int a=5;
        float b=4.5348f;
        System.out.printf("the value of a is %d and the value of bis %8.2f",a,b);
        //%f mein 8.2f ka matlab hai total 8 space lega and 4.53 tak hi print hoga (.2 ka matlab decimal ke baad sirf 2 jagah hi milega)
//        System.out.format("the value of a is %d and the value of bis %f",a,b);

        //to enter string from the user
//        Scanner sc=new Scanner(System.in);
//        String st=sc.next();//sc.next method sirf sentence ke pehle word ko print karta hai .
//        String str=sc.nextLine();//sc,nextline reads the whole line.
//        System.out.println(st);

    }
}
