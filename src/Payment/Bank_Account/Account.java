package Payment.Bank_Account;

/**
* Creates the account abstract class. 
* BankAccount and CreditAccount will implement from Account Abstract class 
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

