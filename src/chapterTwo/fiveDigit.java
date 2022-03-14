//2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits separated from one another by three spaces each. For example, if the user types in the number 42339, the program should print
//
//        4 2 3 3 9
//
//        Assume that the user enters the correct number of digits. What happens when you enter a number with more than five digits?
//        What happens when you enter a number with fewer than five digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter.
//        You’ll need to use both division and remainder operations to “pick off ” each digit.]
//
package chapterTwo;

import java.util.Scanner;

public class fiveDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int fiveIntegers;
        int int1, int2, int3, int4, int5;
        System.out.print("Enter a five digit integer: ");
        fiveIntegers = input.nextInt();

        int1 = fiveIntegers/10_000;
        int2 = fiveIntegers%10_000/1000;
        int3 = fiveIntegers%10_000%1000/100;
        int4 = fiveIntegers%10_000%1000%100/10;
        int5 = fiveIntegers%10_000%1000%100%10;

        System.out.printf("%d, %d, %d, %d, %d, %d", fiveIntegers, int1, int2, int3, int4, int5);
    }


}
