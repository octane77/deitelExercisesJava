//5.12 (Calculating the Product of Odd Integers) Write an application that calculates the product
//        of the odd integers from 1 to 15.
package chapterFive;

public class CalculatingTheProductOfOddIntegers {
    public static void main(String[] args) {
        int number = 0;
        for (number = 1; number <= 15; number++) {
            if ( number % 2 != 0 ){
                int product = number * number;
                System.out.printf("%d, %d%n", number, product);
        }
    }
    }
}