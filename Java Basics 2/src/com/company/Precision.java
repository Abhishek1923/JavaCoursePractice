package com.company;

import java.text.DecimalFormat;

public class Precision {
    public static void main(String[] args) {
        int i=23;
//        float f=13.4;java: incompatible types: possible lossy conversion from double to float
        float f1=(float)12.3;//valid via casting
        float f=12.3f;
        double d=34.2d;
        System.out.println("Integer is: "+i/7);
        System.out.println("Float is: "+f/7);
        System.out.println("Double is:"+d/7);

//        for a particular precision we perform these operations
        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println(df.format(13.4511513545));
    }
}
