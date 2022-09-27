package com.company;

import java.util.Scanner;

public class CWH_16_Ch_04_practice_set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//q2
//        System.out.print("Enter the total marks in physics: ");
//        float physics=sc.nextFloat();
//        System.out.print("Enter the total marks in english: ");
//        float english=sc.nextFloat();
//        System.out.print("Enter the total marks in maths: ");
//        float maths=sc.nextFloat();
//
//        float totalMarks=english+maths+physics;
//
//        System.out.print("Enter the  marks obtained in physics: ");
//        float physics_marks=sc.nextFloat();
//        System.out.print("Enter the  marks obtained in english: ");
//        float english_marks=sc.nextFloat();
//        System.out.print("Enter the  marks obtained in maths: ");
//        Float maths_marks=sc.nextFloat();
//        float total_Marks_Obtained=physics_marks+maths_marks+english_marks;
//        if((physics_marks>=physics*0.33)&&(english_marks>=english*0.33)&&(maths_marks>=maths*0.33)&&(total_Marks_Obtained>=totalMarks*0.4)){
//            System.out.println("u are passed");
//
//        }
//        else{
//            System.out.println("u are not passed");
//        }
//        System.out.println("your total marks obtained is : " +   ( total_Marks_Obtained )    + " out of " + (totalMarks));
//        System.out.println("percentage obtained is " + ( ( total_Marks_Obtained/totalMarks)*100) + "%. ");

        //q3
//        System.out.print("enter the salary : ");
//        double salary=sc.nextDouble();
//        double tax=0;
//
//        if(salary<250000){
//            tax=tax+0;
//            System.out.println("tax to be paid is : " + tax);
//        }
//       else if(salary>=250000 && salary<=500000){
//            tax=tax+0.05*(salary-249999);
//            System.out.println("tax to be paid is : " + tax);
//
//        }
//        else if(salary>500000 && salary<=1000000){
//            tax=tax+0.05*250001+0.2*(salary-500000);
//            System.out.println("tax to be paid is : " + tax);
//
//        }
//        else{
//            tax=tax+(0.05*250001)+(0.2*500000)+(0.3*(salary-1000000));
//            System.out.println("tax to be paid is : " + tax);
//
//    }

        //q4
//        System.out.println("enter the number for which u want to find the day: ");
//        int num =sc.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//            default:
//                System.out.println("any day is a good day if you are true to yourself.");
//        }
        //q5
//                System.out.print("enter the year please:");
//                int year=sc.nextInt();
//                boolean b = year % 4 == 0;
//                boolean c = year%100 != 0;
//                boolean d=year%400==0;
//                if((b&&c)||d){
//                    System.out.println("it is a leap year");
//                }
//                else {
//                    System.out.println("It is not a leap year.");
//                }

        //q6
        System.out.println("enter the website u want to check: ");
        String website=sc.nextLine();
        if(website.endsWith(".org")){
            System.out.println("It is a organizational website.");
        }
       else if(website.endsWith(".com")){
            System.out.println("It is a commercial website.");
        }
        else if(website.endsWith(".in")){
            System.out.println("It is a indian website.");
        }
            }
        }


