package com.example;

/**
 * Created by admin on 1/30/2016.
 */
public class Demo3 {
    public static void main(String[] args) {
        int[]elements = {5, 7, 12, 100, -1,  8, 3};
        int indexPos = 0;
        int sumTotal = 0;

        System.out.println("elements.length = " + elements.length);

        while(indexPos < elements.length)
        {
            System.out.println("Processing indexPos " + indexPos + "; Value " + elements[indexPos]);

            if(elements[indexPos] > 99){
                indexPos +=1;
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
            indexPos++;
            //indexPos += 1;
        }
        System.out.println("Sum total was: " + sumTotal);
    }
}
