package Mac.MacDecorator;
import Mac.Mac;

public class HardShellCase extends CaseDecorator{

    Mac mac;

    public HardShellCase(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 49.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", Hardshell Case ";
    }
}
