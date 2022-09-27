package com.company;

import java.util.Scanner;

public class CWH_25_Practice_set_arrays {
    public static void main(String[] args) {

        //q1-create an array of five floats and print their sum
//        float[]number={33.3f,14.3f,55.50f,33.28f,47.22f};
//        float sum =0;
//        for (int i=0;i<number.length;i++){
//           sum +=number[i];
//        }
//        System.out.println(sum);


        //q2-program to find out whether a given integer is present in array or not
//        int[]array={44,55,33,22,55,45,76,54,11,14};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number which u want to check in array: ");
//        int new_num=sc.nextInt();
//        boolean isInArray=false;
//        for (int i=0;i< array.length;i++){
//            if(new_num==array[i]){
//              isInArray=true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("the element is present in the array.");
//
//        }else {
//            System.out.println("the element is not present in the array.");
//        }

        //q3-calculate the average marks of physics stored in array.
//        float sum=0;
//        float []marks={44.5f,78.67f,99.78f,88.67f,79.89f};
//        for (float element:marks){
//            sum +=element;
//        }
//        System.out.println(sum);
//        System.out.println(marks.length);
//        System.out.println("the average marks in physics is"+sum/ marks.length);

        //q4-program to add two matrices of 2*3
        //my method is very long as i am initializing every element one by one.
//        int[][]m1=new int[2][3];
//        m1[0][0]=45;
//        m1[0][1]=46;
//        m1[0][2]=47;
//        m1[1][0]=48;
//        m1[1][1]=49;
//        m1[1][2]=50;
//        int[][]m2=new int[2][3];
//        m2[0][0]=51;
//        m2[0][1]=52;
//        m2[0][2]=53;
//        m2[1][0]=54;
//        m2[1][1]=55;
//        m2[1][2]=56;
//        int [][]m3=new int[2][3];
//       m3[0][0]=m1[0][0]+m2[0][0];
//       m3[0][1]=m1[0][1]+m2[0][1];
//       m3[0][2]=m1[0][2]+m2[0][2];
//       m3[1][0]=m1[1][0]+m2[1][0];
//       m3[1][1]=m1[1][1]+m2[1][1];
//       m3[1][2]=m1[1][2]+m2[1][2];
//       for (int i=0;i< m3.length;i++){
//           for (int j=0;j<m3[i].length;j++){
//               System.out.print(m3[i][j]);
//               System.out.print(" ");
//           }
//           System.out.print("\n");
//       }


        //q4-sir's method
//        int[][]mat1={{1,2,3},
//                     {4,5,6}};
//        int [][]mat2={{7,8,9},
//                     {1,11,23}};
//        int [][]mat3={{0,0,0},
//                     {0,0,0}};
//        for (int i=0;i< mat1.length;i++){
//            for (int j=0;j<mat1[i].length;j++){
//                System.out.print(mat3[i][j]=mat1[i][j]+mat2[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }

//        //q5-program to reverse an array
//        int []arr={11,22,33,44,55,66,77,88,99};
//       int a= Math.floorDiv(arr.length,2);//ye function yaad rakhna math.floordiv
//        //use this for greatest integer function
//        System.out.println(a);
//        int temp=0;
//        for (int i=0;i<a;i++){
//            temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//        for (int j=0;j<arr.length;j++){
//        System.out.print(arr[j]);
//            System.out.print(" ");
//        }


//        //q6-program to find maximum in an array
        //this is my approach
//        int []arr={77,44,55,66,998,10000,5,66,34,56};
//        int temp=0;
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[i]>arr[i+1]){
//                temp=arr[i];
//              arr[i]=arr[i+1];
//              arr[i+1]=temp;
//            }
//        }
//        System.out.println(arr[arr.length-1]);


        //harry's approach
//        int []arr={77,44,-44,-99,55,66,998,10000,5,66,34,56};
//        int max=Integer.MIN_VALUE;
//        for (int element:arr){
//            if (element>max){
//                max=element;
//            }
//        }
//        System.out.println(max);



        //q7-program to find minimum in an array
//        int []arr={77,44,55,66,998,10000,5,66,34,-33,56};
//        int mIN=Integer.MAX_VALUE;
//        for (int element:arr){
//            if (element<mIN){
//                mIN=element;
//            }
//        }
//        System.out.println(mIN);
        //q8-write a java program to find whether an array is sorted or not
        int []arr={77,44,55,66,998,10000,5,66,34,-33,56};
//        int []arr={33,44,55,66,77};
        boolean isSorted=true;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
        System.out.println("this array is sorted.");}
        else {
            System.out.println("this array is not sorted");
        }


    }
}
