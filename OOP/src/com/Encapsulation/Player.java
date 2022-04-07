//WITHOUT ENCAPSULATION

package com.Encapsulation;

public class Player {
    public String name;//if we change this field the main method shows error because we are using this field directly
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health=this.health-damage;
        if (this.health<=0) {
            System.out.println("Player Knocked Out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
