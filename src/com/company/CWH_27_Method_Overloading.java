package com.company;

public class CWH_27_Method_Overloading {
    static void foo(int e,int f ){
        System.out.println(e+f);
    }
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int x)//yahan x parameter hai .isko value milegi.abhi milli nahi hai
    {
        System.out.println("Good Morning "+ x +" Bro! ");
    }
    static void change2(int[]arr){
        arr[0]=98;
    }
    static void change1(int a){
        a=98;
    }
    static void tellJoke()//is tellJoke fn ka return type void hai matlab ye function kuch bhi return nahi karega bas screen pe kuch display kar dega.

    {
        System.out.println("I am the patience class!");
    }

    public static void main(String[] args)//program ka execution start hota hai main method se.
    {
//        tellJoke();
        //case-1 changing the integer(ye to change nahi hua kyunki value ki copy change ho rahi thi .original value ko change nahi kar rahe hain hum )
//        int x=45;
//        change1(x);
//        System.out.println("The value of x after change is : "+x);

        //case-2
        //changing an element of an array
//        int[]marks={33,45,67,89,90};
//        change2(marks);
//        System.out.println("The value of array at oth index is :"+marks[0]);


        //Method Overloading
foo(4);//x=4 yeh argumnet hai(arguments are actual)



    }
}

