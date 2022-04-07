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

import java.util.Scanner;

public class DateClassDriver {
    public static void main(String[] args) {
        DateClass today = new DateClass(0,0,0);
        Scanner input = new Scanner(System.in);

        System.out.println("Deitel Digital Calendar");
        System.out.print("Please set today's date, Day: ");
        int deitelDay = input.nextInt();
        today.setDay(deitelDay);

        System.out.print("Please set today's date, Month: ");
        int deitelMonth = input.nextInt();
        today.setMonth(deitelMonth);

        System.out.print("Please set today's date, Year: ");
        int deitelYear = input.nextInt();
        today.setYear(deitelYear);

        System.out.println("Deitel Digital Calendar");
        System.out.println("MM/DD/YYYY");
        System.out.printf("%d/%d/%d%n%n",today.getMonth() , today.getDay(), today.getYear());

        System.out.println("MM DD, YYYY");
        if(today.getMonth() == 1){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 2){
            System.out.printf("February %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 3){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 4){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 5){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 6){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 7){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 8){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 9){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 10){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 11){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }

        if(today.getMonth() == 12){
            System.out.printf("January %d, %d",today.getDay(), today.getYear());
        }
    }
}
