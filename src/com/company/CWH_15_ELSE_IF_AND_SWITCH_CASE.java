package com.company;
import java.util.Scanner;
public class CWH_15_ELSE_IF_AND_SWITCH_CASE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age for which u want to know about Gaurav: ");
        int age=sc.nextInt();

        //SWITCH CASE EXPLAINED
        switch (age){
            case 17:
                System.out.println("u are going to meet Shweta");
                break;
            case 18:
                System.out.println(" u re going on a date with shweta at her house");
                break;
                case 20:
                System.out.println("she is gone from your life and u are felling frustrated " +
                        "and developed a habit of fapping and eating .u were  suffering from depression and mental and health fatigue");
                break;
            case 22:
                System.out.println("situation becomes even worse and i had lost all hopes of life and just living life .eating mindlessly ,having no aim in life.");
            case 23:
                System.out.println("i decided to do something in my life but the college period is over and it is very much late " +
                        "but iam not loosing hope .these diseases still haunt me and my eating habits had become worse only");
                break;
            case 24:
                System.out.println("now i am fighting for my life . i know i am late but still hope is only answer .Shweta is no more . i don't really know " +
                        "what exactly happened to her but she was in greater pain than i can ever be.i am trying to do things right " +
                        "and iam pretty much confident if i do as i have planned the future is bright for me and my loved ones.");

        }
        System.out.println("Gaurav! this message is from all the GODS that you are a born winner and true champion .u should believe in yourself .We" +
                "all know u are going to be great again in next 6 months.");

//note-we can use char,int and string in switch case in java .it is very easy to apply.





//        if(age>=54){
//            System.out.println("you are experienced.");
//
//        } else if (age>=46) {
//            System.out.println("u are semi-experienced.");
//
//
//        } else if (age>=36) {
//            System.out.println("u are semi-semi experienced.");
//        }
//        else {
//            System.out.println("you aren not experienced.");
//        }
    }
}
