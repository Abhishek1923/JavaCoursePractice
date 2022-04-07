package com.company;

public class PrimitiveTypes {
    public static void main(String[] args) {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        int x=Integer.hashCode(10);
        System.out.println(min);
        System.out.println(max);
        System.out.println(x);
        System.out.println(max+3);//Overflow
        System.out.println(min+3);//in range as aspected
        System.out.println(min-3);//Underflow

        //int test=2147483648;//java: integer number too large
        //System.out.println(test);
        int test=2_147_483_647;//acceptable
        System.out.println(test);

        System.out.println("----------------------------------");

        byte maxValue=Byte.MAX_VALUE;
        byte minValue=Byte.MIN_VALUE;
        System.out.println(maxValue);
        System.out.println(minValue);
        
        long l=1L;
        long maxLong=Long.MAX_VALUE;
        long minLong=Long.MIN_VALUE;
        System.out.println(maxLong);
        System.out.println(minLong);

        //long nu=2147483648;//java: integer number too large
        long nu=2147483648L;//it runs perfectly


        System.out.println("--------------------------------------");

        boolean isAgeValid=true;
        System.out.println(isAgeValid);

        System.out.println("---------------------------------------");



    }
}
