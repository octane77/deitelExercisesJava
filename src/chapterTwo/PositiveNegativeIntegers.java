//2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbers input and the number of zeros input.

package chapterTwo;

import java.util.Scanner;

public class PositiveNegativeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int inputIntegers;
        int positiveInteger = 0,
                negativeInteger = 0,
                zeroValue = 0;

        System.out.print("Enter first integer: ");
        inputIntegers = input.nextInt();

        if (inputIntegers == 0);
        zeroValue+=1;

        if (inputIntegers<0);
        negativeInteger+=1;

        if (inputIntegers>0);
        positiveInteger+=1;

        System.out.print("Enter second integer: ");
        inputIntegers = input.nextInt();
        if (inputIntegers == 0);
        zeroValue+=1;

        if (inputIntegers<0);
        negativeInteger+=1;

        if (inputIntegers>0);
        positiveInteger+=1;

        System.out.print("Enter third integer: ");
        inputIntegers = input.nextInt();
        if (inputIntegers == 0);
        zeroValue+=1;

        if (inputIntegers<0);
        negativeInteger+=1;

        if (inputIntegers>0);
        positiveInteger+=1;

        System.out.print("Enter fourth integer: ");
        inputIntegers = input.nextInt();
        if (inputIntegers == 0);
        zeroValue+=1;

        if (inputIntegers<0);
        negativeInteger+=1;

        if (inputIntegers>0);
        positiveInteger+=1;

        System.out.print("Enter fifth integer: ");
        inputIntegers = input.nextInt();
        if (inputIntegers == 0);
        zeroValue+=1;

        if (inputIntegers<0);
        negativeInteger+=1;

        if (inputIntegers>0);
        positiveInteger+=1;

        System.out.printf("Zero values %d", zeroValue);
        System.out.printf("Positive Integers %d", positiveInteger);
        System.out.printf("Negative Integers %d", negativeInteger);
    }

}
