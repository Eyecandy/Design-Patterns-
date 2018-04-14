package adapter;

import javax.crypto.Mac;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(adapter.Main.class.getName());
    public static void main(String[] args) {
        MacBookPro macBookPro = new MacBookPro(new USBPort());
        USBPort usbPort = macBookPro.getUsbPort();

        usbPort.PlugIn(new USBPlug("Mouse"));
        LOGGER.info(usbPort.getConnected());
        LOGGER.info(usbPort.watchTV());

        usbPort.removePlug();
        LOGGER.info(usbPort.getConnected());
        LOGGER.info(usbPort.watchTV());


        usbPort.PlugIn(new HDMICable().useAdapter());
        LOGGER.info(usbPort.getConnected());
        LOGGER.info(usbPort.watchTV());










    }
}
