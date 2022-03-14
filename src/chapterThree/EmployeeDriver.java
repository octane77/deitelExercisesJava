//3.13 (Employee Class) Create a class called Employee that includes three instance variables—a
//first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
//that initializes the three instance variables. Provide a set and a get method for each instance
//variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest
//that demonstrates class Employee’s capabilities. Create two Employee objects and display each
//object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary
//again.

package chapterThree;

import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee(null, null, 0.0);
        Employee employee2 = new Employee(null, null, 0.0);

        System.out.print("Employee 1 First Name: ");
        String employee1FirstName = input.nextLine();
        employee1.setFirstName(employee1FirstName);

        System.out.print("Employee 1 Last Name: ");
        String employee1LastName = input.nextLine();
        employee1.setLastName(employee1LastName);

        System.out.print("Employee 2 First Name: ");
        String employee2FirstName = input.nextLine();
        employee2.setFirstName(employee2FirstName);

        System.out.print("Employee 2 Last Name: ");
        String employee2LastName = input.nextLine();
        employee2.setLastName(employee2LastName);

        System.out.printf("%s %s's Monthly Salary: ", employee1.getFirstName(), employee1.getLastName());
        double employee1Salary = input.nextDouble();
        employee1.setMonthlySalary(employee1Salary);

        System.out.printf("%s %s's Monthly Salary: ", employee2.getFirstName(), employee2.getLastName());
        double employee2Salary = input.nextDouble();
        employee2.setMonthlySalary(employee2Salary);

        double employee1AnnualSalary = employee1.getMonthlySalary() * 12;
        double employee2AnnualSalary = employee2.getMonthlySalary() * 12;

        double employee1AnnualSalaryPostRaise = employee1AnnualSalary + (employee1AnnualSalary * 0.1);
        double employee2AnnualSalaryPostRaise = employee2AnnualSalary + (employee2AnnualSalary * 0.1);

        System.out.printf("%s %s's Yearly Salary was formerly %.2f, following a ten percent raise, it is now %.2f%n", employee1FirstName, employee1LastName, employee1AnnualSalary, employee1AnnualSalaryPostRaise);
        System.out.printf("%s %s's Yearly Salary was formerly %.2f, following a ten percent raise, it is now %.2f%n", employee2FirstName, employee2LastName, employee2AnnualSalary, employee2AnnualSalaryPostRaise);
    }
}
