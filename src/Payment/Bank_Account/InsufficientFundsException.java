package Payment.Bank_Account;// Customize Exception returns ISF messsage to customer if Accounts balance are less than due balance

/**
 * Sets up the Insufficient Funds Exception
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("You dont have enough money! - From ISFexception Class");
    }
}
