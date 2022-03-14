package chapterThree;

import java.time.LocalDate;

public class TargetHeartRateCalculator {
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private Integer birthYear;
    private Integer birthMonth;
    private Integer birthDay;

    public TargetHeartRateCalculator(String firstName, String lastName, String gender, Integer birthYear, Integer birthMonth ,Integer birthDay){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        dateOfBirth = LocalDate.of(birthYear, birthMonth, birthDay);
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getBirthYear(){
        return birthYear;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth= birthMonth;
    }

    public Integer getBirthMonth(){
        return birthMonth;
    }

    public void setBirthDay(Integer birthDay){
        this.birthDay= birthDay;
    }

    public Integer getBirthDay(){
        return birthDay;
    }

    public int calculateMaximumHeartRate(){
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - dateOfBirth.getYear();
        int maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }

    public String getTargetHeartRate(){
        int maximumHeartRate = calculateMaximumHeartRate();
        double lowerBound = 0.5 * maximumHeartRate;
        double upperBound = 0.85 * maximumHeartRate;
        return String.format("Your target heart rate is: %.2f - %.2f", lowerBound, upperBound);
    }

}
