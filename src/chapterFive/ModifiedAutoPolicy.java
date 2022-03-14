//5.30 (Modified AutoPolicy Class) Modify class AutoPolicy in Fig. 5.11 to validate the two-letter
//state codes for the northeast states. The codes are: CT for Connecticut, MA for Massachusetts, ME
//for Maine, NH for New Hampshire, NJ for New Jersey, NY for New York, PA for Pennsylvania
//and VT for Vermont. In AutoPolicy method setState, use the logical OR (||) operator
//(Section 5.9) to create a compound condition in an if…else statement that compares the method’s
//argument with each two-letter code. If the code is incorrect, the else part of the if…else statement
//should display an error message. In later chapters, you’ll learn how to use exception handling to indicate
//that a method received an invalid value.

package chapterFive;

import java.util.Objects;

public class ModifiedAutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public ModifiedAutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        if (Objects.equals(state, "CT") |
                Objects.equals(state, "MA") |
                Objects.equals(state, "ME") |
                Objects.equals(state, "NH" ) |
                Objects.equals(state, "NJ" ) |
                Objects.equals(state, "NY" ) |
                Objects.equals(state, "PA" ) |
                Objects.equals(state, "VT" )
        ){
            System.out.println("Valid");
        }
        else
        System.out.println("This state code is invalid");
        System.exit(-1);
    }

    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (getState()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}
