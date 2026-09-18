package abstractfactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        String vendorConfig = "xiaomi"; // or "philips"
        SmartHomeFactory factory;

        if (vendorConfig.equalsIgnoreCase("xiaomi")) {
            factory = new XiaomiHomeFactory();
        } else {
            factory = new PhilipsHueFactory();
        }

        SmartHubClient hub = new SmartHubClient(factory);
        hub.runAutomationRoutine();
    }
}