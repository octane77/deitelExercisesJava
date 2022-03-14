//4.39 (World Population Growth) World population has grown considerably over the centuries.
//        Continued growth could eventually challenge the limits of breathable air, drinkable water, arable
//        cropland and other limited resources. There’s evidence that growth has been slowing in recent years
//        and that world population could peak some time this century, then start to decline.
//        For this exercise, research world population growth issues online. Be sure to investigate various
//        viewpoints. Get estimates for the current world population and its growth rate (the percentage by
//        which it’s likely to increase this year). Write a program that calculates world population growth
//        each year for the next 75 years, using the simplifying assumption that the current growth rate will stay
//        constant. Print the results in a table. The first column should display the year from year 1 to year
//        75. The second column should display the anticipated world population at the end of that year.
//        The third column should display the numerical increase in the world population that would occur
//        that year. Using your results, determine the year in which the population would be double what it
//        is today, if this year’s growth rate were to persist.

package chapterFour;

import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        long worldPopulation;
        double worldPopulationGrowthRate;

        Scanner input = new Scanner(System.in);
        System.out.print( "Whats the current world population?: " );
        worldPopulation = input.nextLong();

        System.out.print( "Whats the current world population growth rate?: " );
        worldPopulationGrowthRate = input.nextDouble();
        worldPopulationGrowthRate = worldPopulationGrowthRate/100;

        int year;
        for(year = 1; year <= 75; year++){
            long currentWorldPopulation = (long) (worldPopulation + (worldPopulation * worldPopulationGrowthRate) * year);
            System.out.printf("\tYear\tWorld Population\n");
            System.out.printf("\t%d\t\t%d\n",year, currentWorldPopulation);
        }


        System.out.println("Java is fun");
        System.out.print("Hello");
        System.out.println("World");
    }
}
