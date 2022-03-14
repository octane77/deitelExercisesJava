package chapterThree;

import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car(null, null, 0.0);
        Car car1 = new Car(null, null, 0.0);
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the name and Model of the Car: ");
        String theNameOfTheCar = input.nextLine();
        car.setModel(theNameOfTheCar);

        System.out.print("Please enter the name and Model of the Car: ");
        String theNameOfTheCar1 = input.nextLine();
        car1.setModel(theNameOfTheCar1);

        System.out.print("Please enter the year it was made: ");
        String theCarsProductionYear = input.nextLine();
        car.setYear(theCarsProductionYear);

        System.out.print("Please enter the year it was made: ");
        String theCarsProductionYear1 = input.nextLine();
        car.setYear(theCarsProductionYear1);

        System.out.print("Please enter the MSRP: ");
        Double theCarsMsrp = input.nextDouble();
        car.setPrice(theCarsMsrp);

        System.out.print("Please enter the MSRP: ");
        Double theCarsMsrp1 = input.nextDouble();
        car.setPrice(theCarsMsrp1);

        long discountMsrp= 5/100;
        long discountMsrp1= 7/100;

        double finalPurchaseAmount = car.getPrice() - (car.getPrice() * discountMsrp);
        double finalPurchaseAmount1 = car1.getPrice() - (car1.getPrice() * discountMsrp1);
        System.out.printf("Final Price: %f%n", finalPurchaseAmount);
        System.out.printf("Final Price: %f%n", finalPurchaseAmount1);

    }
}
