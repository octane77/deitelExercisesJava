package chapterFive;

import java.util.Scanner;

public class ModifiedAutoPolicyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ModifiedAutoPolicy policy1 = new ModifiedAutoPolicy(0,  null, null);
        ModifiedAutoPolicy policy2 = new ModifiedAutoPolicy(0, null, null);

        System.out.print("Please enter the make and model of the car: ");
        String theMakeAndModel = input.nextLine();
        policy1.setMakeAndModel(theMakeAndModel);

        System.out.print("Please enter the make and model of the car: ");
        String theMakeAndModel2 = input.nextLine();
        policy2.setMakeAndModel(theMakeAndModel2);

        System.out.print("Please enter the your state code: ");
        String theStateCode = input.nextLine();
        policy1.setState(theStateCode);

        System.out.print("Please enter the your state code: ");
        String theStateCode2 = input.nextLine();
        policy2.setState(theStateCode2);

        System.out.print("Please enter the account number: ");
        int theAccountNumber = input.nextInt();
        policy1.setAccountNumber(theAccountNumber);

        System.out.print("Please enter the account number: ");
        int theAccountNumber2 = input.nextInt();
        policy2.setAccountNumber(theAccountNumber2);

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
        }

        public static void policyInNoFaultState(ModifiedAutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),(policy.isNoFaultState() ? "is": "is not"));
    }
}