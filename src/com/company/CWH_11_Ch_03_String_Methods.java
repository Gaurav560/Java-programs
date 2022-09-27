package com.company;

import java.util.Scanner;

public class CWH_11_Ch_03_String_Methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String Methods
        String name="Gaurav";
       // System.out.println(name);
        //.length();
        //int length=name.length();
        //System.out.println(length);

        //.tolowercase();
        //String lstring=name.toLowerCase();
        //System.out.println(lstring);

        //.touppercase();
        //String lstring1=name.toUpperCase();
      //  System.out.println(lstring1);

        //.trim();
//        String nontrimmesstring="        Gaurav      ";
//        System.out.println(nontrimmesstring);
//        String trimmesstring=nontrimmesstring.trim();
//        System.out.println(trimmesstring);

        //.substring(n);-here n denotes from which index the new string is going to be started
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,5));//isme beginner wala index included rehta hai and last wala// index excluded rehta hai .

        //.relace('a','b');-a ko hata ke ba uski jagah pe aa jaayega string mein
        System.out.println(name.replace('a','s'));
        System.out.println(name.replace("av","sh"));
        System.out.println(name.replace("a","sharma"));
        //.startswith("xyz");-returns boolean always
        System.out.println(name.startsWith("Ga"));
        System.out.println(name.endsWith("av"));

        //name.charAt(n);-tells character at nth index
        System.out.println(name.charAt(2));

        //name.indexOf("string");-tells the index at which the string is found .it tells the first index
        System.out.println(name.indexOf("av"));
        System.out.println(name.indexOf("a"));
        //special case of above method
        //name.indexOf("string",n);-iska matlab hai jo nth index diya gaya hai us se string ka index dhoondna chaaloo karo .
        System.out.println(name.indexOf("a",3));
        System.out.println(name.indexOf("xyz",3));//agar koi substring use nahi mila to -1 return karega

        //.lastIndexOf("string");-it returns the last index of that string or character
        String modifiedName="Gauraraurav";
        System.out.println(modifiedName.lastIndexOf("ra"));
        System.out.println(modifiedName.lastIndexOf("a"));
        System.out.println(modifiedName.lastIndexOf("ra",6));
        //note-lastIndexOf last se search karna suru karta hai .aur agar index pehle se diya
        //hua hai ki yahan se search karna hai to index se 0 ki taraf tak search karo .

        //name.equals("string");-jab bhi string ke equal ko check karna ho to isi method
        //se check karna .== mat use karna .(always returns boolean value)
        System.out.println(name.equals("Gaurav"));
        System.out.println(name.equals("Gauravbh"));
        //special case-only checks the value .it ignores the uppercase or lowercase.
        System.out.println(name.equalsIgnoreCase("gaurav"));

        //new topic-escape sequence characters.
        //eg: \n,\t,\',\",\\ etc
        System.out.println("i am going to be king of dsa\"s in 6 months");
        System.out.println("i am going to be king of dsa\\ in 6 months");
        System.out.println("i am going to be king of dsa\n in 6 months");
        System.out.println("i am going to be king of dsa\t in 6 months");
        System.out.println("i am going to be king of dsa\' in 6 months");
    }
}
