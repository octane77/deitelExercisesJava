//4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
//        three employees. The company pays straight time for the first 40 hours worked by each employee
//        and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//        number of hours worked last week and their hourly rates. Your program should input this information
//        for each employee, then determine and display the employee’s gross pay. Use class Scanner to
//        input the data.

package chapterFour;

import java.util.Scanner;

public class  SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employee_id = 0;
        int employeeHoursWorked = 0;
        int employeeCounter = 0;

        double straightTimeWage;
        double overtimePay;
        double regularShiftPay = 0;

        while (employeeCounter < 3){
            System.out.print("Please enter your employee ID?: ");
            employee_id = input.nextInt();

            System.out.print("Enter how many hours you clocked in this week: ");
            employeeHoursWorked = input.nextInt();

            System.out.print("Whats your employee's hourly rate?: ");
            straightTimeWage = input.nextDouble();

            if (employeeHoursWorked == 40) {
                regularShiftPay = employeeHoursWorked * straightTimeWage;
                System.out.printf("Your employee ID is %d\n", employee_id);
                System.out.printf("Your regular shift pay is $%.2f\n", regularShiftPay);
                System.out.printf("You clocked in no overtime this week\n\n");
            }

            if (employeeHoursWorked > 40) {
                int regularShift = 40;
                regularShiftPay = regularShift * straightTimeWage;

                int overtimeShift = employeeHoursWorked - 40;
                overtimePay = straightTimeWage * 1.5;
                double overtimeShiftPay;
                overtimeShiftPay = overtimeShift * overtimePay;
                double grossPay = regularShiftPay + overtimeShiftPay;

                System.out.printf("Your employee ID is %d\n", employee_id);
                System.out.printf("Your regular shift pay for this week is $%.2f\n", regularShiftPay);
                System.out.printf("Your overtime pay for this week is $%.2f\n", overtimeShiftPay);
                System.out.printf("Your gross pay for this week is $%.2f\n\n", grossPay);
            }

            if (employeeHoursWorked < 40) {
                regularShiftPay = employeeHoursWorked * straightTimeWage;
                System.out.printf("Your employee ID is %d\n", employee_id);
                System.out.printf("Your regular shift pay is $%.2f\n", regularShiftPay);
                System.out.printf("You clocked in no overtime this week\n\n");
            }
            employeeCounter++;
        }
    }
}