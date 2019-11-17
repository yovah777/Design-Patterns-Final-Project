public class IphoneOrder implements OrderCommand {
    Assembler assembler;
    String order;
    public IphoneOrder(Assembler assembler, String order){
        this.assembler = assembler;
        this.order = order;
    }

    @Override
    public void sendOrder(){
        assembler.iPhoneModel = order;
        assembler.sendOrder("Iphone");
    }
}
