package Payment.Bank_Account;

import Payment.PaymentContext;

import java.util.ArrayList;

/**
 * Represents the owner of the Bank account
 */
public class BankAccountHolder {
    // Intialize variables
    private BankAccount checking;
    private CreditAccount credit;
    private Account current;
    private Account currentCredit;
    private PaymentContext context = null;

    ArrayList<Account> accounts = new ArrayList<>();

    /***
     * Constructor for BankAccountHolder
     * 
     * @param initialMoney - Set amount for initial checking account that is created
     *                     when customer initialized
     */
    public BankAccountHolder(double initialMoney) {
        checking = new BankAccount(initialMoney);
        current = checking;
    }

    /***
     * Add account to the the BankAccountHolder
     * 
     * @param account - the passed account
     */
    public void addAccount(Account account) {
        if (account instanceof CreditAccount) {
            if (currentCredit == null) {
                credit = (CreditAccount) account;
                currentCredit = credit;
            } else {
                currentCredit.setNextAccount(account);
                currentCredit = currentCredit.getNextAccount();
            }
        }
        if (account instanceof BankAccount) {
            current.setNextAccount(account);
            current = current.getNextAccount();
        }

    }

    /***
     * Implementation from PayingParty, calls checkProcessor to verify if customer
     * accounts is sufficient to amount due
     * 
     * @param amount - Amount due to the customer
     */
    public boolean payWithBankAccount(double amount) {
        CheckProcessor checkingProcessor = new CheckProcessor();
        boolean sufficient = checkingProcessor.processCheck(checking, amount);
        return sufficient;
    }

    /***
     * Implementation from PayingParty, calls checkProcessor to verify if customer
     * accounts is sufficient to amount due
     * 
     * @param amount - Amount due to the customer
     */
    public boolean payWithCreditAccount(double amount) {
        boolean sufficient = false;
        if (credit == null) {
            System.out.println("Dont have credit account !!");
        } else {
            System.out.println("Testing credit !!");
            CheckProcessor checkingProcessor = new CheckProcessor();
            sufficient = checkingProcessor.processCheck(credit, amount);
        }
        return sufficient;
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

    /**
     * Prints available balance in credit accounts
     */
    public void printAllBalanceInCreditAccount() {
        currentCredit = credit;
        while (currentCredit != null) {
            System.out.println(currentCredit.getBalance());
            if (currentCredit instanceof CreditAccount) {
                if (currentCredit.getNextAccount() instanceof CreditAccount) {
                    currentCredit = currentCredit.getNextAccount();
                } else {
                    break;
                }
            }
        }
    }

    /**
     *  Represents the total amount of available funds in all accounts.
     * @return total amount available
     */
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
