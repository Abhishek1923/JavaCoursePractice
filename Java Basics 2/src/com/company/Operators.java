package com.company;

public class Operators {
    public static void main(String[] args) {
        int a=41,b=52;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("--------------");
        System.out.println(a++);
        System.out.println(a);

        b%=a;//because a=42,b=52 so remainder is 10
        System.out.println(b);

        System.out.println("-----------------");

        boolean C=false;
        if (C==false)
            System.out.println("it is true");
            System.out.println("so it is printing.");
        System.out.println("--------------------");
        if (C==true)
            System.out.println("this statement is not printing");
            System.out.println("But this is....");

        System.out.println("----------------");
        if (C==true) {
            System.out.println("if we use codeblocks");
            System.out.println("the both gets printed or none.");
        }

        System.out.println("-----------------");

        //Logical 'and' and 'or' operators

        int top=89;
        if (top>=50&&top<100){
            System.out.println("Pass");
        }

        if (top>50||top==50){
            System.out.println("Pass");
        }

        System.out.println("------------");

        if (C=true) {
            System.out.println("This sets the value of C to true and prints this statment.");
        }

        System.out.println("-----------");

        boolean Cis=C?true:false;
        System.out.println(Cis);//as C is set to true so it prints true
    }
}
