package com.company;

public class CWH_28_VAR_ARGS {
//    static int sum(int ...arr)//declaration of varargs
//            jab varargs use karte hain to kitna bhi arguments use karte hain
    static int sum(int x,int ...arr)
    {
        int result=x;
        //available as int[]arr -matlab ki ye available hai array of integers ke taur pe
        for (int a : arr){
            result +=a;
        }
        return  result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the tutorial of VarArgs");
        System.out.println("The sum of 4 and 5 is :"+sum(4,5));
        System.out.println("The sum of 4 and 5,8,3 and 9 is :"+sum(4,5,8,9,3));
        System.out.println("The sum of 4 and 5 and 7 is :"+sum(4,5,7));
      //  System.out.println(sum());//isme koi bhi argument nahi daalenge phir bhi chalega kyunki isme koi condition nahi hai
       // System.out.println(sum()); ye error dega kyunki iske kam se kam ek integer chahiye .ye condition apply ho chuka hai
        System.out.println(sum(1));
    }
}
