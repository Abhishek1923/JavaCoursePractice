package com.company;

import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to get their respective character/symbol: ");
        int num=sc.nextInt();
        String str = Character.toString((char)num);
        System.out.println("The character/symbol for "+num+" is: "+str);
    }
}
