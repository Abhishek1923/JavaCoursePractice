package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner sc=new Scanner(System.in);
        int sum = 0,average=0;
        boolean hasNextInt=sc.hasNextInt();

        while(true){
            if(hasNextInt){
                int n=sc.nextInt();
                sum+=n;
                if (hasNextInt==false){
                    break;
                }
            }
            sc.nextLine();
        }

        System.out.println(sum);
    }
}
