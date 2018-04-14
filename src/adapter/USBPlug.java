package adapter;

/**
 * A compatible plug for MacBook
 * It has a type. i.e it can be a Mouse, a KeyBoard or an HDMI adapter.
 */
public class USBPlug {
    private String type;

    private USBPlug() {}

    USBPlug(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


}
