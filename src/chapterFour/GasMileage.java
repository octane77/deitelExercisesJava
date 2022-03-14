//4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//        kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//        a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//        The program should calculate and display the miles per gallon obtained for each trip and print the
//        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//        produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
//        data from the user.

package chapterFour;
import java.util.Scanner;

public class GasMileage {
    public void CalculateGasMileage() {
        Scanner input = new Scanner( System.in );
        int milesDriven;
        int gallonsUsed;
        int totalNumberOfMiles = 0;
        int totalNumberOfGallons = 0;

        double numberOfMilesPerGallon;
        double combinedNumberOfMilesPerGallon;

        System.out.println("How many miles did you drive? (-1 to quit): ");
        milesDriven = input.nextInt();

        while (milesDriven != -1 ) {
            System.out.println("How many gallons did you use? (-1 to quit): ");
            gallonsUsed = input.nextInt();

            totalNumberOfMiles += milesDriven;
            totalNumberOfGallons += gallonsUsed;

            if (gallonsUsed != 0) {
                numberOfMilesPerGallon = (double) milesDriven / gallonsUsed;
                System.out.printf("Miles Per Gallon per tank: %.2f%n", numberOfMilesPerGallon);
            }

            if (totalNumberOfGallons != 0) {
                combinedNumberOfMilesPerGallon = (double) totalNumberOfMiles / totalNumberOfGallons;
                System.out.printf("Total MPG: %.2f%n", combinedNumberOfMilesPerGallon);
            }

            System.out.print("How many miles did you drive? (-1 to quit): ");
            milesDriven = input.nextInt();

        }

        }

    }
