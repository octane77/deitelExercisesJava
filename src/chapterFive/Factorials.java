//5.13 (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
//        integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
//        1 to n. Write an application that calculates the factorials of 1 through 20. Use type long. Display the
//        results in tabular format. What difficulty might prevent you from calculating the factorial of 100?

package chapterFive;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long factorial = 1;
        int counter = 1;
        int number = 20;

        for (counter = 1; counter <=number; counter++){
            factorial *= counter;
            System.out.println("The factorial of " + counter + " is " + factorial);
        }
    }
}
