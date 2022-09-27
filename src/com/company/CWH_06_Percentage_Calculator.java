package com.company;

import java.util.Scanner;

public class CWH_06_Percentage_Calculator {
//    public  int getdata(int g){
//        System.out.println("Gaurav");
//        return 67+g;
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total marks of all subjects: ");
        int totalMarks=sc.nextInt();
        System.out.print("enter marks in physics: ");
        int physics=sc.nextInt();
        System.out.print("enter marks in chemistry: ");
        int chemistry=sc.nextInt();
        System.out.print("enter marks in maths: ");
        int maths=sc.nextInt();
        System.out.print("enter marks in bio: ");
        int bio=sc.nextInt();
        System.out.print("enter marks in evs: ");
        int evs=sc.nextInt();
        int marksObtained=physics+chemistry+maths+bio+evs;
        System.out.println("thus the total marks obtained is :"+marksObtained);
        double percentage = ((marksObtained*100)/totalMarks);
        System.out.println("Hence the percentage is:" +percentage+"%");

//   function concept *****
//
//        CWH_06_Percentage_Calculator g1 = new CWH_06_Percentage_Calculator();
//        int a= g1.getdata(56);
//        System.out.println("Return value = "+ a);
    }
}
