package com.example;

/**
 * Created by admin on 1/30/2016.
 */

public class Demo4_For {
    public static void main(String[] args) {

            int[] elements = {5, 7, 12, 100, -1, 8, 3};
            int sumTotal = 0;

        System.out.println("elements.length = " + elements.length);


        for(int indexPos=0; indexPos < elements.length; indexPos++)

        {
            System.out.println("Processing " + indexPos + " ; Value = " + elements[indexPos]);

            if(elements[indexPos] > 99){
                System.out.println("Continue");
                continue;
            }

            if(elements[indexPos] < 0){
                System.out.println("Break!");
                System.out.println("negative number encountered. halting loop");
                break;
            }
            sumTotal = sumTotal + elements[indexPos];
            System.out.println("Sub Sum total = " +sumTotal);
        }

        System.out.println("Grand Sum total = " + sumTotal);

    }
}