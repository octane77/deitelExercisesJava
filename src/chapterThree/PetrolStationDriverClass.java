package chapterThree;

import java.util.Scanner;

public class PetrolStationDriverClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PetrolStation Mobil = new PetrolStation(null, null,null,0.0,0.0);

        System.out.print("Please enter the name of the Petrol Station: ");
        String theNameOfThePetrolStation = input.nextLine();
        Mobil.setStationLocation(theNameOfThePetrolStation);

        System.out.print("Please enter the type of Petrol you bought: ");
        String theNameOfTheTypeOfPetrol = input.nextLine();
        Mobil.setTypeOfPetrol(theNameOfTheTypeOfPetrol);

        System.out.print("Please enter the Amount of Petrol Purchased (Liters): ");
        Integer theAmountOfPetrolPurchasedInLiters = input.nextInt();
        Mobil.setPetrolPurchasedInLiters(theAmountOfPetrolPurchasedInLiters);

        System.out.print("At what Price-point Per Liter?: ");
        Double PetrolPurchasedPricePoint = input.nextDouble();
        Mobil.setPricePerLiter(PetrolPurchasedPricePoint);

        System.out.print("Percentage Discount?: ");
        Double stationPercentageDiscount = input.nextDouble();
        Mobil.setPercentageDiscount(stationPercentageDiscount);

        System.out.printf("Station Location: %s%n", Mobil.getStationLocation());
        System.out.printf("Type of Petrol: %s%n", Mobil.getTypeOfPetrol());
        System.out.printf("Petrol Purchased In Liters: %d%n", Mobil.getPetrolPurchasedInLiters());
        System.out.printf("Price-point Per Liter: %f%n", Mobil.getPricePerLiter());

        double getPurchaseAmount = Mobil.getPetrolPurchasedInLiters() * Mobil.getPricePerLiter();
        double applyDiscount = Mobil.getPercentageDiscount()/100;
        double finalPurchaseAmount = getPurchaseAmount - (getPurchaseAmount * applyDiscount);
        System.out.printf("Amount Spent: %f%n", finalPurchaseAmount);



    }
}
