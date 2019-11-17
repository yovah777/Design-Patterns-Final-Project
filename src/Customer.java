import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    static String iphoneModel = "";
    public static void main(String[] args) {

        Cart cart = new Cart();
        Assembler assembler = new Assembler();

        // Declare Scanner tool
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("Welcome to the Apple Store would you like to order?");
            System.out.println("[1] Iphone");
            System.out.println("[2] Macbook");
            System.out.println("[3] No thanks, I am not interested in Apple products.");

            int answer = scanner.nextInt();

            // ANSWER 1 - User wants iPhone - Template pattern

            // iphone uses template pattern
            if (answer==1){
                Scanner scanIphone = new Scanner(System.in);
                System.out.println("---------IPHONE---------");

                for (int i = 0; i<1; i++){
                    System.out.println("[1] Iphone 11 Pro  --- $999.00");
                    System.out.println("[2] Iphone 11 Standard  --- $699.00");


                    int iPhoneSelection = scanIphone.nextInt();

                    if(iPhoneSelection==1){
                        iphoneModel="Iphone11Pro";
                        System.out.println("--- Iphone 11 Pro Selected");
                    } else if(iPhoneSelection==2) {
                        iphoneModel="Iphone11Standard";
                        System.out.println("--- Iphone 11 Standard Selected");
                    } else {
                        break;
                    }
                }
                System.out.println("You have finished selecting an iPhone");
                System.out.println("");

                IphoneOrder iphoneOrder = new IphoneOrder(assembler,iphoneModel);
                cart.addToCart(iphoneOrder);
            }

            // ANSWER 2 - User wants Macbook - Decorator pattern
            else if(answer == 2){

                ArrayList<String>  processorList= new ArrayList<>();
                ArrayList<String> memoryList = new ArrayList<>();
                ArrayList<String> storageList = new ArrayList<>();
                ArrayList<String> caseList = new ArrayList<>();

                String macbookProSize = null;
                String response = null;

                while(true){
                    System.out.println("Which Macbook Pro would you like to purchase?");
                    System.out.println("[1] Macbook Pro 13 -  $1299.00");
                    System.out.println("[2] Macbook Pro 15 -  $2399.00");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

                    try{
                        response = input.readLine();
                    } catch(IOException e){
                        e.printStackTrace();
                    }

                    if (response.equals("1")) {
                        macbookProSize = "MacbookPro13"; // Might run into problems here...
                        System.out.println("You have chose the Macbook Pro 13.");
                        break;
                    } else if (response.equals("2")) {
                        macbookProSize = "MacbookPro15";
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
                for(int i = 0; i< 1; i++){
                    System.out.println("[1] Intel i7  $100.00");
                    System.out.println("[2] Intel i9 $300.00");

                    int value = scan1.nextInt();

                    if (value==1){
                        processorList.add("I7Processor");
                        System.out.println("i7 Processor is picked");
                    } else if (value == 2) {
                        processorList.add("I9Processor");
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
                for(int i = 0; i< 1; i++){
                    System.out.println("[1] 32GB Memory $400.00");
                    System.out.println("[2] 64GB $600.00");

                    int value = scan2.nextInt();

                    if (value==1){
                        memoryList.add("Memory32GB");
                        System.out.println("32GB Memory is picked");
                    } else if (value == 2) {
                        memoryList.add("Memory64GB");
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
                for(int i = 0; i< 1; i++){
                    System.out.println("[1] 512GB $400.00");
                    System.out.println("[2] 1TB $600.00");

                    int value = scan3.nextInt();

                    if (value==1){
                        storageList.add("Storage512GB");
                        System.out.println("512GB Storage is picked");
                    } else if (value == 2) {
                        storageList.add("Storage1TB");
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
                for(int i = 0; i< 1; i++){
                    System.out.println("[1] Hardshell Case $49.00");
                    System.out.println("[2] Leather Case $79.00");

                    int value = scan4.nextInt();

                    if (value==1){
                        caseList.add("HardShellCase");
                        System.out.println("Hard Shell is picked");
                    } else if (value == 2) {
                        caseList.add("LeatherCase");
                        System.out.println("Leather case is picked");
                    } else {
                        break;
                    }
                }

                System.out.println("Case selection completed");
                System.out.println("");

                String[] processorArr = new String[processorList.size()];
                processorArr = processorList.toArray(processorArr);

                String[] memoryArr = new String[memoryList.size()];
                memoryArr = memoryList.toArray(memoryArr);

                String[] storageArr = new String[storageList.size()];
                storageArr = storageList.toArray(storageArr);

                String[] caseArr = new String[caseList.size()];
                caseArr = caseList.toArray(caseArr);

                MacOrderCommand macOrderCommand = new MacOrderCommand(assembler,macbookProSize,processorArr,memoryArr,storageArr,caseArr);

                cart.addToCart(macOrderCommand);

            } else {
                System.out.println("----------------");
                System.out.println("Thank you for shopping at the Apple Store!");
                break;
            }
        }
    }
}
