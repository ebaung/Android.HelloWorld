package com.example;

/**
 * Created by admin on 1/30/2016.
 */
public class SuperSoldier extends Enemy {
    public SuperSoldier (int hitPoints, int lives){
        super(hitPoints, lives);

    }

//    public void takeDamage(float damage){
//        System.out.println("takeDamage called");
//
//    }

    public void takeDamage(int damage){
        super.takeDamage(damage / 2);
    }

//    public void takeDamage (String damage){}

}
