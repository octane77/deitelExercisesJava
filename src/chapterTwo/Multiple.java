//2.26 (Multiples) Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result.
//[Hint: Use the remainder operator.]

package chapterTwo;

import java.util.Scanner;

public class Multiple {
    public static void main( String args[]) {
        Scanner input = new Scanner( System.in );

        int firstNumber;
        int  secondNumber;

        System.out.print( "Enter first number: " );
        firstNumber = input.nextInt();

        System.out.print( "Enter second number: " );
        secondNumber = input.nextInt();

        if ( firstNumber % secondNumber == 0 )
            System.out.printf( "%d is a multiple of %d\n", firstNumber, secondNumber );

        if ( firstNumber % secondNumber != 0 )
            System.out.printf( "%d is not a multiple of %d\n", firstNumber, secondNumber );

    }
}
