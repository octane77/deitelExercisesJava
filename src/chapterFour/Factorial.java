//4.37 (Factorial) The factorial of a nonnegative integer n is written as n! (pronounced “n factorial”)
//and is defined as follows:
//n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1)
//        and
//        n! = 1 (for n = 0)
//        For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
//        a) Write an application that reads a nonnegative integer and computes and prints its factorial.
//        b) Write an application that estimates the value of the mathematical constant e by using
//        the following formula. Allow the user to enter the number of terms to calculate.
//        c) Write an application that computes the value of ex by using the following formula. Allow
//        the user to enter the number of terms to calculate.
//
//

package chapterFour;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}