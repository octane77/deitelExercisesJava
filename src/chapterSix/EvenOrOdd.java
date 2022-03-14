//6.17 (Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
//whether an integer is even. The method should take an integer argument and return true if the integer
//is even and false otherwise. Incorporate this method into an application that inputs a sequence
//of integers (one at a time) and determines whether each is even or odd.

package chapterSix;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please an integer: ");
        int number = input.nextInt();
        EvenOrOddMethod(number);
    }

    public static void EvenOrOddMethod(int number) {
        String even;
        if (number % 2 == 0) {
            even = "This number is even";
            System.out.println(even);
        }

        else {
            String odd = "Number is odd";
            System.out.println(odd);
        }
    }
}
