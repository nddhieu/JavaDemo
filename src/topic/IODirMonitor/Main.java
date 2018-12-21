package topic.IODirMonitor;

public class Main {

    public static void main(String[] args) {
//        order orderfood = new order();
//        orderfood.addItemBoilSeafood("crawfish");
        IODirMonitor dirMonitor = new IODirMonitor();
        dirMonitor.init();
        dirMonitor.doRounds();

    }
}
