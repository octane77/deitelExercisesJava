//2.35 (Car-Pool Savings Calculator) Research several car-pooling websites. Create an application
//that calculates your daily driving cost, so that you can estimate how much money could be saved by
//carpooling, which also has other advantages such as reducing carbon emissions and reducing traffic
//congestion. The application should input the following information and display the user’s cost per
//day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.

package chapterTwo;

import java.util.Scanner;

public class CarPoolSavingsCalculator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("What's the total number of miles you drive per day?: ");
        double totalDailyMileage = keyboardInput.nextDouble();

        System.out.print("What's the cost of a gallon of gasoline?: ");
        double gasolinePrice = keyboardInput.nextDouble();

        System.out.print("What's the average distance you drive using a gallon of gasoline?: ");
        double averageGasolineMileage = keyboardInput.nextDouble();

        System.out.print("How much do you spend on Parking fees daily?: ");
        double dailyParkingCost = keyboardInput.nextDouble();

        System.out.print("How much do you pay in toll fees per day?: ");
        double dailyTollage = keyboardInput.nextDouble();

        double totalGasolineUsed = totalDailyMileage / averageGasolineMileage;
        double totalCostOfGasoline = totalGasolineUsed * gasolinePrice;
        double totalCostPerDay = totalCostOfGasoline + dailyParkingCost + dailyTollage;

        System.out.printf("Daily Gasoline Cost is $%.2f%n",totalCostOfGasoline);
        System.out.printf("Daily Cost of driving to work including Parking fees & Toll fees is $%.2f ", totalCostPerDay);

    }
}
