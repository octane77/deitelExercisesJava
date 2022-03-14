package chapterTwo;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {

        long worldPopulation;
        double worldPopulationGrowthRate;
        long worldPopulationInOneYear;
        long worldPopulationInTwoYears;
        long worldPopulationInThreeYears;
        long worldPopulationInFourYears;
        long worldPopulationInFiveYears;

        Scanner input = new Scanner( System.in );
        System.out.print( "Whats the current world population?: " );
        worldPopulation = input.nextLong();

        System.out.print( "Whats the current world population growth rate?: " );
        worldPopulationGrowthRate = input.nextDouble();
        worldPopulationGrowthRate = worldPopulationGrowthRate/100;

        worldPopulationInOneYear = (long) (worldPopulation + (worldPopulation * worldPopulationGrowthRate));
        System.out.println("World Population After 1 Year");
        System.out.println(worldPopulationInOneYear);

        worldPopulation = worldPopulationInOneYear;

        worldPopulationInTwoYears = (long) (worldPopulation + (worldPopulation * worldPopulationGrowthRate));
        System.out.println("World Population After 2 Years");
        System.out.println(worldPopulationInTwoYears);

        worldPopulation = worldPopulationInTwoYears;

        worldPopulationInThreeYears = (long) (worldPopulation + (worldPopulation * worldPopulationGrowthRate));
        System.out.println("World Population After 3 Years");
        System.out.println(worldPopulationInThreeYears);

        worldPopulation = worldPopulationInThreeYears;

        worldPopulationInFourYears = (long) (worldPopulation + (worldPopulation * worldPopulationGrowthRate));
        System.out.println("World Population After 4 Years");
        System.out.println(worldPopulationInFourYears);

        worldPopulation = worldPopulationInFourYears;

        worldPopulationInFiveYears = (long) (worldPopulation + (worldPopulation * worldPopulationGrowthRate));
        System.out.println("World Population After 5 Years");
        System.out.println(worldPopulationInFiveYears);
    }
}
