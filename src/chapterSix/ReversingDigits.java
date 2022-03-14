//6.26 (Reversing Digits) Write a method that takes an integer value and returns the number with
//its digits reversed. For example, given the number 7631, the method should return 1367. Incorporate
//the method into an application that reads a value from the user and displays the result.

package chapterSix;

import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four digit integer: ");
        int integer = input.nextInt();
        digitsReversed(integer);
    }

    private static void digitsReversed(int integer) {
        int int1, int2, int3, int4;
        int1 = integer/10_000;
        int2 = integer%10_000/1000;
        int3 = integer%10_000%1000/100;
        int4 = integer%10_000%1000%100/10;

int1 = int4;

    }
}
