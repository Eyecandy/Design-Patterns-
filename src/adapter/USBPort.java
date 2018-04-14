package adapter;

/**
 * Where we plug in the USB plug
 * it has a status (connected, or not connected)
 * it has a device, i.e the device connected, null if nothing connected.
 *
 */

public class USBPort implements HDMIAdapter{

    private String status = "No USB plug status";
    String device;


    /**Take is a USBPlug and updated device + status.
     * @param usBplug
     */
    void  PlugIn(USBPlug usBplug) {
        device = usBplug.getType();
        status = device + " is Connected";
    }

    /**
     * Removes the plug from the port.
     */
    void removePlug() {
        device = null;
        status = "No USB plug status";
    }


    public String getStatus() {
        return status;
    }

    /**
     * Not used here.
     * @return
     */
    @Override
    public USBPlug useAdapter() {
        return null;
    }

    /**
     * A function which decides wether or not you can watch TV.
     * Can only watch if an HDMI and an adapater is connected.
     * @return String message telling giving info about the eligibility of watching TV.
     */
    @Override
    public String watchTV() {
        if (this.device == null) {
            return "Nothing status, can't watch TV";
        }
        else if (this.device.equals("HDMI cable with adapter")) {
            return "You can watch TV with "+ device;
        }
        else {
           return  "You can not watch tv with a " + device;
        }
    }

}
