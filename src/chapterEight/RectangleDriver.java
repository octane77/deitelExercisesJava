package chapterEight;

import java.util.Scanner;

public class RectangleDriver {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        RectangleClass rectangle = new RectangleClass(1, 1);

        System.out.print("Rectangle length: ");
        double rectangleLength = keyboardInput.nextInt();
        rectangle.setLength(rectangleLength);

        System.out.print("Rectangle width: ");
        double rectangleWidth = keyboardInput.nextInt();
        rectangle.setWidth(rectangleWidth);

        System.out.println("Rectangle Perimeter is: " + rectanglePerimeter(rectangle.getLength(), rectangle.getWidth()));
        System.out.println("Rectangle Area is: " + rectangleArea(rectangle.getLength(), rectangle.getWidth()));
    }

    private static double rectangleArea(double length, double width) {
        return length * width;
    }

    private static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }


}
