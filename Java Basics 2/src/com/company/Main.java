package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main method is running...");

        byte b=123;
        short s=565;
        int i=456;
//        long l1 = (long) b + (long) s + (long) i;
//        long l=50000-10*l1;
        long l=50000L-10L*(b+s+i);
        System.out.println(l);

//        byte b1=l;java: incompatible types: possible lossy conversion from long to byte
        byte b1=(byte)l;
        System.out.println(b1);
    }
}
