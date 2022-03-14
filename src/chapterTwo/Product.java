//2.6 Using the statements you wrote in Exercise 2.5, write a complete program that calculates and prints the product of three integers.

        package chapterTwo;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        int  x;
        int  y;
        int  z;
        int  result;

        System.out.print( "Enter first integer: " );
        x = input.nextInt();

        System.out.print( "Enter second integer: " );
        y = input.nextInt();

        System.out.print( "Enter third integer: " );
        z = input.nextInt();

        result = x * y * z;
        System.out.printf( "Product is %d\n", result );
    }
}