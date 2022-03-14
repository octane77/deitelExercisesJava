//(Exponentiation) Write a method integerPower(base, exponent) that returns the value of
//        base exponent
//        For example, integerPower(3, 4) calculates 34 (or 3 * 3 * 3 * 3). Assume that exponent is a positive,
//        nonzero integer and that base is an integer. Use a for or while statement to control the calculation.
//        Do not use any Math class methods. Incorporate this method into an application that reads
//        integer values for base and exponent and performs the calculation with the integerPower method.
//
package chapterSix;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int base = input.nextInt();
        System.out.print("Enter an exponent: ");
        int exponent = input.nextInt();
        System.out.println(integerPower(base, exponent));
    }

    private static int integerPower(int base, int exponent) {
        int result = 1;
        while (exponent != 0) {
            System.out.println(result = base*exponent);
            exponent--;
        }
        return -1;
    }
}
