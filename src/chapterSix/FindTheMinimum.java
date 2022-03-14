//6.23 (Find the Minimum) Write a method minimum3 that returns the smallest of three floating point
//numbers. Use the Math.min method to implement minimum3. Incorporate the method into an
//application that reads three values from the user, determines the smallest value and displays the result.

package chapterSix;

import java.util.Scanner;

public class FindTheMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Integer Values Below: ");
        double integer1 = input.nextDouble();
        double integer2 = input.nextDouble();
        double integer3 = input.nextDouble();
        System.out.println(minimumNumber(integer1, integer2, integer3));
    }

    private static double minimumNumber(double number1, double number2, double number3) {
        return Math.min(number1, (Math.min(number2, number3)));
    }
}
