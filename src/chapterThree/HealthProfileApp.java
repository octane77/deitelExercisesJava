package chapterThree;

import java.time.LocalDate;
import java.util.Scanner;

public class HealthProfileApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HealthRecord sampleHealthProfile = new HealthRecord(null,null,null,null,null,null,0,0);

        System.out.print("Please enter your firstname: ");
        String patientFirstName = input.nextLine();
        sampleHealthProfile.setFirstName(patientFirstName);

        System.out.print("Please enter your lastname: ");
        String patientLastName = input.nextLine();
        sampleHealthProfile.setLastName(patientLastName);

        System.out.print("Please enter your Gender: ");
        String patientGender = input.nextLine();
        sampleHealthProfile.setGender(patientGender);

        System.out.print("Please enter your Birth Year: ");
        Integer patientBirthYear = input.nextInt();
        sampleHealthProfile.setBirthYear(patientBirthYear);

        System.out.print("Please enter your Birth Month: ");
        Integer patientBirthMonth = input.nextInt();
        sampleHealthProfile.setBirthMonth(patientBirthMonth);

        System.out.print("Please enter your Birth Day: ");
        Integer patientBirthDay = input.nextInt();
        sampleHealthProfile.setBirthDay(patientBirthDay);

        System.out.print("Please enter your Height In Inches: ");
        Integer patientHeightInInches = input.nextInt();
        sampleHealthProfile.setHeightInInches(patientHeightInInches);

        System.out.print("Please enter your Weight in lbs: ");
        Integer patientWeightInLbs = input.nextInt();
        sampleHealthProfile.setWeightInLbs(patientWeightInLbs);
        System.out.println();
        System.out.println("Patient Name: " + sampleHealthProfile.getFirstName()+" " + sampleHealthProfile.getLastName());
        System.out.println("Patient Gender: " + sampleHealthProfile.getGender());
        System.out.println("Patient Birthday: " + sampleHealthProfile.getBirthYear()+"-"+sampleHealthProfile.getBirthMonth()+"-"+sampleHealthProfile.getBirthDay());
        LocalDate currentDay = LocalDate.now();
        Integer age = currentDay.getYear() - patientBirthYear;
        System.out.println("Patient Age: " + age);
        System.out.println("Patient Height in Inches: " + sampleHealthProfile.getHeightInInches());
        System.out.println("Patient Weight in Lbs: " + sampleHealthProfile.getWeightInLbs());
        System.out.println(" ");
        double bmiWeight = sampleHealthProfile.getWeightInLbs() * 703;
        int bmiHeight = sampleHealthProfile.getHeightInInches() * sampleHealthProfile.getHeightInInches();

        double BMI = bmiWeight/bmiHeight;

        System.out.println("");
        System.out.printf("Your body mass index is %.2f\n", BMI);
        System.out.println("BMI Key");
        System.out.println ("Underweight: Less than 18.5");
        System.out.println ("Normal: Between 18.5 and 24.9");
        System.out.println ("Overweight: Between 25 and 29.9");
        System.out.println ("Obese: 30 or greater");
        System.out.println();
        Integer maximumHeartRate = 220 - age;
        System.out.println("Your maximum heart rate: " + maximumHeartRate);
        double targetHeartRateLow = 0.5 * maximumHeartRate;
        double targetHeartRateHigh = 0.85 * maximumHeartRate ;
        System.out.printf("Your target heart rate is between %.2f - %.2f ", targetHeartRateLow, targetHeartRateHigh);
    }
}
