package com.company;
import java.util.Scanner;
public class CWH_18_While_loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.println("printing form 100 to 200:");
        //while loop
//        int i=100;
//while(i<=200){
//    System.out.println(i);
//    i++;
//}

        //do-while loop(isme ek baar to kam se kam program run hota hai .uske baad condition check hoti hai )
//        int b=4;
//        do {
//            System.out.println(b);
//            b++;
//        }while (b<5);
//note-do ke andar body hota hai.while ke andar sirf condition hota hai .do pehle aata hai .

    //program to print first n natural numbers.
        System.out.println("enter the number upto which u want to print:");
        int number=sc.nextInt();
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i<=number);
    }

}