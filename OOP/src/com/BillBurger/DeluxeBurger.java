package com.BillBurger;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Bacon", "White", 15.1);
        super.addHamburgerAddition1("Chips",1.2);
        super.addHamburgerAddition2("Drinks",2.2);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Sorry! Can't add items in deluxe.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Sorry! Can't add items in deluxe.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Sorry! Can't add items in deluxe.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Sorry! Can't add items in deluxe.");
    }
}
