//4.30 (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
//        For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
//        and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
//        If the number is not five digits long, display an error message and allow the user to enter
//        a new value.

package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer;
        boolean palindrome = false;

        while (!palindrome) {
            System.out.print("Enter a five digit integer: ");
            integer = input.nextInt();

            int int1 = integer / 10_000;
            int int2 = integer % 10_000 / 1000;
            int int3 = integer % 10_000 % 1000 / 100;
            int int4 = integer % 10_000 % 1000 % 100 / 10;
            int int5 = integer % 10_000 % 1000 % 100 % 10;

            if (int1 == int5 & int2 == int4) {
                System.out.printf("%d is a Palindrome", integer);
                palindrome = true;
            } else {
                System.out.printf("%d isn't a Palindrome\n", integer);
            }
        }
    }
}