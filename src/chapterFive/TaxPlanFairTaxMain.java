package chapterFive;

import java.util.Scanner;

public class TaxPlanFairTaxMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaxPlanFairTax fairTax = new TaxPlanFairTax(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);

        System.out.print("Please enter your housing costs: ");
        double housingCost = input.nextDouble();
        fairTax.setHousing(housingCost);

        System.out.print("Please enter your feeding expenses: ");
        double foodCost = input.nextDouble();
        fairTax.setFood(foodCost);

        System.out.print("Please enter your clothing costs: ");
        double clothingCost = input.nextDouble();
        fairTax.setClothing(clothingCost);

        System.out.print("Please enter your education costs: ");
        double educationCost = input.nextDouble();
        fairTax.setEducation(educationCost);

        System.out.print("Please enter your transportation costs: ");
        double transportationCost = input.nextDouble();
        fairTax.setTransportation(transportationCost);

        System.out.print("Please enter your healthcare expenses: ");
        double healthCareCosts = input.nextDouble();
        fairTax.setHealthCare(healthCareCosts);

        System.out.print("Please enter your vacation expenses: ");
        double vacationCost = input.nextDouble();
        fairTax.setVacations(vacationCost);

        estimatedFairTax(fairTax.getClothing());
        estimatedFairTax(fairTax.getEducation());
        estimatedFairTax(fairTax.getFood());
        estimatedFairTax(fairTax.getHealthCare());
        estimatedFairTax(fairTax.getHousing());
        estimatedFairTax(fairTax.getVacations());
        estimatedFairTax(fairTax.getTransportation());

    }
    public static void estimatedFairTax(double amount) {
        double fairTaxRate = 0.3;
        System.out.println("Estimated FairTax Due: "+ amount * fairTaxRate);
    }
}