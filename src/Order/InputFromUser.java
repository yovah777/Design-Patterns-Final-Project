package Order;
import Factory.MacFactory;
import Mac.Computer;
import Mac.MacBookPro13;
import Mac.MacBookPro15;
import Mac.MacDecorator.*;
import OrderState.*;
import Payment.AmericanExpressStrategy;
import Payment.AppleStrategy;
import Payment.Bank_Account.BankAccountHolder;
import Payment.PaymentContext;
import Payment.VisaStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Represents input taken from User.
 * User makes selections of Apple products they would like to purchase.
 */
public class InputFromUser {
    private PaymentContext context = null;
    private double totalCost = 0.0;
    private boolean firstOrder = true;
    private String iphoneModel = "";
    private Assembler assembler = new Assembler();
    private Cart cart = new Cart();
    private OrderContext stateContext = new OrderContext();

    /**
     * Displays welcome screen and product options.
     * Takes in user input.
     * @param holder    Represents user
     */
    public void takeInput(BankAccountHolder holder) {
        MacFactory mac = new MacFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            if (firstOrder) {
                stateContext.setState(new StartState());
                stateContext.printState();
            }

            System.out.println("Welcome to the Apple Store what would you like to order?");
            System.out.println("[1] Iphone");
            System.out.println("[2] Macbook");
            System.out.println("[3] No thanks, I am no longer interested in purchasing an Apple product.");

            int answer = scanner.nextInt();

            if (firstOrder && answer != 1 && answer != 2) {
                System.out.println("----------------");
                System.out.println("Thank you for shopping at the Apple Store!");
                break;
            }
            // ANSWER 1 - User wants iPhone - Template pattern
            firstOrder = false;


            // iphone uses template pattern
            if (answer == 1) {
                Scanner scanIphone = new Scanner(System.in);
                System.out.println("---------IPHONE---------");

                for (int i = 0; i < 1; i++) {
                    System.out.println("[1] Iphone 11 Pro  --- $999.00");
                    System.out.println("[2] Iphone 11 Standard  --- $699.00");

                    int iPhoneSelection = scanIphone.nextInt();

                    if (iPhoneSelection == 1) {
                        iphoneModel = "Iphone11Pro";
                        System.out.println("--- Iphone 11 Pro Selected");
                    } else if (iPhoneSelection == 2) {
                        iphoneModel = "Iphone11Standard";
                        System.out.println("--- Iphone 11 Standard Selected");
                    } else {
                        break;
                    }
                }

                System.out.println("You have finished selecting an iPhone");
                System.out.println("");

                IphoneOrder iphoneOrder = new IphoneOrder(assembler, iphoneModel);

                cart.addToCart(iphoneOrder);
                stateContext.setState(new BuildState());

                stateContext.printState();
                totalCost += iphoneOrder.getIphoneCost();
            }
            // ANSWER 2 - User wants Macbook - Decorator pattern
            else if (answer == 2) {

                String response = null;
                Computer computer;

                while (true) {
                    System.out.println("Which Macbook Pro would you like to purchase?");
                    System.out.println("[1] Macbook Pro 13 -  $1299.00");
                    System.out.println("[2] Macbook Pro 15 -  $2399.00");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

                    try {
                        response = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (response.equals("1")) {
                        computer = mac.createMac("MacBookPro13");
                        System.out.println("You have chose the Macbook Pro 13.");
                        break;
                    } else if (response.equals("2")) {
                        computer = mac.createMac("MacBookPro15");
                        System.out.println("You have chose the Macbook Pro 15.");
                        break;
                    } else {
                        continue;
                    }

                }
                System.out.println("");

                // 1 -- PROCESSOR SELECTION
                System.out.println("************** PROCESSOR CUSTOMIZATION **************");
                Scanner scan1 = new Scanner(System.in);
                for (int i = 0; i < 1; i++) {
                    System.out.println("[1] Intel i7  $100.00");
                    System.out.println("[2] Intel i9 $300.00");

                    int value = scan1.nextInt();

                    if (value == 1) {
                        computer = new I7Processor(computer);
                        System.out.println("i7 Processor is picked");
                    } else if (value == 2) {
                        computer = new I9Processor(computer);
                        System.out.println("i9 Processor is picked");
                    } else {
                        break;
                    }
                }

                System.out.println("Processor selection completed");
                System.out.println("");

                // 2 -- MEMORY SELECTION
                System.out.println("************** MEMORY CUSTOMIZATION **************");
                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i < 1; i++) {
                    System.out.println("[1] 32GB Memory $400.00");
                    System.out.println("[2] 64GB $600.00");

                    int value = scan2.nextInt();

                    if (value == 1) {
                        computer = new Memory32GB(computer);
                        System.out.println("32GB Memory is picked");
                    } else if (value == 2) {
                        computer = new Memory64GB(computer);
                        System.out.println("64GB Memory is picked");
                    } else {
                        break;
                    }
                }

                System.out.println("Memory selection completed");
                System.out.println("");

                // 3 -- STORAGE SELECTION
                System.out.println("************** STORAGE CUSTOMIZATION **************");
                Scanner scan3 = new Scanner(System.in);
                for (int i = 0; i < 1; i++) {
                    System.out.println("[1] 512GB $400.00");
                    System.out.println("[2] 1TB $600.00");

                    int value = scan3.nextInt();

                    if (value == 1) {
                        computer = new Storage512GB(computer);
                        System.out.println("512GB Storage is picked");
                    } else if (value == 2) {
                        computer = new Storage1TB(computer);
                        System.out.println("1TB Storage is picked");
                    } else {
                        break;
                    }
                }

                System.out.println("Storage selection completed");
                System.out.println("");


                // 4 -- CASE SELECTION
                System.out.println("************** CASES CUSTOMIZATION **************");
                Scanner scan4 = new Scanner(System.in);
                System.out.println("[1] Hardshell Case $49.00");
                System.out.println("[2] Leather Case $79.00");

                int value = scan4.nextInt();

                if (value == 1) {
                    computer = new HardShellCase(computer);
                    System.out.println("Hard Shell is picked");
                } else if (value == 2) {
                    computer = new LeatherCase(computer);
                    System.out.println("Leather case is picked");
                } else {
                    break;
                }


                System.out.println("Case selection completed");
                System.out.println("");
                System.out.println(computer.getDescription());
                System.out.println("Cost: $" + computer.getCost());
                totalCost += computer.getCost();

                stateContext.setState(new BuildState());
                stateContext.printState();
            } else {
                double money = totalCost;
                System.out.println("Total final cost: $" + totalCost);
                Scanner scanPayment = new Scanner(System.in);
                System.out.println("[1] For Debit !");
                System.out.println("[2] For Credit !");

                int value = scanPayment.nextInt();

                if (value == 1) {
                    if (holder.payWithBankAccount(money) == false) {
                        stateContext.setState(new CancelState());
                        stateContext.printState();
                    } else {
                        stateContext.setState(new DeliveryState());
                        stateContext.printState();
                    }
                    System.out.println("");
                    holder.printAllBalanceInBankingAccount();
                } else if (value == 2) {

                    System.out.println("[1] AmericanExpress - 2.5% Cashback");
                    System.out.println("[2] AppleCard - 5% Cashback");
                    System.out.println("[3] Visa - 3.5% Cashback");

                    Scanner scanPaymentCredit = new Scanner(System.in);
                    int value1 = scanPaymentCredit.nextInt();

                    if (value1 == 1) {
                        context = new PaymentContext(new AmericanExpressStrategy());
                    } else if (value1 == 2) {
                        context = new PaymentContext(new AppleStrategy());
                    } else if (value1 == 3) {
                        context = new PaymentContext(new VisaStrategy());
                    }

                    double totalDiscount = context.executeStrategy(money);
                    money -= totalDiscount;

                    System.out.println("Total Cost after Cashback : $" + money);
                    System.out.println("Dollars saved from Cashback: $" + totalDiscount);

                    if (holder.payWithCreditAccount(money) == false) {
                        stateContext.setState(new CancelState());
                        stateContext.printState();
                    } else {
                        stateContext.setState(new DeliveryState());
                        stateContext.printState();
                    }
                    System.out.println();
                    holder.printAllBalanceInCreditAccount();

                } else {
                    break;
                }

                System.out.println("----------------");
                System.out.println("Thank you for shopping at the Apple Store!");
                break;
            }
        }

    }

    /**
     * Retrieves the total cost of products ordered/purchased.
     * @return  Total price
     */
    public double getTotalCost() {
        return totalCost;
    }
}
