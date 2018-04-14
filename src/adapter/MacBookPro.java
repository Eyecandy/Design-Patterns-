package adapter;

/**
 * The newer Mac Book Pro is not compatible with HDMI cable by default.
 * However it is compatible with USB.
 * All we need to do is to attach an adapter to the HDMI and plug it into the USB of the Mac.
 */
public class MacBookPro {
    private USBPort usbPort;

    private MacBookPro() {}

    MacBookPro(USBPort usbPort) {
        this.usbPort = usbPort;
    }

    public USBPort getUsbPort() {
        return usbPort;
    }
}
