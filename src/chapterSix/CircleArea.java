//6.20 (Circle Area) Write an application that prompts the user for the radius of a circle and uses
//        a method called circleArea to calculate the area of the circle.

package chapterSix;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);

        System.out.print("Please enter the radius of your circle: ");
        double radius = input.nextDouble();
        System.out.println(df.format(circleArea(radius)));
    }

    private static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
