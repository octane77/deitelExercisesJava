//6.16 (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
//        second integer is a multiple of the first. The method should take two integer arguments and return
//        true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
//        Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
//        time) and determines whether the second value in each pair is a multiple of the first.

package chapterSix;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number, or 0 to stop");
        int number = input.nextInt();
        while (number != 0) {
            System.out.println("Enter a divisor and a dividend integer below: ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            System.out.println(isMultiple(number1, number2));
        }
    }

    private static boolean isMultiple(int number1, int number2) {
        if(number2 % number1 == 0){
            return true;}
      else {
            return false;
        }
    }
}
