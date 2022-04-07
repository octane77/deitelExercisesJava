package chapterEight;

import static chapterEight.SavingsAccountClass.annualInterestRate;

public class SavingsAccountMain {
    public static void main(String[] args) {
        SavingsAccountClass saver1 = new SavingsAccountClass(2000.00);
        SavingsAccountClass saver2 = new SavingsAccountClass(3000.00);

        System.out.printf("Saver 1 balance: $%.2f %n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance: $%.2f %n%n", saver2.getSavingsBalance());

        annualInterestRate = 0.04;
        int months = 1;
        while(months<=12){
            System.out.println(saver1.calculateMonthlyInterest(saver1.getSavingsBalance(), annualInterestRate));
            System.out.println(saver2.calculateMonthlyInterest(saver2.getSavingsBalance(), annualInterestRate));
            months++;
        }
    }

}
