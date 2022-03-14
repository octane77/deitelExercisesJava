//4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
//        department-store customers has exceeded the credit limit on a charge account. For each customer,
//        the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
//        the message "Credit limit exceeded".

package chapterFour;

public class CreditLimitCalculator {
    int accountNumber= 0;
        int beginningBalance;
        int monthlyTotalCharge;
        int monthlyTotalCredits = 0;
        int monthlyCreditLimit;
        int newAccountBalance;

    public CreditLimitCalculator(int accountNumber, int beginningBalance, int monthlyTotalCharge, int monthlyTotalCredits, int monthlyCreditLimit, int newAccountBalance) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.monthlyTotalCharge = monthlyTotalCharge;
        this.monthlyTotalCredits = monthlyTotalCredits;
        this.monthlyCreditLimit = monthlyCreditLimit;
        this.newAccountBalance = newAccountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBeginningBalance() {
        return beginningBalance;
    }

    public void setBeginningBalance(int beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    public int getMonthlyTotalCharge() {
        return monthlyTotalCharge;
    }

    public void setMonthlyTotalCharge(int monthlyTotalCharge) {
        this.monthlyTotalCharge = monthlyTotalCharge;
    }

    public int getMonthlyTotalCredits() {
        return monthlyTotalCredits;
    }

    public void setMonthlyTotalCredits(int monthlyTotalCredits) {
        this.monthlyTotalCredits = monthlyTotalCredits;
    }

    public int getMonthlyCreditLimit() {
        return monthlyCreditLimit;
    }

    public void setMonthlyCreditLimit(int monthlyCreditLimit) {
        this.monthlyCreditLimit = monthlyCreditLimit;
    }

    public int getNewAccountBalance() {
        return newAccountBalance;
    }

    public void setNewAccountBalance(int newAccountBalance) {
        this.newAccountBalance = newAccountBalance;
    }
}