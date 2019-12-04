package Payment.Bank_Account;
import java.text.DecimalFormat;
/**
 * Bank account class that extends the Account class.
 * @author Nexlore
 */
public class BankAccount extends Account {

    // Intialize variables
    private static int number = 0;
    DecimalFormat df = new DecimalFormat("#,###,##0.00");

    /***
     * Constructor for class BankAccount
     * @param balance - Set balance to what is passed
     */
    public BankAccount(double balance) {
        this.setBalance(balance);
    }

    /***
     * Increases balance
     * @param moneyToAdd - the amount to increase the balance by
     */
    public void makeDeposit(double moneyToAdd) {
        Double balance = this.getBalance() + moneyToAdd;
        this.setBalance(balance);
    }

    /***
     * Decrement the Bank/Credit Accounts by the Amt due, if Accounts balance is sufficient to due amt
     * @param amount - Amount due to customer
     * @return
     * @throws InsufficientFundsException - Exception thrown when Accounts balance is insufficient
     */
    public void deduct(double amount) throws InsufficientFundsException {
        Double balance = this.getBalance();
        if (amount <= balance) {
            double remain = balance - amount;
            this.setBalance(remain);
            System.out.println("You have sufficient funds in your accounts Balance: " + df.format(this.getBalance()));
        } else {
            double remainder = amount - balance;

            if (getNextAccount() != null) {
                getNextAccount().deduct(remainder);
                this.setBalance(0.0);
            }
            if (getNextAccount() == null) {
                throw new InsufficientFundsException();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("In bank account!");
    }
}
