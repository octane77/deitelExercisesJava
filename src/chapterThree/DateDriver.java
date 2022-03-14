//3.14 (Date Class) Create a class called Date that includes three instance variables—a month (type
//int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
//variables and assumes that the values provided are correct. Provide a set and a get method for each
//instance variable. Provide a method displayDate that displays the month, day and year separated
//by forward slashes (/). Write a test app named DateTest that demonstrates class Date’s capabilities.

package chapterThree;

import java.util.Scanner;

public class DateDriver {
    public static void main(String[] args) {
    Date today = new Date(0,0,0);
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
        System.out.println("DD/MM/YYYY");
        System.out.printf("%d/%d/%d", today.getDay(), today.getMonth(), today.getYear());
    }
}
