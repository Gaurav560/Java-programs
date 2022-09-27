package com.company;

public class CWH_29_RECURSION //recursive approach
{
//    static int factorial(int x){
//        if (x==0 || x==1){
//            return 1;
//        }
//        else {
//        return x*factorial(x-1);
//        }

   // }
   static int factorial_iterative(int x)//iterative approach
   {
       if (x==0 || x==1){
           return 1;
       }
       else {
           int fact=1;
           for (int i=1;i<=x;i++){
               fact *=i;
           }
           return fact;
       }

       }

       public static void main(String[] args) {
        int gaurav;
        gaurav=6;
        System.out.println("the value of factorial x is "+ factorial_iterative(gaurav));
    }
}
