import smartApp.SmartApp;
import smartApp.SmartAppCaretaker;

public class Main {
    public static void main(String[] args) {

        SmartAppCaretaker smartAppCareTaker = new SmartAppCaretaker();
        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);

        smartAppCareTaker.addMemento(smartApp.save());

        smartApp.changeVersion(1.3);
        smartApp.changeVersion(2.0);
        smartApp.changeVersion(2.1);

        smartApp.load(smartAppCareTaker.getMemento(0));
    }
}
