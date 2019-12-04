package Payment.Bank_Account;

/**
 * Represents the Check Processor that checks accounts and price of purchase(s).
 *
 */
public class CheckProcessor {
    /***
     * Handler that takes in BankAccount, checks to if total Accounts is sufficient to Amount due to customers
     * @param account - Account type passed through processor
     * @param amount - Amount due customers
     * @return - returns a boolean T if successful/ F if insufficient
     */
    public boolean processCheck(Account account, double amount) {
        try {
            account.deduct(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("You have insufficient amount of money !");
            return false;
        }
        return true;
    }

}
