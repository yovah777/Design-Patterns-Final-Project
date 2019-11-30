import Order.InputFromUser;
import Payment.Bank_Account.BankAccount;
import Payment.Bank_Account.BankAccountHolder;
import Payment.Bank_Account.CreditAccount;
import ProductNotification.EmailObserver;
import ProductNotification.Subject;
import ProductNotification.TextObserver;

public class Customer {


    public static void main(String[] args) {

        BankAccount ac1 = new BankAccount(500);
        BankAccount ac2 = new BankAccount(600);
        BankAccountHolder holder = new BankAccountHolder(400);

        CreditAccount cr1 = new CreditAccount(500);
        CreditAccount cr2 = new CreditAccount(500);
        Subject subject = new Subject();

        new EmailObserver(subject);
        new TextObserver(subject);

        holder.addAccount(ac1);
        holder.addAccount(ac2);

        holder.addAccount(cr1);
        holder.addAccount(cr2);
        System.out.println("APPLE NEW RELEASE NOTIFICATION: ");
        System.out.println("------------------------");
        subject.setState("Iphone XX");
        System.out.println();
        subject.setState("Macbook Pro 20 Released"); // set states hits the notify()
        System.out.println("------------------------");

        holder.printAllBalanceInBankingAccount();
        System.out.println("Total money Bank Account : " + holder.totalMoney());
        System.out.println("Credit Card account limit : " + holder.totalMoney());
        holder.printAllBalanceInCreditAccount();

        InputFromUser inputUser = new InputFromUser();

        System.out.println(inputUser.getTotalCost());
        inputUser.takeInput(holder);

//
    }
}

