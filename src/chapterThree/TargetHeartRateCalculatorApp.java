package chapterThree;

import java.time.LocalDate;
import java.util.Scanner;

public class TargetHeartRateCalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TargetHeartRateCalculator sampleHeartRateProfile = new TargetHeartRateCalculator(null,null,null, 1,1,1);

        System.out.print("Please enter your firstname: ");
        String patientFirstName = input.nextLine();
        sampleHeartRateProfile.setFirstName(patientFirstName);

        System.out.print("Please enter your lastname: ");
        String patientLastName = input.nextLine();
        sampleHeartRateProfile.setLastName(patientLastName);

        System.out.print("Please enter your Gender: ");
        String patientGender = input.nextLine();
        sampleHeartRateProfile.setGender(patientGender);

        System.out.print("Please enter your Birth Year: ");
        Integer patientBirthYear = input.nextInt();
        sampleHeartRateProfile.setBirthYear(patientBirthYear);

        System.out.print("Please enter your Birth Month: ");
        Integer patientBirthMonth = input.nextInt();
        sampleHeartRateProfile.setBirthMonth(patientBirthMonth);

        System.out.print("Please enter your Birth Day: ");
        Integer patientBirthDay = input.nextInt();
        sampleHeartRateProfile.setBirthDay(patientBirthDay);

//       LocalDate dateofBirth = LocalDate.of(patientBirthYear, patientBirthMonth, patientBirthDay);
////       System.out.println(dateofBirth);

        System.out.println("Patient Name: " + sampleHeartRateProfile.getFirstName()+" " + sampleHeartRateProfile.getLastName());
        System.out.println("Patient Gender: " + sampleHeartRateProfile.getGender());
        System.out.println("Patient Birthday: " + sampleHeartRateProfile.getBirthYear()+"-"+sampleHeartRateProfile.getBirthMonth()+"-"+sampleHeartRateProfile.getBirthDay());
        LocalDate currentDay = LocalDate.now();
        Integer age = currentDay.getYear() - patientBirthYear;
        System.out.println("Patient age: " + age);
        Integer maximumHeartRate = 220 - age;
        System.out.println("Your maximum heart rate: " + maximumHeartRate);
        double targetHeartRateLow = 0.5 * maximumHeartRate;
        double targetHeartRateHigh = 0.85 * maximumHeartRate ;
        System.out.printf("Your target heart rate is between %.2f - %.2f ", targetHeartRateLow, targetHeartRateHigh);
    }
}
