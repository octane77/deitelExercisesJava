//6.25 (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example,
//2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
//a) Write a method that determines whether a number is prime.
//b) Use this method in an application that determines and displays all the prime numbers
//less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
//you’ve found all the primes?
//c) Initially, you might think that n/2 is the upper limit for which you must test to see
//whether a number n is prime, but you need only go as high as the square root of n. Rewrite
//the program, and run it both ways.

package chapterSix;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = input.nextInt();

        System.out.println(primeNumber(number));
    }

    private static int primeNumber(int number) {
        if (number % 3 != 0) {
            System.out.println("This is not a prime number");
        } else {
            System.out.println("This is a prime number");
        }

        return 0;
    }

//    private static int primeNumberRange() {
//        for (int i = 1; i < 10000; i++) {
//            if (i % 2 == 0) {
//                System.out.println("This is not a prime number");
//
//            } else {
//                System.out.println("This is a prime number");
//            }
//
//            return 0;
//        }

    }

