package chapterTwo;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weightInLbs;
        int heightInInches;

        Scanner input = new Scanner( System.in );
        System.out.print( "Enter your weight in Lbs: " );
        weightInLbs = input.nextDouble();

        System.out.print( "Enter your height in Inches: " );
        heightInInches = input.nextInt();

        double bmiWeight = weightInLbs * 703;
        int bmiHeight = heightInInches * heightInInches;

        double BMI = bmiWeight/bmiHeight;
        System.out.printf("Your body mass index is %.2f%n", BMI);

        System.out.println ("Underweight: less than 18.5");
        System.out.println ("Normal:      between 18.5 and 24.9");
        System.out.println ("Overweight:  between 25 and 29.9");
        System.out.println ("Obese:       30 or greater");
    }
}
