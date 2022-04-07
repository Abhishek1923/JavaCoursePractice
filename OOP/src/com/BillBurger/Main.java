package com.BillBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger=new Hamburger("Basic","Sausage","White",3.56);
        double price=hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato",.27);
        hamburger.addHamburgerAddition2("Lettuce",.28);
        hamburger.addHamburgerAddition3("Cheese",.30);

        System.out.println("Total burger price is "+hamburger.itemizeHamburger());


        HealthyBurger healthyBurger=new HealthyBurger("Bacon",5.2);

        healthyBurger.addHamburgerAddition1("Egg",1.2);
        healthyBurger.addHamburgerAddition2("Lentils",1.9);
        System.out.println("Total healthy burger price "+healthyBurger.itemizeHamburger());


        DeluxeBurger deluxeBurger=new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("HYG",2.3);

        System.out.println("Total deluxe burger price "+deluxeBurger.itemizeHamburger());

    }
}
