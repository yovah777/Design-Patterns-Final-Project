package Payment.Bank_Account;

/**
* Creates the account abstract class. 
* BankAccount and CreditAccount will implement Account
 * COR is inherited by child classes
 * If there are not enough funds to complete the order, the next account is checked
 * to see if funds exist.
*/

abstract public class Account {
    // Intialize fields
    private Account nextAccount;
    private double balance;

    /***
     * Deduct money from account
     * @param amount
     * @throws InsufficientFundsException
     */
    public abstract void deduct(double amount) throws InsufficientFundsException;

    /**
     * print out statement for funds verification
     */
    public abstract void print();

    public Account() {}

    /***
     * Get balance
     * @return balance (Double)
     */
    public Double getBalance() {
        return balance;
    }

    /***
     * Set balance
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * Retrieves the next account (handler) to check if enough funds exist.
     * @return  next account.
     */
    public Account getNextAccount() {
        return nextAccount;
    }
    /***
     * Sets next Account in the Accounts Chain list
     * @param nextAccount - the successor of the current Account
     */
    public void setNextAccount(Account nextAccount) {
        this.nextAccount = nextAccount;
    }

}

