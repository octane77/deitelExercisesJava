//2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains them from the user and displays the larger number followed by the words "is larger". If the numbers are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.

package chapterTwo;

import java.util.Scanner;

public class largerNumber {
        public static void main( String args[] ) {
            Scanner input = new Scanner(System.in);
            int number1;
            int number2;

            System.out.print( "Enter first integer: " );
            number1 = input.nextInt();

            System.out.print( "Enter second integer: " );
            number2 = input.nextInt();

            if ( number1 > number2 )
                System.out.printf( "%d is larger\n", number1 );

            if ( number1 < number2 )
                System.out.printf( "%d is larger\n", number2 );

            if ( number1 == number2 )
                System.out.println( "These numbers are equal\n" );
        }
    }
