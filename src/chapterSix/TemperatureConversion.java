//(Temperature Conversions) Implement the following integer methods:
//a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
//calculation
//celsius = 5.0 / 9.0 * (fahrenheit - 32);
//b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
//the calculation
//fahrenheit = 9.0 / 5.0 * celsius + 32;
//c) Use the methods from parts (a) and (b) to write an application that enables the user either
//to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
//Celsius temperature and display the Fahrenheit equivalent.

package chapterSix;

import java.text.DecimalFormat;
import java.util.Scanner;


public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);

        System.out.print("Please enter a temperature in celsius: ");
        double temperatureCelsius = input.nextDouble();
        System.out.println(celsius(temperatureCelsius));

        System.out.print("Please enter a temperature in fahrenheit: ");
        double temperatureFahrenheit = input.nextDouble();
        System.out.println(df.format(fahrenheit(temperatureFahrenheit)));

        System.out.print("Please enter a temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Please enter a unit of measurement");
        System.out.print("Enter 1 for fahrenheit, 2 for celsius: ");
        int temperatureUnit = input.nextInt();

        System.out.println(df.format(temperatureConversion(temperatureUnit, temperature)));
    }

    private static double fahrenheit(double var) {
        return ((var - 32.0) * 5.0 / 9.0);
    }

    private static double celsius(double var) {
        return ((var * 9 / 5) + 32);
    }

    private static double temperatureConversion(int temperatureUnit, double temperature) {
        double conversion = 0;
        if (temperatureUnit == 1) {
            conversion = ((temperature - 32.0) * 5.0 / 9.0);
        } else {
            conversion = ((temperature * 9 / 5) + 32);
        }
        return conversion;
    }

}
