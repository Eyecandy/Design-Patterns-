package adapter;

/**
 * The HDMI cable can not usually be used with a mac.
 * Hence it implement the HDMI adapter interface.
 */
public class HDMICable implements HDMIAdapter{

    /**
     * This method is required by the HDMIAdapter
     * @return a new USBPlug I.e the adapter's plug. which can be used on a MacBookPro.
     *
     */
    @Override
    public USBPlug useAdapter() {
        return new USBPlug("HDMI cable with adapter");
    }

    @Override
    public String watchTV() {
        return null;
    }


}
