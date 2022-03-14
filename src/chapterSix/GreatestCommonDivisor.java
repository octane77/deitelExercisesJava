//6.27 (The Greatest Common Divisor) The greatest common divisor (GCD) of two integers is the largest
//        integer that evenly divides each of the two numbers. Write a method gcd that returns the greatest
//        common divisor of two integers. [Hint: You might want to use Euclid’s algorithm. You can find
//        information about it at en.wikipedia.org/wiki/Euclidean_algorithm.] Incorporate the method
//        into an application that reads two values from the user and displays the result.

package chapterSix;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program finds the greatest common divisor (GCD) of two integers");
        System.out.print("Enter an integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter another integer: ");
        int number2 = input.nextInt();
        System.out.println(GCD(number1, number2));
    }

    private static int GCD(int number1, int number2) {
        int i;
        int j;
        for(i = 1; i < number1; i++){
            if(number1 % i == 0){
                System.out.println(i);
            }
        }

        System.out.println();
        for(j = 1; j < number2; j++){
            if(number2 % j == 0){
                System.out.println(j);
            }
        }

        if(i==j){
            System.out.println("R");
        }

        return 0;
    }
}
