package main;
//Invoker
public class Cart {
    OrderCommand appleCommand;

    public void addToCart(OrderCommand a){
        appleCommand = a;
        appleCommand.sendOrder(); //Calling on OrderCommand interface
    }
}
