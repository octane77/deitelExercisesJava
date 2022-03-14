//3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw
//that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
//the Account’s balance. If it does, the balance should be left unchanged and the method should print
//a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
//(Fig. 3.9) to test method withdraw.

package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        System.out.print("Enter withdrawal amount for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
    }
}
