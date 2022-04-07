package com.company;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int number){
        int num=number;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=(sum*10)+rem;
            num/=10;
        }
        if(sum==number) {
            return true;
        }else {
            return false;
        }
    }
}
