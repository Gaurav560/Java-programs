package com.company;

public class CWH_26_Methods {
  static int logic(int x,int y)//a function named logic is created .
    //fn ko hm isiliye banate hain taaki baar hmko use define na karna pade. aur hm baar baar use kar sake.
            //static method se sirf static method  hi call ho sakta hai. non static method call nahi ho sakta hai.
    {
        int z;
        if(x>y){
            z=x+y;
        }else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=4;
        int b=54;
        //Method invokation using object creation
      //  CWH_26_Methods obj=new CWH_26_Methods();
        //int c= obj.logic(a, b);
        int c=logic(a,b);
        int a1=51;
        int b1=21;
      //  int c1= obj.logic(a1, b1);
        int c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
