public class USBTypeCToUSB2Adapter implements USB2Port {
    private USBTypeC usbTypeCDevice;

    public USBTypeCToUSB2Adapter(USBTypeC usbTypeCDevice) {
        this.usbTypeCDevice = usbTypeCDevice;
    }

    @Override
    public void connectWithUSB2() {
        System.out.println("Using adapter to connect USB Type-C device to USB 2.0 port");
        usbTypeCDevice.connectWithTypeC();
    }
}
