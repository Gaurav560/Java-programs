package com.company;

public class CWH_23_Array_for_each_loop {
    public static void main(String[] args) {
//        int[]marks={44,55,67,45,23};
//        float[]marks={33.2f,55.6f,77.6f,89.2f,55.6f};
//        System.out.println(marks[2]);
//        System.out.println(marks.length);

//        String[]students={"harish","rohan","gaurav","shweta"};
//        System.out.println(students.length);
        //array.length gives the length of that array


        int[]marks={44,55,67,45,23,44,33,55,77,77,77,66,44,22,44,11,88,99};
        //displaying the array(Naive Method)
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);


        //displaying the array using for loop
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);//also called array traversing

            //displaying the array in reverse order using for loop
//            for(int i=marks.length-1;i>=0;i--){
//                System.out.println(marks[i]);}

        //displaying the array using for-each loop
        for (int element:marks){
            System.out.println(element);
            //for each loop is inserted recently in new java version .it has a very small
            //way of displaying all the elements in an array.agar index ka koi use nahi hai to
            //is for each loop ka istemaal kar sakte hain.only element available in this loop.
        }
        }
    }

