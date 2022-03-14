package chapterThree;

public class HealthRecord {
    private String firstName;
    private String lastName;
    private String gender;
    private String birthYear;
    private String birthMonth;
    private String birthDay;
    private Integer heightInInches;
    private Integer weightInLbs;

    public HealthRecord(String firstName, String lastName, String gender, String birthYear, String birthMonth, String birthDay, Integer heightInInches, Integer weightInLbs){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.heightInInches = heightInInches;
        this.weightInLbs = weightInLbs;
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

    public void setBirthYear(Integer birthYear) {
        this.birthYear = String.valueOf(birthYear);
    }

    public String getBirthYear(){
        return birthYear;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth= String.valueOf(birthMonth);
    }

    public String getBirthMonth(){
        return birthMonth;
    }

    public void setBirthDay(Integer birthDay){
        this.birthDay= String.valueOf(birthDay);
    }

    public String getBirthDay(){
        return birthDay;
    }

    public void setHeightInInches(Integer HeightInInches) {
        this.heightInInches= HeightInInches;
    }

    public Integer getHeightInInches(){
        return heightInInches;
    }

    public void setWeightInLbs(Integer WeightInLbs) {
        this.weightInLbs = WeightInLbs;
    }

    public Integer getWeightInLbs(){
        return weightInLbs;
    }
}
