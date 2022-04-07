package com.company;

public class Casting {
    public static void main(String[] args) {

        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        int x=max/2;//it doesn't gives any error as java uses by default integer

        //byte y=max/2;//java: incompatible types: possible lossy conversion from int to byte

        byte maxValue=Byte.MAX_VALUE;
        byte minValue=Byte.MIN_VALUE;

        //byte b=(minValue/2);//java: incompatible types: possible lossy conversion from int to byte
        byte b=(byte)(minValue/2);
    }
}
