package com.company;

public class Switch {
    public static void main(String[] args) {
        char ch='E';
        switch (ch){
            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("C or D or E");
                System.out.println("Oh! Actually it is: "+ch);
                break;

            default:
                System.out.println("not found");
        }
    }
}
