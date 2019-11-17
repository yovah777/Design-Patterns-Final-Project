package Mac.MacDecorator;
import Mac.Mac;

public class I9Processor extends ProcessorDecorator{

    Mac mac;

    public I9Processor(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 300.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", I9 processor";
    }
}
