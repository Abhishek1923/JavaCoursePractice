package com.company;

public class FistAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static int isPalindrome(int number){
        int ld=number%10;
        int fd=0;
        while(number>=10){
            number=number/10;
        }
        return ld+number;
    }
}
