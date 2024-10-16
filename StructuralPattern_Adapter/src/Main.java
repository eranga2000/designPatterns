public class Main {
    public static void main(String[] args) {
        USBTypeC usbTypeCDevice = new USBTypeCDevice();
        USB2Port usb2Port = new USBTypeCToUSB2Adapter(usbTypeCDevice);

        usb2Port.connectWithUSB2();
    }
}