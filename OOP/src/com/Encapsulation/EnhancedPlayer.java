package com.Encapsulation;

public class EnhancedPlayer {
    private String name;
    private int hitman =100;//we can set default values
    //we change helath filed with hitman and it is not visible in main class
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0&&health<=100){//we can validate this field via encapsulation
            this.hitman = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitman =this.hitman -damage;
        if (this.hitman <=0) {
            System.out.println("Player Knocked Out");
        }
    }

    public int getHealth() {//we use this method without exposing what field we are using
        return hitman;
    }
}
