package adapter;



public class USBPort implements HDMIAdapter{
    private String connected = "No USB plug connected";
    String device;


    void  PlugIn(USBPlug usBplug) {
        device = usBplug.getType();
        connected = device + " is Connected";
    }

    void removePlug() {
        device = null;
        connected = "No USB plug connected";
    }


    public String getConnected() {
        return connected;
    }

    @Override
    public USBPlug useAdapter() {
        return null;
    }

    @Override
    public String watchTV() {
        if (this.device == null) {
            return "Nothing connected, can't watch TV";
        }
        else if (this.device.equals("HDMI cable with adapter")) {
            return "You can watch TV with "+ device;
        }
        else {
           return  "You can not watch tv with a " + device;
        }
    }

}
