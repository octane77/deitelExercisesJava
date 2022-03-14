//5.32 (Tax Plan Alternatives; The “FairTax”) There are many proposals to make taxation fairer.
//Check out the FairTax initiative in the United States at www.fairtax.org. Research how the proposed
//FairTax works. One suggestion is to eliminate income taxes and most other taxes in favor of
//a 23% consumption tax on all products and services that you buy. Some FairTax opponents question
//the 23% figure and say that because of the way the tax is calculated, it would be more accurate
//to say the rate is 30%—check this carefully. Write a program that prompts the user to enter expenses
//in various expense categories they have (e.g., housing, food, clothing, transportation, education,
//health care, vacations), then prdoubles the estimated FairTax that person would pay.

package chapterFive;

public class TaxPlanFairTax {
        private double housing;
        private double food;
        private double clothing;
        private double education;
        private double transportation;
        private double healthCare;
        private double vacations;

    public TaxPlanFairTax(double housing, double food, double clothing, double education, double transportation, double healthCare, double vacations) {
        this.housing = housing;
        this.food = food;
        this.clothing = clothing;
        this.education = education;
        this.transportation = transportation;
        this.healthCare = healthCare;
        this.vacations = vacations;
    }

    public double getHousing() {
        return housing;
    }

    public void setHousing(double housing) {
        this.housing = housing;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getClothing() {
        return clothing;
    }

    public void setClothing(double clothing) {
        this.clothing = clothing;
    }

    public double getEducation() {
        return education;
    }

    public void setEducation(double education) {
        this.education = education;
    }

    public double getTransportation() {
        return transportation;
    }

    public void setTransportation(double transportation) {
        this.transportation = transportation;
    }

    public double getHealthCare() {
        return healthCare;
    }

    public void setHealthCare(double healthCare) {
        this.healthCare = healthCare;
    }

    public double getVacations() {
        return vacations;
    }

    public void setVacations(double vacations) {
        this.vacations = vacations;
    }

}
