//4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
//department-store customers has exceeded the credit limit on a charge account. For each customer,
//the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning balance
//+ charges – credits), display the new balance and determine whether the new balance exceeds the
//customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
//the message "Credit limit exceeded".

package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditLimitCalculator credit = new CreditLimitCalculator(0, 0, 0, 0,0, 0);

            System.out.print("What's your account number?: ");
            int accountNumber = input.nextInt();
            credit.setAccountNumber(accountNumber);

            System.out.print("What's your current balance?: ");
            int beginningBalance = input.nextInt();
            credit.setBeginningBalance(beginningBalance);

            System.out.print( "What's your total charge for this month?: " );
            int monthlyTotalCharge = input.nextInt();
            credit.setMonthlyTotalCharge(monthlyTotalCharge);

            System.out.print( "How many credits have you used so far this month?: " );
            int monthlyTotalCredits = input.nextInt();
            credit.setMonthlyTotalCredits(monthlyTotalCredits);

            System.out.print( "What's your credit limit?: " );
            int monthlyCreditLimit = input.nextInt();
            credit.setMonthlyCreditLimit(monthlyCreditLimit);

            int newAccountBalance = credit.getBeginningBalance() + credit.getMonthlyTotalCharge() - credit.getMonthlyTotalCredits();
            System.out.println("Your current account balance is: " + newAccountBalance);

            if (newAccountBalance > monthlyCreditLimit){
                System.out.println("You have exceeded your credit limit for the month");
            }

            int leftoverCredits = monthlyCreditLimit - monthlyTotalCredits;
            System.out.printf("You have %d credits left%n", leftoverCredits );
        }
    }
