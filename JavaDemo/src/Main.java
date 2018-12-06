import topic.IODirMonitor;
import topic.order;
public class Main {

    public static void main(String[] args) {
//        order orderfood = new order();
//        orderfood.addItemBoilSeafood("crawfish");
        IODirMonitor dirMonitor = new IODirMonitor();
        dirMonitor.init();
        dirMonitor.doRounds();

    }
}
