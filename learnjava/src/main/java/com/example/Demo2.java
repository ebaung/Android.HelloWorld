package com.example;

/**
 * Created by admin on 1/30/2016.
 */
public class Demo2 {

    public static void main(String[] args) {
        Enemy enemy = new Enemy(10, 3);
        System.out.println("Hitpoints: " + enemy.getHitPoints() + " Lives: " + enemy.getLives());

        Soldier soldier = new Soldier(25, 1);
        System.out.println("Hitpoints: " + soldier.getHitPoints() + " Lives: " + soldier.getLives());
        soldier.takeDamage(8);

        SuperSoldier superSoldier = new SuperSoldier(99, 1);
        System.out.println("Hitpoints: " + superSoldier.getHitPoints() + " Lives: " + superSoldier.getLives());
        superSoldier.takeDamage(8);

//        float theDamage = 5.0f;
//        superSoldier.takeDamage(theDamage);
    }

}
