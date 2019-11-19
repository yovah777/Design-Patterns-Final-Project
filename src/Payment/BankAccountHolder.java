package Payment;

import java.util.ArrayList;

public class BankAccountHolder {
    // Intialize variables
    private BankAccount checking;
    private Account current;
    ArrayList<Account> accounts = new ArrayList<Account>();

    /***
     * Constructor for BankAccountHolder
     * @param initialMoney - Set amount for initial checking account that is created when customer initialized
     */

    public BankAccountHolder(double initialMoney) {
        checking = new BankAccount(initialMoney);
        current = checking;
    }

    /***
     * Add account to the the BankAccountHolder
     * @param account - the passed account
     */
    public void addAccount(Account account) {
        current.setNextAccount(account);
        current = current.getNextAccount();
    }



    /***
     * Implementation from PayingParty, calls checkProcessor to verify if customer accounts
     * is sufficient to amount due
     * @param amount - Amount due to the customer
     */
    public void pay(double amount) {
        CheckProcessor checkingProcessor = new CheckProcessor();
        boolean sufficient = checkingProcessor.processCheck(checking, amount);
    }

    /***
     * Print all the balance in banking account
     */
    public void printAllBalanceInBankingAccount() {
        current = checking;
        while (current != null) {
            if (current instanceof BankAccount) {
                System.out.println(current.getBalance());
                if (current.getNextAccount() instanceof BankAccount) {
                    current = current.getNextAccount();
                } else {
                    break;
                }
            }
        }
    }

    public double totalMoney() {
        current = checking;
        double total = 0.0;
        while (current != null) {
            if (current instanceof BankAccount) {
                total = total + current.getBalance();
                if (current.getNextAccount() instanceof BankAccount) {
                    current = current.getNextAccount();
                } else {
                    break;
                }
            }
        }
        return total;
    }

}
