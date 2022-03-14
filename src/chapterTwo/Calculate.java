//2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user and prints their sum, product, difference and quotient (division). Use the techniques shown in Fig. 2.7.
package chapterTwo;

import java.util.Scanner;

public class Calculate {
    public static void main( String args[] ) {
        Scanner input = new Scanner( System.in );
        int number1;
        int number2;

        System.out.print( "Enter first integer: " );
        number1 = input.nextInt();

        System.out.print( "Enter second integer: " );
        number2 = input.nextInt(); // read second integer

        System.out.printf( "\nSum is %d\n", ( number1 + number2 ) );
        System.out.printf( "Product is %d\n", ( number1 * number2 ) );
        System.out.printf( "Difference is %d\n", ( number1 - number2 ) );
        System.out.printf( "Quotient is %d\n", ( number1 / number2 ) );
    }
}
