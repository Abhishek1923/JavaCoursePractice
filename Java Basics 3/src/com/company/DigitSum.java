package com.company;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }
    public static int sumDigits(int number){
        int sum=0;
        if (number<10){
            return -1;
        }
        while(number>0){
            int rem=number%10;
            sum+=rem;
            number/=10;
        }
        return sum;
    }
}
