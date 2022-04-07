package com.Encapsulation;

public class Main {
    public static void main(String[] args) {

        //WITHOUT ENCAPSULATION
//        Player player=new Player();
//        player.name="Ak";
//        player.health=21;//if we forgot to access any field then it shows error because we can't initialize it, this can use constructor
//        player.weapon="Sword";
//
//        int damage=2;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health "+player.healthRemaining());
//
//        damage=20;
//        player.health=200;//it opens our application by accessing the methods directly (:not using encapsulation)
//        player.loseHealth(damage);
//        System.out.println("Remaining Health "+player.healthRemaining());

        //WITH ENCASULAITON

        EnhancedPlayer enhancedPlayer=new EnhancedPlayer("Ak",50,"Hammer");
        System.out.println("Initial health is "+enhancedPlayer.getHealth());//50 as it is valid

        EnhancedPlayer enhancedPlayer1=new EnhancedPlayer("Ak",200,"Hammer");
        System.out.println("Initial health is "+enhancedPlayer1.getHealth());//100 as 200 is invalid


    }
}
