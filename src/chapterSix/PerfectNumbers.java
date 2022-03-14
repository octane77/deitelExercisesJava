//6.24 (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
//1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
//1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
//Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
//the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing
//power of your computer by testing numbers much larger than 1000. Display the results.

package chapterSix;
import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int number = input.nextInt();
        System.out.println(isPerfect(number));
        System.out.println(perfectNumber());
    }

    private static boolean perfectNumber() {
        for (int i = 1; i < 10000; i++){
            if (isPerfect(i)){
            System.out.printf("%d\n", i);}
        }
        return true;
    }

    private static boolean isPerfect(int number) {
        int potentiallyPrime = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                potentiallyPrime = potentiallyPrime + i;
            }
        }

        return potentiallyPrime == number;
    }
}
