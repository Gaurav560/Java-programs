package com.company;

import java.util.Scanner;

public class CWH_30_PRACTICE_SET_FUNCTIONS {

    //q10-repeat q3 using iterative approach
    static int sum_iterative(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum +=i;
        }return sum;
    }

    //q9-celsius to degree conversion
//    static float temp(float celsius)
//    {
//        return (celsius*1.8f)+32;
//    }



    //q7-pattern 2 by recursion
//    static void pattern2_rec(int n){
//        if(n>0){
//            for (int i=1;i<=n;i++){
//                System.out.print("* ");
//            } System.out.println();
//            pattern2_rec(n-1);
//
//        }
//    }



    //q8-do q2 with recursion
//    static void pattern1_rec(int n){
//        if (n>0){
//            pattern1_rec(n-1);
//            for (int i=0;i<n;i++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }}






    //q6-average of set of a numbers passed as an arguments
//    static float avg(int ...arr){
//        float sum=0.0f;
//        for (int j : arr) {
//            sum += j;
//        }return sum/arr.length;
//    }



//    //q5-fibonacci series-method definition
////  static int fib(int n){
////        if (n==1){
////            return 0;
////        } else if (n==2) {
////            return 1;
////        }
//    //another short method of writing the code
//    if(n==1 || n==2){
//        return n-1;
//    }
//        else{
//        return fib(n-1)+fib(n-2);
//        }
//    }



    //q4-method definition
//    static void pattern2(int n){
//        for (int row=1;row<=n;row++){
//            for(int column=1;column<=n+1-row;column++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }



    //q3-method definition
//    static int sum(int n){
//        //base condition of recursion which helps to terminate recursion
//        if (n==1){
//         return 1;
//        }
//        else {
//    return  n+sum(n-1);
//    }}


    //q1-method definition
//    static void table(int n){
//     for(int i=1;i<=10;i++)
//     {
//         System.out.println( n+"*"+i+"="+n*i);
//     }
//    }




    //q2-method definition
//    static void pattern1(int n){
//        for (int row=1;row<=n;row++){
//            for (int column =1;column<=row;column++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //q1 -method call
//        int x=sc.nextInt();
//        System.out.println("the multiplication table of "+x+" is");
//          table(x);



        //q2 method call
//        System.out.println("Please enter the no of rows for which  the pattern will be displayed:");
//        int x=sc.nextInt();
//        pattern1(x);



//        //q3-method call
//        System.out.println("enter the natural no. up to which u need sum :");
//        int x= sc.nextInt();
//        System.out.println("the sum of "+x+" is:"+sum(x));
//        note-jab koi fn kisi class ke andar hota hai to usko method bolte hain



        //q4 method call
//        int x=sc.nextInt();
//        pattern2(x);



        //q5-method  call
//        int c=fib(5);
//        System.out.println(c);



        //q6 -method call for average
//        System.out.println("the average is :"+avg(4,5,6,9,5));




//        //q8-method call
//        int x=7;
//        pattern1_rec(x);



        //q7 method call
//        int x=9;
//        pattern2_rec(x);
//        System.out.print("enter the value in celsius:");
//        float x= sc.nextFloat();
//        System.out.print("Thus value of temperature in fahrenheit is:"+temp(x));


        //q10
        System.out.print("enter the natural no. upto which u want to add:");
        int x=sc.nextInt();
        System.out.println("the sum is:"+sum_iterative(x));
    }
}
