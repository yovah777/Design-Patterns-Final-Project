import Order.InputFromUser;
import Payment.Bank_Account.BankAccount;
import Payment.Bank_Account.BankAccountHolder;
import Payment.Bank_Account.CreditAccount;
import ProductNotification.EmailObserver;
import ProductNotification.Subject;
import ProductNotification.TextObserver;

public class Customer {

    /**
     * Driver application
     * Objects are instantiated, notifications released, and print out of available funds in accounts.
     * @param args
     */
    public static void main(String[] args) {


        BankAccountHolder holder = new BankAccountHolder(2000);
        BankAccount ac1 = new BankAccount(1000);
        BankAccount ac2 = new BankAccount(1000);


        CreditAccount cr1 = new CreditAccount(3000);
        CreditAccount cr2 = new CreditAccount(3000);
        Subject subject = new Subject();

        new EmailObserver(subject);
        new TextObserver(subject);


        holder.addAccount(cr1);
        holder.addAccount(cr2);
        System.out.println("******* APPLE NEW PRODUCT RELEASE NOTIFICATION: *******");
        System.out.println("------------------------");
        subject.setState("Iphone 15 Pro Released");
        System.out.println();
        subject.setState("Macbook Pro 19 inch Released"); // set states hits the notify()
        System.out.println("------------------------");

//        holder.printAllBalanceInBankingAccount();
        System.out.println("Bank Account #1 $" + holder.totalMoney());
        holder.addAccount(ac1);
        holder.addAccount(ac2);
        System.out.println("Bank Account #2 $" + ac1.getBalance());
        System.out.println("Bank Account #3 $" + ac2.getBalance());
        System.out.println("Total money Bank Account : $" + holder.totalMoney());
        System.out.println("Credit Card account total limit : $" + holder.totalMoneyCredit());
        holder.printAllBalanceInCreditAccount();

        InputFromUser inputUser = new InputFromUser();

//        System.out.println(inputUser.getTotalCost());
        inputUser.takeInput(holder);

//
    }
}

