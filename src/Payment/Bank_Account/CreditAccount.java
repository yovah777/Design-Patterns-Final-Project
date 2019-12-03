package Payment.Bank_Account;
import java.text.DecimalFormat;

/**
 * Represents the CreditAccount(credit cards)
 */

public class CreditAccount extends Account {

    // Initialize of variables
    private double limit;
    private Account nextAccount;
    DecimalFormat df = new DecimalFormat("#,###,##0.00");

    /***
     * CreditAccount Constructor
     * @param limit - Max credit limit to customer's account
     */
    public CreditAccount(double limit) {
        this.limit = limit;
        this.setBalance(0.0);
    }

    /***
     * Setting next account in the CreditAccount chain
     * @param nextAccount
     */
    @Override
    public void setNextAccount(Account nextAccount) {
        this.nextAccount = nextAccount;
    }

    /***
     * Getting the next account in CreditAccount chain
     * @return
     */
    @Override
    public Account getNextAccount() {
        return nextAccount;
    }

    /***
     * Getter method for CreditAccount
     * @return
     */
    public double getLimit(){
        return limit;
    }

    @Override
    public void print() {
        System.out.println("IN credit account !");
    }

    /***
     * Getter method for customer's current balance on creditAccount
     * @return
     */
    /***
     * Deducting from the credit limit, and increases customer's new balance
     * @param amount - remaining balance the customer must pay for
     * @throws InsufficientFundsException - If due amount is greater than current credit limit throw ISF exception
     */
    public void charge(double amount) throws InsufficientFundsException {
        Double balance = this.getBalance();
        this.setBalance(balance + amount);
        if (balance > this.limit) {
            throw new InsufficientFundsException();
        }
    }

    /***
     * CreditAccount Implementation of deduct, If successful increment  and decrment the credit limit
     * @param amount - remaining total balance due to customer
     * @throws InsufficientFundsException
     */
    @Override
    public void deduct(double amount) throws InsufficientFundsException {
        Double balance = this.getBalance();
        if (amount <= limit - balance) {
            balance = balance + amount;
            this.setBalance(balance);
            System.out.println("You have sufficient credit funds in your accounts : $" + df.format(balance));
        } else {
            double remainder = amount - (limit - balance);
            if (nextAccount != null) {
                nextAccount.deduct(remainder);
                this.setBalance(limit);
            } else {
                throw new InsufficientFundsException();
            }
        }
    }
}
