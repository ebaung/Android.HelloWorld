package com.example;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        /*L29: Java Tutorial 1

        System.out.println("Hello, world. How are you?");
        String testMessage = "This is another test.";
        String mySecondMessage = " demo";

        System.out.println(testMessage);
        System.out.println(testMessage+mySecondMessage);

        int firstNumber = 55;
        int secondNumber = 5;

        int result = (firstNumber+secondNumber)*5;
        System.out.println("("+firstNumber + " + " + secondNumber + ")" + " *5 = " +result);

        double myValue = 1234.56789;
        double mySecondValue = 3.5594588587475;
        System.out.println(myValue+mySecondValue);*/

        //L30: Java Tutorial 2
        /* exercise1
        int lives = 3;
        boolean isGameOver = (lives<1);

        System.out.println(isGameOver);
        //if(lives<1)
        if(isGameOver)
            System.out.println("Game Over!");
            else
            System.out.println("You're Still Alive");*/
        //byte, short, long

        //exercise2
       /* Player eugene = new Player();
        System.out.println(eugene.getHandleName());
        eugene.setHandleName("Eugene Baung");
        System.out.println(eugene.getHandleName());

        Player louise = new Player("Louise");
        System.out.println(louise.getHandleName());
        louise.setLevel(5);
        System.out.println(louise.getLevel());*/

        //L31: Java Tutorial 3
        //exercise2
        Player eugene = new Player();
        eugene.setNameandLevel("Eugene", 71);
        System.out.println(eugene.getHandleName());
        System.out.println(eugene.getLevel());

//        Player louise = new Player("Louise");
//        System.out.println(louise.getHandleName());

        Weapon myAxe = new Weapon("The Shining Axe", 45, 200);
        eugene.setWeapon(myAxe);
        System.out.println(eugene.getWeapon().getName());
        InventoryItem redPotion = new InventoryItem(ItemType.POTION, "Red Potion");
        eugene.addInventoryItem(redPotion);
        eugene.addInventoryItem(new InventoryItem(ItemType.ARMOR, "+3 Chest Armor"));
        eugene.addInventoryItem(new InventoryItem(ItemType.RING, "+2 Ring of Protection"));
        eugene.addInventoryItem(new InventoryItem(ItemType.POTION, "Invisibility Potion"));

        InventoryItem bluePotion = new InventoryItem(ItemType.POTION, "Blue Potion");

        boolean wasDeleted = eugene.dropInventoryItem(redPotion);
        System.out.println(wasDeleted);

        ArrayList<InventoryItem> allItems = eugene.getInventoryitems();
        for (InventoryItem item : allItems) {
            System.out.println(item.getName());

        }

    }
}
