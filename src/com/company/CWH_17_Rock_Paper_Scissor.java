package com.company;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class CWH_17_Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let the game begins!");
        System.out.println("Here 0 is for Rock.");
        System.out.println(" 1 is for Scissor.");
        System.out.println("and 2 is for Paper.");
        int rock = 0;
        int scissor = 1;
        int paper = 2;
        int enter = 1;
        int a=0;
        int b=0;
        int round=0;
        while (enter <= 5)
        {
            round=++round;
            System.out.println("U have entered round :" + round);
            System.out.print("Choose the value you wish to display:");
            int number = sc.nextInt();
            System.out.println("U have chosen:" + number);
            int x = ThreadLocalRandom.current().nextInt(3);
            System.out.println("System has chosen :" + x);
            if (x == number) {
                System.out.println("Oops!draw.");
            } else if (x == 1 && number == 0) {
                System.out.println("You win .");
                a=++a;
            } else if (x == 0 && number == 1) {
                System.out.println("You loose.");
                b=++b;
            } else if (x == 2 && number == 1) {
                System.out.println("You win .");
                 a+= 1;

            } else if (x == 2 && number == 0) {
                System.out.println("You loose.");
                b=++b;

            } else if (x == 0 && number == 2) {
                System.out.println("You win");
                    a=++a;
            } else if (x == 1 && number == 2) {
                System.out.println("You loose");
                b=++b;
            } else {
                System.out.println("Please check the value from 0 to 2 only.");
            }

            enter++;
        }
        System.out.println("You have won the match " + a + " times.");
        System.out.println("System have won the match " + b + " times.");
        System.out.println("Draw have been taken place in the tournament "+ (5-(a+b))+" times.");
        if(a>b){
            System.out.println("Hence,You win the tournament.");
        }else if (a==b){
            System.out.println("Thus,the tournament ends in tie.");
        }
        else {
            System.out.println("Hence,System wins the tournament");
        }
    }
}
//note-a++ and ++a plays a very big role in this .please use it wisely.
