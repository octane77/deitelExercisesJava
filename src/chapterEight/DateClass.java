//8.14 (Date Class) Create class Date with the following capabilities:
//a) Output the date in multiple formats, such as
//MM/DD/YYYY
//June 14, 1992
//DDD YYYY
//b) Use overloaded constructors to create Date objects initialized with dates of the formats
//in part (a). In the first case the constructor should receive three integer values. In the
//second case it should receive a String and two integer values. In the third case it should
//receive two integer values, the first of which represents the day number in the year.
//[Hint: To convert the String representation of the month to a numeric value, compare
//Strings using the equals method. For example, if s1 and s2 are Strings, the method
//call s1.equals(s2) returns true if the Strings are identical and otherwise returns
//false.]

package chapterEight;

public class DateClass {
    int day;
    int month;
    int year;

    public DateClass(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
