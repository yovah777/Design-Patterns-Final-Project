package Order;


/**
 * Represents an Iphone order that holds the details of
 * what type of Iphone is ordered and sends it to the Order.Assembler.
 */
public class IphoneOrder implements OrderCommand {
    Assembler assembler;
    String order;

    /**
     * Creates an Iphone order and identifies the assembler that will receive
     * the order.
     * @param assembler  Will Assemble package.
     * @param order     Will hold details of what type of Iphone.
     */
    public IphoneOrder(Assembler assembler, String order){
        this.assembler = assembler;
        this.order = order;
    }

    @Override
    public void sendOrder(){
        assembler.sendOrder("Iphone", order);
    }

    public double getIphoneCost() {
        return assembler.getIphoneCost();
    }
}
